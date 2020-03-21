package com.fogcoding.generator;

import com.fogcoding.model.Person;

import java.util.Random;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/3/21 16:21
 * @e-mail: thinfog@126.com
 */
public class NameGenerator {

    private String xing = "赵钱孙李周吴郑王冯陈褚卫蒋沈韩杨朱秦尤许何吕施张孔曹严华金魏陶姜戚谢邹喻柏水窦章云苏潘葛奚范彭郎鲁韦昌马苗凤花方俞任袁柳酆鲍史唐费廉岑薛雷贺倪汤";
    private String w_ming = "华诗宛虹枫莜霄菁静岚姗娜丹萍筠昭双璇碧莹汐雯冰洁璐瑾佳仪翠美婕妍琪欢雨璇芊珂莜莺晶茜璇冰颖春红雅菲倩媛丹莹凝霏霄钰艳妤姝芹颖韵芝婵秋灿娥霁菁真蝶雁贞希姗虹妍颖素莲莎梅芳琳英瑶芬荷雅繁凌馨若仟璐秋筱泺珺丹丽妍素筠素英颖婧双芯凝菱婧媚紫初苑珞恬纤玫梅铃滟妙菡璐童璇洁馥馨昕彤如卉雪";
    private String m_ming = "";
    private int[] name_len = {2,3,4};
    private Random random = new Random();


    public Person women(int len){
        StringBuffer name = new StringBuffer();
        int xing_p = random.nextInt(xing.length());
        int ming_p = random.nextInt(w_ming.length());
        name.append(xing.substring(xing_p,xing_p+1));
        name.append(w_ming.substring(ming_p,ming_p+1));
        Person person = new Person();
        person.setSex("女");
        person.setName(name.toString());
        return person;
    }

    public static void main(String[] args) {
        int i = 0;
        while (i++ < 100){
            System.out.println(new NameGenerator().women(2));
        }
    }








}
