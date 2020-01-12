package com.yeqi.answersys.choiceques.controller;

import com.yeqi.answersys.choiceques.entity.ChoiceQuestion;
import com.yeqi.answersys.choiceques.service.ChoicequesService;
import com.yeqi.answersys.user.entity.QsUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @ClassName:ChoicequesController
 * @author: yeqi
 * @create: 2020/1/10 11:34
 * @description
 */

@RestController
@RequestMapping("/api/v2/question")
@Api("题目接口")
public class ChoicequesController {

    @Autowired
    private ChoicequesService choicequesService;

    /*
   查询题目的信息 通过id
    */
    @GetMapping
    @ApiOperation(value = "通过id查询题目的信息", response = ChoiceQuestion.class)
    public ResponseEntity<?> selectByPrimaryKey(@RequestParam Integer id) {
        return choicequesService.selectByPrimaryKey(id);
    }

    /*
    随机查询4条题目的信息 通过id
    */
    @GetMapping("/question")
    @ApiOperation(value = "随机查询4条题目信息", response = ChoiceQuestion.class)
    public ResponseEntity<?> selectRandByPrimaryKey() {
        return choicequesService.selectRandByPrimaryKey();
    }
}
