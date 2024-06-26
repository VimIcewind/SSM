package com.vimemacs.service;

import com.vimemacs.model.User;

import java.util.List;
import java.util.Map;

/**
 * @author HWD
 * @date 2024/3/14 14:47
 */
public interface UserService {
    List<User> findAll();
    
    User findById(String id);
    
    List<User> findByIds(List<Integer> ids);
    
    List<User> findByName(String name);

    List<User> findByNameAndPassword(String name, String password);

    // List<User> findByNameAndPassword(Map<String, String> map);
    
    int countByName(String name);
    
    int insert(User user);
    
    int update(User user);
    
    int delete(Integer id);
    
    int deleteByName(String name);
}
