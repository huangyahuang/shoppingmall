package com.example.shoppingmall.service

import com.example.shoppingmall.entity.UserEntity


interface IUserService {

    fun getAll(): List<UserEntity>

    fun saveOrUpdateUser(user : UserEntity): UserEntity

    fun delectByIdUser(id : Int)

}