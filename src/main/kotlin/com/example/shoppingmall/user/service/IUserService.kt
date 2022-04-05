package com.example.shoppingmall.user.service

import com.example.shoppingmall.user.entity.UserEntity
import org.springframework.stereotype.Service



interface IUserService {

    fun queryAll(): List<UserEntity>

    fun adduser(user : UserEntity): UserEntity

    fun updateUser(user : UserEntity): UserEntity

    fun delectUser(id : Long)

}