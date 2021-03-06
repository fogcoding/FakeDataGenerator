package com.fogcoding.generator.Person.model;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/3/21 13:14
 * @e-mail: thinfog@126.com
 */
public class Person {

    /**
     * 人需要统计哪些信息呢？
     * 姓名，年龄，性别，籍贯，学历,身份证号，婚姻状况，配偶
     * 人可以进行哪些行为？
     * 长大，读书，生病，上班，赚钱，结婚，生子，死亡，事故等等问题，然后可以进行类似于跑批一样的过程，然后模拟一个国家，一个群体的变化
     *
     * 更多的作为是视图化，可视化！
     */

    private String name;
    private int age;
    private String sex;
    private String hometown;
    private String edu_bachground;
    private String identified_id;
    private String marriage_status;
    private String spouse;
    private Person father;
    private Person mother;

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

    public String getIdentified_id() {
        return identified_id;
    }

    public void setIdentified_id(String identified_id) {
        this.identified_id = identified_id;
    }

    public String getMarriage_status() {
        return marriage_status;
    }

    public void setMarriage_status(String marriage_status) {
        this.marriage_status = marriage_status;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }
}
