package com.netease.kaola.study.entity;

public class User01 {
    private int id;
    private String name01;
    private int age01;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName01() {
        return name01;
    }

    public void setName01(String name01) {
        this.name01 = name01;
    }

    public int getAge01() {
        return age01;
    }

    public void setAge01(int age01) {
        this.age01 = age01;
    }

    @Override
    public String toString() {
        return "User01{" +
                "id=" + id +
                ", name01='" + name01 + '\'' +
                ", age01=" + age01 +
                '}';
    }
}
