package com.newbee.mall.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class MallUser {

    private long userId;
    private String nickName;
    private String loginName;
    private String passwordMd5;
    private String introduceSign;
    private Byte isDeleted;
    private Byte lockedFlag;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    private String password;


}
