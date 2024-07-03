package com.vimemacs.service;

import com.vimemacs.dao.IceStudentDao;
import com.vimemacs.model.IceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HWD
 * @date 2024/7/3 15:29
 */
public interface IceStudentService {
    IceStudent findById(Integer id);
    
    List<IceStudent> findBySchoolId(Integer id);
}
