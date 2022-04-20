package com.worktime.entity;

import java.io.Serializable;

public class SecondBuilding implements Serializable {

    private static final long serialVersionUID = 164965965899700385L;

    //
    private String employeeid;

    //
    private String employeename;

    //
    private int id;

    //
    private java.util.Date signdate;

    //
    private String signfacttime;

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
    public String getSignfacttime(){
        return signfacttime;
    }

    /**
    * set
    * @param signfacttime   
    * @return void
    */
    public void setSignfacttime(String signfacttime){
        this. signfacttime = signfacttime;
    }

}