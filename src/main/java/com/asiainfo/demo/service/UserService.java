package com.asiainfo.demo.service;

import com.asiainfo.demo.domain.User;

import java.util.List;

public interface UserService {
    User getUserById(int userId);

    List<User> getUserList();
}
