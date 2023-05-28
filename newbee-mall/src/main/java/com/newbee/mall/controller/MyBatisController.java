package com.newbee.mall.controller;

import com.newbee.mall.dao.UserDao;
import com.newbee.mall.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName MyBatisController
 * @Description TODO
 * @Author Administrator
 * @Date 2023/5/26 15:07
 **/
@RestController
@Service
public class MyBatisController {

    @Resource
    private UserDao userDao;

    //    查询全部用户
    @GetMapping("/user/queryAll")
    public List<User> findAllUsers() {
        List<User> users = userDao.findAllUsers();
        return users;
    }

    //    查询指定用户
    @GetMapping("/user/findUserById")
    public User findUserById(int id) {
        User user = userDao.findUserById(id);
        return user;
    }

    //    新增用户
    @GetMapping("/user/insertUser")
    public String insertUser(User user) {
        int i = userDao.insertUser(user);
        if (i > 0) {
            return "新增" + user.getName() + "成功";
        }
        return "新增失败";
    }

    //    删除用户
    @GetMapping("/user/deleteUser")
    public String deleteUser(int id) {
        User user = userDao.findUserById(id);
        if (user == null) {
            return "待删除的对象不存在";
        }
        int i = userDao.deleteUser(id);
        if (i > 0) {
            return "删除成功";
        }
        return "删除失败";
    }

    //    修改用户的信息
    @GetMapping("/user/updateUser")
    public String updateUser(User user) {
        User user1 = userDao.findUserById(user.getId());
        if (user1 == null) {
            return "待修改的用户不存在";
        }
        int i = userDao.updateUser(user);
        if (i > 0) {
            return "修改ID为" + user.getId() + "的数据成功";
        }
        return "修改ID为" + user.getId() + "的数据失败";
    }


}
