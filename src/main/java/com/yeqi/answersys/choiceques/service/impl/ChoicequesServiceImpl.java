package com.yeqi.answersys.choiceques.service.impl;

import com.yeqi.answersys.choiceques.dao.ChoiceQuestionMapper;
import com.yeqi.answersys.choiceques.entity.ChoiceQuestion;
import com.yeqi.answersys.choiceques.service.ChoicequesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @ClassName:ChoicequesServiceImpl
 * @author: yeqi
 * @create: 2020/1/10 11:08
 * @description
 */

@Service
public class ChoicequesServiceImpl implements ChoicequesService {

    @Autowired
    private ChoiceQuestionMapper choiceQuestionMapper;

    @Override
    public ResponseEntity<?> selectByPrimaryKey(Integer id) {
        ChoiceQuestion choiceQuestion = new ChoiceQuestion();
        choiceQuestion = choiceQuestionMapper.selectByPrimaryKey(1);
        return ResponseEntity.ok(choiceQuestion);
    }

    @Override
    public ResponseEntity<?> selectRandByPrimaryKey() {
        List<ChoiceQuestion> questionEntityList = choiceQuestionMapper.selectRandByPrimaryKey();
        if (!questionEntityList.isEmpty()){
            return ResponseEntity.ok(questionEntityList);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
