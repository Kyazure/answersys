package com.yeqi.answersys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yeqi
 */
@EnableTransactionManagement
@MapperScan("com.yeqi.answersys.*.dao")
@SpringBootApplication
public class AnswersysApplication {

    public static void main(String[] args) {
//        SpringApplication.run(AnswersysApplication.class, args);
        try {
            SpringApplication.run(AnswersysApplication.class,args);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
