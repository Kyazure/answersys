package com.yeqi.answersys.user.service;

import com.yeqi.answersys.user.entity.QsUser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author yeqi
 */
public interface UserService {

    /*
    插入用户
     */
    ResponseEntity<?> insert(QsUser qsUser);

    /*
    通过id删除用户
     */
    ResponseEntity<?> deleteByPrimaryKey(Integer id);

    /*
    查询所有用户的信息
     */
    ResponseEntity<?> listQsUser();

    /*
    根据id更新用户信息（有选择的更新）
     */
    ResponseEntity<?> updateByPrimaryKeySelective(QsUser qsUser);
}
