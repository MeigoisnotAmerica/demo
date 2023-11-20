package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.PersonInfoDao;

import java.util.List;

@Service
public class PersonInfoImpl {

    @Autowired
    private PersonInfoDao personInfoDao;

    public void addPersonInfo(PersonInfo personInfo) {
        personInfoDao.save(personInfo);
    }
}
 
