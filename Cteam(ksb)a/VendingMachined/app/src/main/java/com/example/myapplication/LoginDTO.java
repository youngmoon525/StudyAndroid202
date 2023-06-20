package com.example.myapplication;

import java.io.Serializable;

public class LoginDTO implements Serializable {
    private String id, pw, name, age;
    private int money;

    public LoginDTO(String id, String pw, String name, String age, int money) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

