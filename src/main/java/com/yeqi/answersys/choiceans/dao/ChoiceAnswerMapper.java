package com.yeqi.answersys.choiceans.dao;

import com.yeqi.answersys.choiceans.entity.ChoiceAnswer;
import com.yeqi.answersys.choiceans.entity.ChoiceAnswerExample;
import com.yeqi.answersys.choiceans.entity.ChoiceAnswerKey;
import java.util.List;

public interface ChoiceAnswerMapper {
    int deleteByPrimaryKey(ChoiceAnswerKey key);

    int insert(ChoiceAnswer record);

    int insertSelective(ChoiceAnswer record);

    List<ChoiceAnswer> selectByExample(ChoiceAnswerExample example);

    ChoiceAnswer selectByPrimaryKey(ChoiceAnswerKey key);

    int updateByPrimaryKeySelective(ChoiceAnswer record);

    int updateByPrimaryKey(ChoiceAnswer record);
}