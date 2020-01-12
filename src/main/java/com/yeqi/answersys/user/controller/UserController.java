package com.yeqi.answersys.user.controller;

import com.yeqi.answersys.user.entity.QsUser;
import com.yeqi.answersys.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @ClassName:UserController
 * @author: yeqi
 * @create: 2020/1/6 20:05
 * @description
 */
@RestController
@RequestMapping("/api/v2/user")
@Api("用户操作接口")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping
    @ApiOperation(value = "删除用户，通过id")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
    public ResponseEntity<?> deleteByPrimaryKey(@RequestParam Integer id) {
        return userService.deleteByPrimaryKey(id);
    }

    @PostMapping("/register")
    @ApiOperation(value = "注册", response = QsUser.class)
    public ResponseEntity<?> insert(@RequestBody QsUser qsUser) {
        String username = qsUser.getUsername();
        //规定用户名为手机号
        String pattern = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
        if (Pattern.matches(pattern, username)) {
            return userService.insert(qsUser);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    /*
    查询所有用户的信息
     */
    @GetMapping
    @ApiOperation(value = "查询所有用户的信息", response = QsUser.class)
    public ResponseEntity<?>listAllUser(){
        return userService.listQsUser();
    }

    /*
    通过id有选择的更新用户信息
     */
    @PostMapping("/update")
    @ApiOperation(value = "更新用户信息,通过id", response = QsUser.class)
    public ResponseEntity<?> updateByPrimaryKeySelective(@RequestBody QsUser qsUser){
        return userService.updateByPrimaryKeySelective(qsUser);
    }



}
