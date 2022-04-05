package com.example.shoppingmall.user.entity

import lombok.Data
import org.hibernate.annotations.Table
import java.util.Date
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@javax.persistence.Entity(name="mall_user")
@Table(appliesTo = "mall_user")
@Data
class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id : Long  = 0;

    @Column(name = "account")
    var account : String  = ""

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

    @Column(name = "register")
    var register : Date? = null

}