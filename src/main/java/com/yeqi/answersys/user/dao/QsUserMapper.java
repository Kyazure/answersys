package com.yeqi.answersys.user.dao;

import com.yeqi.answersys.user.entity.QsUser;
import com.yeqi.answersys.user.entity.QsUserExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QsUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QsUser qsUser);

    List<QsUser> listQsUser();

    int insertSelective(QsUser qsUser);

    List<QsUser> selectByExample(QsUserExample qsUserExample);

    QsUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QsUser qsUser);

    int updateByPrimaryKey(QsUser qsUser);
}