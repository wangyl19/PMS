package com.asiainfo.pms.demo.service;

import com.asiainfo.pms.demo.domain.User;

import java.util.List;

public interface UserService {
    User getUserById(int userId);

    List<User> getUserList();
}
