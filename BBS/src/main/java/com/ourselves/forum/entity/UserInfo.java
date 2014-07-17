package com.ourselves.forum.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Ron
 * Date: 14-6-15
 * Time: 下午4:44
 */
public class UserInfo implements Serializable {
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private String nickname;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String QQ;
    @Getter
    @Setter
    private String province;
    @Getter
    @Setter
    private String city;
    @Getter
    @Setter
    private int sex;
    @Getter
    @Setter
    private String tel;
}
