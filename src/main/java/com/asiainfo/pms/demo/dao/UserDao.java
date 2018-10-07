package com.asiainfo.pms.demo.dao;

import com.asiainfo.pms.demo.domain.User;

import java.util.List;

public interface UserDao {
    User selectByPrimaryKey(Integer id);

    List<User> selectAll();
}
