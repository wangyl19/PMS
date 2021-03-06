package com.asiainfo.pms.demo.service.impl;


import com.asiainfo.pms.demo.dao.UserDao;
import com.asiainfo.pms.demo.domain.User;
import com.asiainfo.pms.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    public List<User> getUserList(){
        return userDao.selectAll();
    }
}
