package com.worktime.entity;

import java.io.Serializable;

public class DepartUser implements Serializable {

    private static final long serialVersionUID = 164965956561722275L;

    //
    private String departmentname;

    //
    private double departtime;

    //
    private String employeeid;

    //
    private String employeename;

    //
    private double facttime;

    //
    private String fullwork;

    //
    private String holidaytype;

    //
    private String managerflg;

    //
    private String needsflg;

    //
    private String teamname;

    //
    private int teamno;

    //
    private double worktime;

    /**
    * get
    * @param @return   
    * @return String 
    */
    public String getDepartmentname(){
        return departmentname;
    }

    /**
    * set
    * @param departmentname   
    * @return void
    */
    public void setDepartmentname(String departmentname){
        this. departmentname = departmentname;
    }

    /**
    * get
    * @param @return   
    * @return double 
    */
    public double getDeparttime(){
        return departtime;
    }

    /**
    * set
    * @param departtime   
    * @return void
    */
    public void setDeparttime(double departtime){
        this. departtime = departtime;
    }

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
    * @return double 
    */
    public double getFacttime(){
        return facttime;
    }

    /**
    * set
    * @param facttime   
    * @return void
    */
    public void setFacttime(double facttime){
        this. facttime = facttime;
    }

    /**
    * get
    * @param @return   
    * @return String 
    */
    public String getFullwork(){
        return fullwork;
    }

    /**
    * set
    * @param fullwork   
    * @return void
    */
    public void setFullwork(String fullwork){
        this. fullwork = fullwork;
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
    * @return String 
    */
    public String getManagerflg(){
        return managerflg;
    }

    /**
    * set
    * @param managerflg   
    * @return void
    */
    public void setManagerflg(String managerflg){
        this. managerflg = managerflg;
    }

    /**
    * get
    * @param @return   
    * @return String 
    */
    public String getNeedsflg(){
        return needsflg;
    }

    /**
    * set
    * @param needsflg   
    * @return void
    */
    public void setNeedsflg(String needsflg){
        this. needsflg = needsflg;
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

    /**
    * get
    * @param @return   
    * @return int 
    */
    public int getTeamno(){
        return teamno;
    }

    /**
    * set
    * @param teamno   
    * @return void
    */
    public void setTeamno(int teamno){
        this. teamno = teamno;
    }

    /**
    * get
    * @param @return   
    * @return double 
    */
    public double getWorktime(){
        return worktime;
    }

    /**
    * set
    * @param worktime   
    * @return void
    */
    public void setWorktime(double worktime){
        this. worktime = worktime;
    }

}