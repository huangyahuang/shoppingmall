package com.example.shoppingmall.user.controller

import com.example.shoppingmall.user.entity.UserEntity
import com.example.shoppingmall.user.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user/")
class UserController {
    @Autowired
    lateinit  var iUserService: IUserService

    @RequestMapping("save")
    fun getUserList():List<UserEntity>{
        return iUserService.queryAll();
    }
}