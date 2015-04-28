package com.example.helloworld;

/**
 * Created by lianglei on 2015/4/27.
 */
public class MyInfo {
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyInfo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public MyInfo() {

    }

    public MyInfo(String name) {

        this.name = name;

    }

}
