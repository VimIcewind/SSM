package com.vimemacs.service;

import com.vimemacs.model.IceUser;

/**
 * @author HWD
 * @date 2024/7/3 11:28
 */
public interface IceUserService {
    IceUser findById(Integer id);
}
