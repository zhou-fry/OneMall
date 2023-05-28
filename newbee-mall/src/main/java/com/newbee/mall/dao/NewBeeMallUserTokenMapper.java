package com.newbee.mall.dao;

import com.newbee.mall.entity.MallUser;
import com.newbee.mall.entity.MallUserToken;

public interface NewBeeMallUserTokenMapper {

    int insertSelective(MallUser record);

    MallUserToken selectByPrimaryKey(Long userId);

    MallUserToken selectByToken(String token);

    int updateByPrimaryKeySelective(MallUserToken record);

}
