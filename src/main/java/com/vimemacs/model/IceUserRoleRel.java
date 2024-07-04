package com.vimemacs.model;

import java.io.Serializable;

/**
 * @author HWD
 * @date 2024/7/3 16:35
 */
public class IceUserRoleRel implements Serializable {
    private Integer id;
    
    private Integer userId;
    
    private Integer roleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
