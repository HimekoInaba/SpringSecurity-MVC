package com.springmvc.service;

import com.springmvc.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
