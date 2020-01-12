package com.yeqi.answersys.choiceques.dao;

import com.yeqi.answersys.choiceques.entity.ChoiceQuestion;
import com.yeqi.answersys.choiceques.entity.ChoiceQuestionExample;
import com.yeqi.answersys.choiceques.entity.ChoiceQuestionWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChoiceQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChoiceQuestionWithBLOBs record);

    int insertSelective(ChoiceQuestionWithBLOBs record);

    List<ChoiceQuestionWithBLOBs> selectByExampleWithBLOBs(ChoiceQuestionExample example);

    List<ChoiceQuestion> selectByExample(ChoiceQuestionExample example);

    ChoiceQuestionWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * 随机查询4条题目信息
     * @return 4条题目信息
     */
    List<ChoiceQuestion> selectRandByPrimaryKey();

    int updateByPrimaryKeySelective(ChoiceQuestionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ChoiceQuestionWithBLOBs record);

    int updateByPrimaryKey(ChoiceQuestion record);
}