package com.yupi.example.common.service;

import com.yupi.example.common.model.User;

public interface UserService {
    /**
     * 获取用户信息
     *
     * @param user 用户信息
     * @return 用户信息
     */
    User getUser(User user);
}
