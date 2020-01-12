package com.yeqi.answersys.choiceques.service;

import org.springframework.http.ResponseEntity;

/**
 * @author yeqi
 */
public interface ChoicequesService {
    /*
    查询出题目
     */
    ResponseEntity<?> selectByPrimaryKey(Integer id);

    /*
    随机查询4条题目信息
     */
    ResponseEntity<?> selectRandByPrimaryKey();
}
