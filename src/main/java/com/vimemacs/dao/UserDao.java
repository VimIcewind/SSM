package com.vimemacs.dao;

import com.vimemacs.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author HWD
 * @date 2024/3/14 14:44
 */
@Repository
public interface UserDao {
    @Select("select * from user")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "password", property = "password")
    })
    List<User> findAll();
    
    @Select("select * from user where id = #{id}")
    User findById(String id);

    List<User> findByIds(@Param("list") List<Integer> list);
    
    @Select("select * from user where name = #{name}")
    List<User> findByName(@Param("name") String name);

    List<User> findByNameAndPassword(@Param("name") String name, @Param("password") String password);
    
    int countByName(String name);
    
    int insert(User user);
    
    int update(User user);
    
    int delete(Integer id);
    
    int deleteByName(String name);
}
