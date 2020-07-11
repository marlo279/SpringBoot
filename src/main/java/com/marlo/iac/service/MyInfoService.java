package com.marlo.iac.service;

import com.marlo.iac.model.MyInfo;

import java.util.Date;

public class MyInfoService {

    private MyInfo myInfo;

    public Date getCurrentDate() {

        myInfo = new MyInfo();
        myInfo.setCurrentDate();
        Date date = myInfo.getCurrentDate();

        return date;
    }

    public String salutePerson(String name) {
        return name;
    }


}
