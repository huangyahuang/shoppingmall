package com.example.shoppingmall.dao

import com.example.shoppingmall.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component

@Component
interface UserDao : JpaRepository<UserEntity, Int> {

    fun findByAccount(account : String): UserEntity;
}