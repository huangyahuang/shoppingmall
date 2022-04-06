package com.example.shoppingmall.service.impl

import com.example.shoppingmall.dao.UserDao
import com.example.shoppingmall.entity.UserEntity
import com.example.shoppingmall.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class IUserServiceImpl : IUserService {
    @Autowired
    lateinit var userDao: UserDao;

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