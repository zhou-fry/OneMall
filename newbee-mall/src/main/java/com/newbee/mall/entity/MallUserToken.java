package com.newbee.mall.entity;


import lombok.Data;

import java.util.Date;

@Data
public class MallUserToken {

  private long userId;
  private String token;
  private Date updateTime;
  private Date expireTime;

}
