package com.hxd.dao;

import com.hxd.domain.User;

import java.util.List;

public interface UserDao {

    //查询所有
    List<User> findAll();
}
