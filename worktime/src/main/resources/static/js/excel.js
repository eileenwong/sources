/**
 * 导出费用明细数据
 */
function exportFeeDetail(){
    //导出前校验是否已查询出列表
    var nextElement = $("#feeDetailReveal").next().length;
    if(nextElement === 0){
        layer.alert("请查询后再进行导出！",{icon: 4});
        return;
    }
    //查询条件
    let postData = {};
    //获取港口查询条件
    postData.cntrPort = $("#port").val().trim();
    //校验输入的箱号是否存在SQL注入风险,返回true表示存在风险
    if (checkSqlIn($("#cntrNo").val().trim())) {
        return false;
    }
    //获取箱号查询条件，长度超过11为走模糊查询
    if ($("#cntrNo").val().trim().length > 11) {
        postData.cntrNo = moreItems($("#cntrNo").val().trim());
    } else {
        postData.cntrNo = $("#cntrNo").val().trim();
    }
    //获取运单号条件
    postData.billNo = $("#billNo").val().trim();
    //获取船名条件
    postData.vessel = $("#vessel").val().trim();
    //获取航次条件
    postData.voyage = $("#voyage").val().trim();
    //获取费目条件
    postData.feeCode = $("#feeCode").val().trim();
    //获取费目进出口条件
    postData.ieFlag = $("#FeeCodeIEFlag").val().trim();
    //获取换单车队条件
    postData.fleetAnotName = $("#fleetAnotName").val().trim();
    //获取卸船时间起条件
    postData.dischargeTimeStart = $("#dischargeTimeStart").val().trim();
    //获取卸船时间止条件
    postData.dischargeTimeEnd = $("#dischargeTimeEnd").val().trim();
    //获取提箱时间起条件
    postData.tackOutTimeStart = $("#tackOutTimeStart").val().trim();
    //获取提箱时间止条件
    postData.tackOutTimeEnd = $("#tackOutTimeEnd").val().trim();
    //获取费用生成时间起条件
    postData.feeGenerateTimeStart = $("#feeGenerateTimeStart").val().trim();
    //获取费用生成时间止条件
    postData.feeGenerateTimeEnd = $("#feeGenerateTimeEnd").val().trim();
    //获取收费金额起条件
    postData.accountReceivableActualStart = $("#amountAfterDiscountStart").val().trim();
    //获取收费金额止条件
    postData.accountReceivableActualEnd = $("#amountAfterDiscountEnd").val().trim();
    postData.feeStatus = $("#feeStatus").val().trim();
    //异常结束标识
    let abendFlag = false;
    //查询需要导出的数据数量
    $.ajax({
        url: '/cntrFee/feeDetailReveal/getFeeDetailNumber',
        type: 'post',
        dataType: 'text',
        cache: false,
        async:false,
        contentType: 'application/json;charset=UTF-8',
        data: JSON.stringify(postData),
        success: function (data) {
            //提取费用明细数量
            let feeDetailNumber = parseInt(data);
            if(feeDetailNumber === 0){
                layer.msg("数据量为0，导出失败！",{
                    time: 3000,
                    icon: 2
                })
                //异常结束
                abendFlag = true;
                //只结束success方法
                return;
                layer.closeAll();
            }else if(feeDetailNumber >= 89999){
                layer.msg("数据量不能超过89999条，导出失败,请修改查询条件之后再进行导出！",{
                    time: 3000,
                    icon: 2
                })
                //异常结束
                abendFlag = true;
                return;
                layer.closeAll();
            }
        },error:function (data){
            layer.msg("系统错误，导出失败！",{
                time: 3000,
                icon: 2
            })
            //异常结束
            abendFlag = true;
            return;
            layer.closeAll();
        }
    });
    //判定是否异常终止，如果异常终止则不再继续向下执行
    if(abendFlag){
        return;
    }
    let index = layer.load(1);
    axios({
        url: '/cntrFee/feeDetailReveal/exportExcel',
        method: 'post',
        /// `data` 是作为请求主体被发送的数据
        // 只适用于这些请求方法 'PUT', 'POST', 和 'PATCH'
        // 在没有设置 `transformRequest` 时，必须是以下类型之一：
        // - string, plain object, ArrayBuffer, ArrayBufferView, URLSearchParams
        // - 浏览器专属：FormData, File, Blob
        // - Node 专属： Stream
        data: postData,
        // `responseType` 表示服务器响应的数据类型，可以是 'arraybuffer', 'blob', 'document', 'json', 'text', 'stream'
        responseType: 'blob',
    }).then((res) => {
        if (0 < res.data.size) {
            const link = document.createElement('a');
            const blob = new Blob([res.data], {type: 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'})
            link.style.display = 'none';
            link.href = URL.createObjectURL(blob);
            link.setAttribute('download', `费用明细.xlsx`);
            document.body.appendChild(link);
            link.click();
            document.body.removeChild(link);
        }
        layer.close(index);
    });
    layer.close(index);
}