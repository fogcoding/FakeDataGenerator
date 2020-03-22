package com.fogcoding.generator.Person;

import java.util.Random;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/3/22 14:34
 * @e-mail: thinfog@126.com
 */
public class EduBackgroundGenerator {

    private Random random = new Random();
    private String[] grade = {"文盲","半文盲","小学","初中","高中","中专","大专","本科","硕士","博士"};

    public String Noob(){
        return grade[range(0,2)];
    }

    public String Primary(){
        return grade[range(2,4)];
    }

    public String Middle(){
        return grade[range(4,6)];
    }

    public String High(){
        return grade[range(6,grade.length)];
    }

    public int range(int from,int to){
        return random.nextInt(to-from) + from;
    }

}
