package com.example.shoppingmall.entity

import lombok.Data
import org.hibernate.annotations.Table
import java.util.Date
import javax.persistence.*

/*
* 用户管理
* */
@Entity(name="mall_user")
@Table(appliesTo = "mall_user")
@Data
class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable=false)
    var id : Int  = 0;

    @Column(name = "account",nullable=false)
    var account : String  = ""

    @Column(name = "password",nullable=false)
    var password : String = ""

    @Column(name = "head_portrait")
    var headPortrait : String =""

    @Column(name = "nick_name")
    var nickName : String  = ""

    @Column(name = "sex")
    var sex : Int = 0;

    @Column(name = "phone")
    var phone : String = ""

    @Column(name = "self_introduction")
    var selfIntroduction : String = ""

    @Column(name = "register_time")
    var registerTime : Date? = null

    /*
    * 用户类型 1为注册用户 2为后台管理员
    * */
    @Column(name = "user_type")
    var userType : Int = 1;

}