package com.worktime.entity;

import java.io.Serializable;

public class Goout implements Serializable {

    private static final long serialVersionUID = 164965960809717701L;

    //
    private String employeeid;

    //
    private String employeename;

    //
    private int id;

    //
    private java.util.Date outdate;

    //
    private double outday;

    //
    private double outhour;

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
    public java.util.Date getOutdate(){
        return outdate;
    }

    /**
    * set
    * @param outdate   
    * @return void
    */
    public void setOutdate(java.util.Date outdate){
        this. outdate = outdate;
    }

    /**
    * get
    * @param @return   
    * @return double 
    */
    public double getOutday(){
        return outday;
    }

    /**
    * set
    * @param outday   
    * @return void
    */
    public void setOutday(double outday){
        this. outday = outday;
    }

    /**
    * get
    * @param @return   
    * @return double 
    */
    public double getOuthour(){
        return outhour;
    }

    /**
    * set
    * @param outhour   
    * @return void
    */
    public void setOuthour(double outhour){
        this. outhour = outhour;
    }

}