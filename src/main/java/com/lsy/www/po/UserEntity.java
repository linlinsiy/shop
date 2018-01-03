package com.lsy.www.po;

/**
 * Desc:用户表实体类
 * Created by hafiz.zhang on 2016/8/27.
 */
public class UserEntity {
    private Long id;            // 编号
    private String userName;    // 用户名
    private String password;    // 密码
    private String trueName;    //真名
    private String addr;    //地址
    private String phone;   //电话

    public UserEntity() {
    }

    public UserEntity(Long id) {
        this.id = id;
    }

    public UserEntity(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public UserEntity(String userName, String password, String trueName, String addr, String phone) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.trueName = trueName;
        this.addr = addr;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", trueName='" + trueName + '\'' +
                '}';
    }
}
