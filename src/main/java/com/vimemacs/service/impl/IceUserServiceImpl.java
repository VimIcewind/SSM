package com.vimemacs.service.impl;

import com.vimemacs.dao.IceUserDao;
import com.vimemacs.model.IceUser;
import com.vimemacs.service.IceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author HWD
 * @date 2024/7/3 11:29
 */
@Service
public class IceUserServiceImpl implements IceUserService {
    @Autowired(required = false)
    @Qualifier("iceUserDao")
    private IceUserDao iceUserDao;
    
    @Override
    public IceUser findById(Integer id) {
        return iceUserDao.findById(id);
    }
}
