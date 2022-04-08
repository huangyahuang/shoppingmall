package com.example.shoppingmall.service

import com.example.shoppingmall.entity.UserEntity
import org.springframework.data.domain.Page


interface IUserService {

    fun queryAccount(account: String,password: String,userType: Int):UserEntity

    fun getAll(page: Int,size: Int): Page<UserEntity>

    fun saveOrUpdateUser(user : UserEntity): UserEntity

    fun delectByIdUser(id : Int)

}