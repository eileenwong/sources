package com.worktime.entity;

import java.io.Serializable;

public class Holiday implements Serializable {

    private static final long serialVersionUID = 164965962129711297L;

    //
    private String dayflg;

    //
    private String daytype;

    //
    private java.util.Date holiday;

    //
    private String holidayname;

    //
    private int id;

    /**
    * get
    * @param @return   
    * @return String 
    */
    public String getDayflg(){
        return dayflg;
    }

    /**
    * set
    * @param dayflg   
    * @return void
    */
    public void setDayflg(String dayflg){
        this. dayflg = dayflg;
    }

    /**
    * get
    * @param @return   
    * @return String 
    */
    public String getDaytype(){
        return daytype;
    }

    /**
    * set
    * @param daytype   
    * @return void
    */
    public void setDaytype(String daytype){
        this. daytype = daytype;
    }

    /**
    * get
    * @param @return   
    * @return java.util.Date 
    */
    public java.util.Date getHoliday(){
        return holiday;
    }

    /**
    * set
    * @param holiday   
    * @return void
    */
    public void setHoliday(java.util.Date holiday){
        this. holiday = holiday;
    }

    /**
    * get
    * @param @return   
    * @return String 
    */
    public String getHolidayname(){
        return holidayname;
    }

    /**
    * set
    * @param holidayname   
    * @return void
    */
    public void setHolidayname(String holidayname){
        this. holidayname = holidayname;
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

}