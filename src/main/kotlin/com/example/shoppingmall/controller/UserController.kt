package com.example.shoppingmall.controller

import com.example.shoppingmall.common.AjaxJson
import com.example.shoppingmall.entity.UserEntity
import com.example.shoppingmall.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user/")
class UserController {
    @Autowired
    lateinit  var iUserService: IUserService

    /*
    * 后台查询所有用户信息
    * */
    @RequestMapping("getAll")
    fun getAll(page: Int,size: Int): Page<UserEntity> {
        return iUserService.getAll(page,size);
    }

    /*
    * 修改用户信息
    * */
    @RequestMapping("addOrUpdateUser")
    fun updateUser(user : UserEntity): AjaxJson {
        var ajaxJson = AjaxJson()
        try {
            iUserService.saveOrUpdateUser(user)
        } catch (e: Exception) {
            ajaxJson.msg = "修改失败"
        }
        return ajaxJson;
    }

    /*
    * 删除用户
    * */
    @RequestMapping("delectByIdUser")
    fun delectByIdUser(id : Int): AjaxJson{
        var ajaxJson = AjaxJson();
        try {
            iUserService.delectByIdUser(id)
        } catch (e: Exception) {
            ajaxJson.msg = "用户删除失败";
        }
        return ajaxJson;
    }



}