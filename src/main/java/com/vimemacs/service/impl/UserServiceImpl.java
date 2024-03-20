package com.vimemacs.service.impl;

import com.vimemacs.dao.UserDao;
import com.vimemacs.model.User;
import com.vimemacs.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HWD
 * @date 2024/3/14 14:48
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
