package com.example.shoppingmall.dao

import com.example.shoppingmall.entity.UserEntity
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Component

@Component
interface UserDao : JpaRepository<UserEntity, Int> {

    fun findByAccountAndPasswordAndUserType(account: String,password: String,userType: Int): UserEntity;
}