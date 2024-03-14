package com.vimemacs.dao;

import com.vimemacs.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author HWD
 * @date 2024/3/14 14:44
 */
@Repository
public interface UserDao {
    List<User> findAll();
}
