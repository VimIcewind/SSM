package com.vimemacs.dao;

import com.vimemacs.model.IceRole;
import com.vimemacs.model.IceUser;
import org.springframework.stereotype.Repository;

/**
 * @author HWD
 * @date 2024/7/3 16:36
 */
@Repository
public interface IceRoleDao {
    IceRole findById(Integer id);
    
    IceRole findByUserId(Integer id);
}
