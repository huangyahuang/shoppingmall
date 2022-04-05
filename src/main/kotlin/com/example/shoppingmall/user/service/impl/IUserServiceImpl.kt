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

    override fun getAll(): List<UserEntity> {
        return userDao.findAll();
    }

    override fun saveOrUpdateUser(user: UserEntity): UserEntity {
        return userDao.save(user);
    }

    override fun delectByIdUser(id: Int) {
        userDao.deleteById(id);
    }

}