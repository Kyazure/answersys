package com.yeqi.answersys.user.controller;

import com.yeqi.answersys.user.entity.QsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    public void deleteByPrimaryKey() {
        System.out.println(userController.deleteByPrimaryKey(1));
    }

    @Test
    public void insert(){
        QsUser qsUser = new QsUser();
        qsUser.setId(2);
        qsUser.setUsername("17346628966");
        qsUser.setPassword("666666");
        qsUser.setGrade(100);
        System.out.println(userController.insert(qsUser));
    }

    @Test
    public void listAllUser(){
        System.out.println(userController.listAllUser());
    }

    @Test
    public void updateByPrimaryKeySelective(){
        QsUser qsUser = new QsUser();
        qsUser.setId(5);
        qsUser.setUsername("22342223456");
        qsUser.setPassword("000");
        System.out.println(userController.updateByPrimaryKeySelective(qsUser));
    }

}