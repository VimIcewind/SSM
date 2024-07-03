package com.vimemacs.service.impl;

import com.vimemacs.dao.IceSchoolDao;
import com.vimemacs.model.IceSchool;
import com.vimemacs.service.IceSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author HWD
 * @date 2024/7/3 15:25
 */
@Service
public class IceSchoolServiceImpl implements IceSchoolService {
    @Autowired(required = false)
    @Qualifier("iceSchoolDao")
    private IceSchoolDao iceSchoolDao;
    
    @Override
    public IceSchool findById(Integer id) {
        return iceSchoolDao.findById(id);
    }
}
