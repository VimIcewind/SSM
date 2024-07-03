package com.vimemacs.model;

import java.io.Serializable;

/**
 * @author HWD
 * @date 2024/7/3 10:50
 */
public class IceUser implements Serializable {
    private Integer id;
    
    private String name;
    
    private String password;
    
    private Integer age;
    
    private IceUserAddress iceUserAddress;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public IceUserAddress getIceUserAddress() {
        return iceUserAddress;
    }

    public void setIceUserAddress(IceUserAddress iceUserAddress) {
        this.iceUserAddress = iceUserAddress;
    }
}
