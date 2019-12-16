package com.hxd.dao;

import com.hxd.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    //查询所有
    List<User> findAll();
}
