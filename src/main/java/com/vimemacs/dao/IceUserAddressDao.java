package com.vimemacs.dao;

import com.vimemacs.model.IceUserAddress;
import org.springframework.stereotype.Repository;

/**
 * @author HWD
 * @date 2024/7/3 10:55
 */
@Repository
public interface IceUserAddressDao {
    IceUserAddress findById(Integer id);
}
