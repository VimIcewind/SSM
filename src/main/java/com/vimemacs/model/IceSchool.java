package com.vimemacs.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author HWD
 * @date 2024/7/3 14:55
 */
public class IceSchool implements Serializable {
    private Integer id;
    
    private String name;
    
    private List<IceStudent> students;

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

    public List<IceStudent> getStudents() {
        return students;
    }

    public void setStudents(List<IceStudent> students) {
        this.students = students;
    }
}
