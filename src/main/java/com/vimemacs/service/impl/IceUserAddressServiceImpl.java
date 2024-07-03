package com.vimemacs.service.impl;

import com.vimemacs.dao.IceUserAddressDao;
import com.vimemacs.model.IceUserAddress;
import com.vimemacs.service.IceUserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author HWD
 * @date 2024/7/3 11:22
 */
@Service
public class IceUserAddressServiceImpl implements IceUserAddressService {
    @Autowired(required = false)
    @Qualifier("iceUserAddressDao")
    private IceUserAddressDao iceUserAddressDao;
    
    @Override
    public IceUserAddress findById(Integer id) {
        return iceUserAddressDao.findById(id);
    }
}
