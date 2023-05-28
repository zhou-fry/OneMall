package com.newbee.mall.dao;

import com.newbee.mall.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
//    查询全部的用户
    List<User> findAllUsers();
//    查询指定用户
    User findUserById(int id);
//    新增用户
    int insertUser(User user);
//    删除指定用户
    int deleteUser(int id);
//    修改指定用户
    int updateUser(User user);

}
