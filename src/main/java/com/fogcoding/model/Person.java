package com.fogcoding.model;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/3/21 13:14
 * @e-mail: thinfog@126.com
 */
public class Person {

    /**
     * 人需要统计哪些信息呢？
     * 姓名，年龄，性别，籍贯，学历
     */

    private String name;
    private int age;
    private String sex;
    private String hometown;
    private String edu_bachground;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getEdu_bachground() {
        return edu_bachground;
    }

    public void setEdu_bachground(String edu_bachground) {
        this.edu_bachground = edu_bachground;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", hometown='" + hometown + '\'' +
                ", edu_bachground='" + edu_bachground + '\'' +
                '}';
    }
}
