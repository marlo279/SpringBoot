package com.marlo.iac.model;

import java.util.Calendar;
import java.util.Date;

public class MyInfo {


    private Date currentDate;
    private String name;

    public MyInfo() {
    }

    public MyInfo(String name) {
        this.currentDate = Calendar.getInstance().getTime();
        this.name = name;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate() {
        this.currentDate = Calendar.getInstance().getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
