package com.worktime.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {

    private static final long serialVersionUID = 164966103312707513L;

    //
    @ExcelIgnore
    private Integer id;

    //
    @ExcelProperty("用户名")
    private String workNumber;

    //
    @ExcelProperty("密码")
    private String passWord;

    //
    @ExcelProperty("权限")
    private int power;

}