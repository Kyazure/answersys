package com.yeqi.answersys.user.service.impl;

import com.yeqi.answersys.user.dao.QsUserMapper;
import com.yeqi.answersys.user.entity.QsUser;
import com.yeqi.answersys.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @ClassName:UserServiceImpl
 * @author: yeqi
 * @create: 2020/1/6 19:55
 * @description
 */

@Service
public class UserServiceImpl implements UserService {

    private final QsUserMapper qsUserMapper;

    //private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(QsUserMapper qsUserMapper) {
        this.qsUserMapper = qsUserMapper;
    }


    @Override
    public ResponseEntity<?> insert(QsUser qsUser) {
        qsUser.setUsername(qsUser.getUsername());
        qsUser.setPassword(qsUser.getPassword());
        qsUser.setGrade(qsUser.getGrade());
        if (qsUserMapper.insert(qsUser) > 0) {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Override
    public ResponseEntity<?> deleteByPrimaryKey(Integer id) {
        if (qsUserMapper.deleteByPrimaryKey(id) != 0) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<?> listQsUser() {
        List<QsUser> qsUserList = qsUserMapper.listQsUser();
        if (!qsUserList.isEmpty()) {
            return ResponseEntity.ok(qsUserList);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @Override
    public ResponseEntity<?> updateByPrimaryKeySelective(QsUser qsUser) {
        if (qsUser.getId() != null || qsUser.getUsername() != null || qsUser.getPassword() != null || qsUser.getGrade() != null) {
            if (qsUserMapper.updateByPrimaryKeySelective(qsUser) != 0) {
                return ResponseEntity.status(HttpStatus.CREATED).build();
            } else {
                return ResponseEntity.badRequest().build();
            }
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
