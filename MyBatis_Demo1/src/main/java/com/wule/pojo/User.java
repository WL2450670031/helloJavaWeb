package com.wule.pojo;

public class User
{
    private String 学号;
    private String 姓名;
    private String 性别;
    private String 籍贯;


    public String get学号() {
        return 学号;
    }

    public String get姓名() {
        return 姓名;
    }

    public String get性别() {
        return 性别;
    }

    public String get籍贯() {
        return 籍贯;
    }

    public void set学号(String 学号) {
        this.学号 = 学号;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }

    public void set性别(String 性别) {
        this.性别 = 性别;
    }

    public void set籍贯(String 籍贯) {
        this.籍贯 = 籍贯;
    }

    // TODO: 2022/6/5

    @Override
    public String toString() {
        return "User{" +
                "学号='" + 学号 + '\'' +
                ", 姓名='" + 姓名 + '\'' +
                ", 性别='" + 性别 + '\'' +
                ", 籍贯='" + 籍贯 + '\'' +
                '}';
    }
}
