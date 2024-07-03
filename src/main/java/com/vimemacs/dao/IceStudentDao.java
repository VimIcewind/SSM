package com.vimemacs.dao;

import com.vimemacs.model.IceStudent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author HWD
 * @date 2024/7/3 15:01
 */
@Repository
public interface IceStudentDao {
    IceStudent findById(Integer id);
    
    List<IceStudent> findBySchoolId(Integer id);
}
