package com.vimemacs.service;

import com.vimemacs.model.IceRole;
import org.springframework.stereotype.Service;

/**
 * @author HWD
 * @date 2024/7/3 17:08
 */
@Service
public interface IceRoleService {
    IceRole findById(Integer id);

    IceRole findByUserId(Integer id);
}
