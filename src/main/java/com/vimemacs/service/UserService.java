package com.vimemacs.service;

import com.vimemacs.model.User;

import java.util.List;

/**
 * @author HWD
 * @date 2024/3/14 14:47
 */
public interface UserService {
    List<User> findAll();
}
