package com.example.shoppingmall.controller

import com.example.shoppingmall.common.AjaxJson
import com.example.shoppingmall.entity.UserEntity
import com.example.shoppingmall.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("index/")
class LoginController {

    @Autowired
    lateinit var iUserService: IUserService;

    /*
    * 后台管理员登录验证
    * account 账号
    * password 密码
    * */
    @RequestMapping("checkuser")
    fun login(account: String, password: String): AjaxJson {
        var ajaxJson = AjaxJson();
        try {
            var user = iUserService.queryAccount(account, password, 2);
            if (null == user) {
                ajaxJson.msg = "用户名或密码不正常";
            }
        } catch (e: Exception) {
            ajaxJson.msg = e.message.toString();
        }
        return ajaxJson;
    }

    /*
    * 用户注册
    * userType不为空是后台管理用户
    * */
    @RequestMapping("register")
    fun register(userEntity: UserEntity): AjaxJson {
        var ajaxJson = AjaxJson();
        try {
            var user = iUserService.saveOrUpdateUser(userEntity);
            if (null == user) {
                ajaxJson.msg = "用户注册失败";
            }
        } catch (e: Exception) {
            ajaxJson.msg = e.message.toString();
        }
        return ajaxJson
    }

}