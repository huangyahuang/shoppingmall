package com.example.shoppingmall.service.impl

import com.example.shoppingmall.dao.UserDao
import com.example.shoppingmall.entity.UserEntity
import com.example.shoppingmall.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class IUserServiceImpl : IUserService {
    @Autowired
    lateinit var userDao: UserDao;

    override fun queryAccount(account: String,password: String,userType: Int):UserEntity {
        return userDao.findByAccountAndPasswordAndUserType(account,password,userType)
    }

    override fun getAll(page: Int,size: Int): Page<UserEntity> {
        return userDao.findAll(PageRequest.of(page,size));
    }

    override fun saveOrUpdateUser(user: UserEntity): UserEntity {
        if (null == user.userType || 0 == user.userType){
            user.userType == 1
        }
        return userDao.save(user);
    }

    override fun delectByIdUser(id: Int) {
        userDao.deleteById(id);
    }

}