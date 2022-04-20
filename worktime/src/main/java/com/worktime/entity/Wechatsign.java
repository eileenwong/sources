package com.worktime.entity;

import java.io.Serializable;

public class Wechatsign implements Serializable {

    private static final long serialVersionUID = 164965970089304877L;

    //
    private String employeeid;

    //
    private String employeename;

    //
    private int id;

    //
    private java.util.Date signdate;

    //
    private String signfacttimefrom;

    //
    private String signfacttimeto;

    /**
    * get
    * @param @return   
    * @return String 
    */
    public String getEmployeeid(){
        return employeeid;
    }

    /**
    * set
    * @param employeeid   
    * @return void
    */
    public void setEmployeeid(String employeeid){
        this. employeeid = employeeid;
    }

    /**
    * get
    * @param @return   
    * @return String 
    */
    public String getEmployeename(){
        return employeename;
    }

    /**
    * set
    * @param employeename   
    * @return void
    */
    public void setEmployeename(String employeename){
        this. employeename = employeename;
    }

    /**
    * get
    * @param @return   
    * @return int 
    */
    public int getId(){
        return id;
    }

    /**
    * set
    * @param id   
    * @return void
    */
    public void setId(int id){
        this. id = id;
    }

    /**
    * get
    * @param @return   
    * @return java.util.Date 
    */
    public java.util.Date getSigndate(){
        return signdate;
    }

    /**
    * set
    * @param signdate   
    * @return void
    */
    public void setSigndate(java.util.Date signdate){
        this. signdate = signdate;
    }

    /**
    * get
    * @param @return   
    * @return String 
    */
    public String getSignfacttimefrom(){
        return signfacttimefrom;
    }

    /**
    * set
    * @param signfacttimefrom   
    * @return void
    */
    public void setSignfacttimefrom(String signfacttimefrom){
        this. signfacttimefrom = signfacttimefrom;
    }

    /**
    * get
    * @param @return   
    * @return String 
    */
    public String getSignfacttimeto(){
        return signfacttimeto;
    }

    /**
    * set
    * @param signfacttimeto   
    * @return void
    */
    public void setSignfacttimeto(String signfacttimeto){
        this. signfacttimeto = signfacttimeto;
    }

}