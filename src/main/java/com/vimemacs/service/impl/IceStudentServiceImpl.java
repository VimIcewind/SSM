package com.vimemacs.service.impl;

import com.vimemacs.dao.IceStudentDao;
import com.vimemacs.model.IceStudent;
import com.vimemacs.service.IceStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HWD
 * @date 2024/7/3 15:32
 */
@Service
public class IceStudentServiceImpl implements IceStudentService {
    @Autowired(required = false)
    @Qualifier("iceStudentDao")
    private IceStudentDao iceStudentDao;

    @Override
    public IceStudent findById(Integer id) {
        return iceStudentDao.findById(id);
    }

    @Override
    public List<IceStudent> findBySchoolId(Integer id) {
        return iceStudentDao.findBySchoolId(id);
    }
}
