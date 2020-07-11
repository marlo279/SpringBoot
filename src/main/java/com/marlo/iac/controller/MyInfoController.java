package com.marlo.iac.controller;


import com.marlo.iac.model.MyInfo;
import com.marlo.iac.service.MyInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("/MyInfo")
@RestController
public class MyInfoController {

    private final MyInfoService myInfoService = new MyInfoService();

    @GetMapping("/current-date")
    public String getCurrentDate(){

        Date date = myInfoService.getCurrentDate();

        return date.toString();
    }


    @PostMapping("/welkom")
    public String salutePerson(@RequestBody MyInfo myInfo){

        MyInfo tempMyInfo = new MyInfo( myInfo.getName() );

        return "Welkom " + tempMyInfo.getName();
    }

    @GetMapping("/doei")
    public String doei(){



        return "Doei";
    }





}
