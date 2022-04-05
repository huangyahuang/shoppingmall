package com.example.shoppingmall.user.service

import com.example.shoppingmall.user.entity.UserEntity
import org.springframework.stereotype.Service



interface IUserService {

    fun getAll(): List<UserEntity>

    fun saveOrUpdateUser(user : UserEntity): UserEntity

    fun delectByIdUser(id : Int)

}