package com.example.shoppingmall.user.service.impl

import com.example.shoppingmall.user.dao.UserDao
import com.example.shoppingmall.user.entity.UserEntity
import com.example.shoppingmall.user.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class IUserServiceImpl : IUserService {
    @Autowired
    lateinit var userDao:UserDao;

    override fun queryAll(): List<UserEntity> {
        return userDao.findAll();
    }

    override fun adduser(user: UserEntity): UserEntity {
        return userDao.save(user);
    }

    override fun updateUser(user: UserEntity): UserEntity {
        TODO("Not yet implemented")
    }

    override fun delectUser(id: Long) {
        userDao.deleteById(id);
    }

}