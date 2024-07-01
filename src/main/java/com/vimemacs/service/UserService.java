package com.vimemacs.service;

import com.vimemacs.model.User;

import java.util.List;

/**
 * @author HWD
 * @date 2024/3/14 14:47
 */
public interface UserService {
    List<User> findAll();
    
    User findById(String id);
    
    List<User> findByName(String name);
    
    int countByName(String name);
    
    int insert(User user);
    
    int update(User user);
    
    int delete(Integer id);
    
    int deleteByName(String name);
}
