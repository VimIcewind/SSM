package com.vimemacs.service.impl;

import com.vimemacs.dao.IceRoleDao;
import com.vimemacs.dao.UserDao;
import com.vimemacs.model.IceRole;
import com.vimemacs.service.IceRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author HWD
 * @date 2024/7/3 17:12
 */
@Service
public class IceRoleServiceImpl implements IceRoleService {
    @Autowired(required = false)
    @Qualifier("iceRoleDao")
    private IceRoleDao iceRoleDao;

    @Override
    public IceRole findById(Integer id) {
        return iceRoleDao.findById(id);
    }

    @Override
    public IceRole findByUserId(Integer id) {
        return iceRoleDao.findByUserId(id);
    }
}
