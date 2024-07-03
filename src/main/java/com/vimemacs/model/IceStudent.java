package com.vimemacs.model;

import java.io.Serializable;

/**
 * @author HWD
 * @date 2024/7/3 14:53
 */
public class IceStudent implements Serializable {
    private Integer id;
    
    private String name;
    
    private Integer age;
    
    private IceSchool iceSchool;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public IceSchool getIceSchool() {
        return iceSchool;
    }

    public void setIceSchool(IceSchool iceSchool) {
        this.iceSchool = iceSchool;
    }
}
