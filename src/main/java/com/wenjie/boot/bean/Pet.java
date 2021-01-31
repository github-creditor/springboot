package com.wenjie.boot.bean;

public class Pet {

    private String use;
    private Integer age;

    @Override
    public String toString() {
        return "Pet{" +
                "use='" + use + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
