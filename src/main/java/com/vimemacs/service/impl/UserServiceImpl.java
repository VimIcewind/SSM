package com.vimemacs.service.impl;

import com.vimemacs.dao.UserDao;
import com.vimemacs.model.User;
import com.vimemacs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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
    public List<User> findByIds(List<Integer> ids) {
        return userDao.findByIds(ids);
    }

    @Override
    public List<User> findByName(String name) {
        return userDao.findByName(name);
    }

    // @Override
    // public List<User> findByNameAndPassword(String name, String password) {
    //     return userDao.findByNameAndPassword(name, password);
    // }

    @Override
    public List<User> findByNameAndPassword(Map<String, String> map) {
        return userDao.findByNameAndPassword(map);
    }

    @Override
    public int countByName(String name) {
        return userDao.countByName(name);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int delete(Integer id) {
        return userDao.delete(id);
    }

    @Override
    public int deleteByName(String name) {
        return userDao.deleteByName(name);
    }
}
