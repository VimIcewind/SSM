package com.vimemacs.test;

import com.vimemacs.dao.UserDao;
import com.vimemacs.model.User;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HWD
 * @date 2024/3/14 17:04
 */
public class UserDaoTest extends BaseJunit4Test {
    @Resource
    private UserDao userDao;

    @Test
    public void testFindAll() {
        List<User> userList = userDao.findAll();
        System.out.println(userList.size());
    }
}
