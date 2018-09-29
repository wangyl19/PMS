package com.asiainfo.demo.dao;

import com.asiainfo.demo.domain.User;

import java.util.List;

public interface UserDao {
    User selectByPrimaryKey(Integer id);

    List<User> selectAll();
}
