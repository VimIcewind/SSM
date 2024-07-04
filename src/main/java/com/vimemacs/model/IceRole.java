package com.vimemacs.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author HWD
 * @date 2024/7/3 16:32
 */
public class IceRole implements Serializable {
    private Integer id;
    
    private String name;
    
    private List<IceUser> iceUserList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IceUser> getIceUserList() {
        return iceUserList;
    }

    public void setIceUserList(List<IceUser> iceUserList) {
        this.iceUserList = iceUserList;
    }
}
