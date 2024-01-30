package com.sunny.oyoapp.model;

public class User {

    public int id;
    public int type;
    public String email;
    public String password;

    public String nickName;
    public String profileUrl;

    public String age;
    public String username;
    public String createdAt;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String email, String password, String nickName) {
        this.email = email;
        this.password = password;
        this.nickName = nickName;
    }
}
