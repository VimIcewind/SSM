package com.vimemacs.dao;

import com.vimemacs.model.IceUser;
import org.springframework.stereotype.Repository;

/**
 * @author HWD
 * @date 2024/7/3 10:56
 */
@Repository
public interface IceUserDao {
    IceUser findById(Integer id);
}
