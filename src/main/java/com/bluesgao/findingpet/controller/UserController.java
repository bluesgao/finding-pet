package com.bluesgao.findingpet.controller;


import com.alibaba.fastjson.JSON;
import com.bluesgao.findingpet.common.Result;
import com.bluesgao.findingpet.entity.User;
import com.bluesgao.findingpet.service.IUserService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author bluesgao
 * @since 2018-11-15
 */
@RestController
@Data
@Slf4j
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/user/all")
    public Result<List<User>> allUser() {
        List<User> userList = iUserService.list(null);
        log.info("allUser:{}", JSON.toJSON(userList));

        if (CollectionUtils.isEmpty(userList)) {
            return Result.failResult(null);
        }
        return Result.successResult(userList);
    }

    @GetMapping("/user/{uerId}")
    public Result<User> getUserById(@PathVariable("uerId") Long userId) {
        if (userId == null) {
            return Result.paramsErrorResult(null);
        }
        User user = iUserService.getById(userId);
        if (user == null) {
            return Result.failResult(userId);
        }
        return Result.successResult(user);
    }

    @PutMapping("/user/{uerId}")
    public Result updateUserById(User user){
        if (user == null || user.getUserId() == null){
            return Result.paramsErrorResult(user);
        }
        boolean result = iUserService.updateById(user);
        if (result){
            return Result.successResult(user);
        }else{
            return Result.failResult(user);
        }
    }

}
