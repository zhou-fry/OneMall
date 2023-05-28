package com.newbee.mall.dao;

import com.newbee.mall.entity.MallUser;
import org.apache.ibatis.annotations.Param;

public interface MallUserMapper {

//    根据用户名和密码判断用户是否满足登录条件
    MallUser selectByLoginNameAndPasswd(@Param("loginName") String loginName, @Param("password") String password);

}
