package com.yeqi.answersys.choiceques.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChoicequesControllerTest {

    @Autowired
    private ChoicequesController choicequesController;

    @Test
    public void selectByPrimaryKey() {
        System.out.println(choicequesController.selectByPrimaryKey(1));
    }

    @Test
    public void selectRandByPrimaryKey(){
        System.out.println(choicequesController.selectRandByPrimaryKey());
    }
}