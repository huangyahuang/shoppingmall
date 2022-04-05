package com.example.shoppingmall.user.dao

import com.example.shoppingmall.user.entity.UserEntity
import org.hibernate.annotations.Comment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component

@Component
interface UserDao : JpaRepository<UserEntity, Long> {

    fun findByAccount(account : String):UserEntity;
}