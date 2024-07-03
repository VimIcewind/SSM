package com.vimemacs.dao;

import com.vimemacs.model.IceSchool;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author HWD
 * @date 2024/7/3 14:58
 */
@Repository
public interface IceSchoolDao {
    IceSchool findById(Integer id);
}
