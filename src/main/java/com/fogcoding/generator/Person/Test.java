package com.fogcoding.generator.Person;

import com.fogcoding.generator.Person.model.Person;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/3/22 14:41
 * @e-mail: thinfog@126.com
 */
public class Test {


    public static void main(String[] args) {
        int i = 0;
        Person p = new Person();
        AddressGenerator addressGenerator = new AddressGenerator();

        NameGenerator nameGenerator = new NameGenerator();
        EduBackgroundGenerator eduBackgroundGenerator = new EduBackgroundGenerator();
        AgeGenerator ageGenerator = new AgeGenerator();
        while (i++ < 100000){
            p.setName(nameGenerator.Men(2));
            p.setAge(ageGenerator.Student());
            p.setSex("男");
            p.setHometown(addressGenerator.getOne());
            p.setEdu_bachground(eduBackgroundGenerator.High());
            System.out.println(p.toString());
            p.clear();
        }
    }


}
