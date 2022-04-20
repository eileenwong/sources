package com.worktime.entity;

import java.io.Serializable;

public class Phonesign implements Serializable {

    private static final long serialVersionUID = 164965964460009142L;

    //
    private String employeeid;

    //
    private String employeename;

    //
    private String holidaytype;

    //
    private int id;

    //
    private java.util.Date signdate;

    //
    private String signtimefrom;

    //
    private String signtimeto;

    //
    private String teamname;

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
    * @return String 
    */
    public String getHolidaytype(){
        return holidaytype;
    }

    /**
    * set
    * @param holidaytype   
    * @return void
    */
    public void setHolidaytype(String holidaytype){
        this. holidaytype = holidaytype;
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
    public String getSigntimefrom(){
        return signtimefrom;
    }

    /**
    * set
    * @param signtimefrom   
    * @return void
    */
    public void setSigntimefrom(String signtimefrom){
        this. signtimefrom = signtimefrom;
    }

    /**
    * get
    * @param @return   
    * @return String 
    */
    public String getSigntimeto(){
        return signtimeto;
    }

    /**
    * set
    * @param signtimeto   
    * @return void
    */
    public void setSigntimeto(String signtimeto){
        this. signtimeto = signtimeto;
    }

    /**
    * get
    * @param @return   
    * @return String 
    */
    public String getTeamname(){
        return teamname;
    }

    /**
    * set
    * @param teamname   
    * @return void
    */
    public void setTeamname(String teamname){
        this. teamname = teamname;
    }

}