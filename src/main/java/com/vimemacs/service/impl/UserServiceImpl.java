package com.vimemacs.service.impl;

import com.vimemacs.dao.UserDao;
import com.vimemacs.model.User;
import com.vimemacs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HWD
 * @date 2024/3/14 14:48
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    @Qualifier("userDao")
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(String id) {
        return userDao.findById(id);
    }
    
    @Override
    public List<User> findByName(String name) {
        return userDao.findByName(name);
    }

    @Override
    public int countByName(String name) {
        return userDao.countByName(name);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }
}
