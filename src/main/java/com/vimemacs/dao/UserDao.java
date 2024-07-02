package com.vimemacs.dao;

import com.vimemacs.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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

    // @Select("select * from user where name = #{name} and password = #{password}")
    // List<User> findByNameAndPassword(@Param("name") String name, @Param("password") String password);
    
    List<User> findByNameAndPassword(Map<String, String> map);
    
    int countByName(String name);
    
    @Insert("insert into user(name, password) values(#{name}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(User user);
    
    @Update("update user set name = #{name}, password = #{password} where id = #{id}")
    int update(User user);
    
    @Delete("delete from user where id = #{id}")
    int delete(Integer id);
    
    @Delete("delete from user where name = #{name}")
    int deleteByName(String name);
}
