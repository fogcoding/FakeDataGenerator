package com.fogcoding.generator.Person;

import java.util.Random;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/3/22 12:14
 * @e-mail: thinfog@126.com
 */
public class AgeGenerator {

    private Random random = new Random();

    public int Baby(){
        return random.nextInt(5);
    }

    public int Child(){
        return range(0,14);
    }

    public int Student(){
        return range(14,22);
    }

    public int Young(){
        return range(10,18);
    }

    public int Adults(){
        return range(18,48);
    }

    public int Middle(){
        return range(10,35);
    }

    public int Old(){
        return range(20,65);
    }

    public int veryOld(){
        return range(40,85);
    }

    public int range(int from,int to){
        return random.nextInt(to-from) + from;
    }


}
