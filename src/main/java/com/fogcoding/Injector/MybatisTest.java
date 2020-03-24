package com.fogcoding.Injector;

import com.fogcoding.generator.Person.AddressGenerator;
import com.fogcoding.generator.Person.AgeGenerator;
import com.fogcoding.generator.Person.EduBackgroundGenerator;
import com.fogcoding.generator.Person.NameGenerator;
import com.fogcoding.generator.Person.model.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Random;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/3/13 10:56
 * @e-mail: thinfog@126.com
 */
public class MybatisTest {

    public static void main(String[] args) {

        byte[] bytes = new byte[1024*2];

        try {
            // 读取配置文件 mybatis-config.xml
            InputStream config = Resources
                    .getResourceAsStream("mybatis-config.xml");

            // 根据配置文件构建SqlSessionFactory
            SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
                    .build(config);
            // 通过 SqlSessionFactory 创建 SqlSession
            SqlSession ss = ssf.openSession();
            // SqlSession执行映射文件中定义的SQL，并返回映射结果
            /*
             * com.mybatis.mapper.UserMapper.selectUserById 为 UserMapper.xml
             * 中的命名空间+select 的 id
             */

            int i = 0;
            Person p = new Person();
            AddressGenerator addressGenerator = new AddressGenerator();

            NameGenerator nameGenerator = new NameGenerator();
            EduBackgroundGenerator eduBackgroundGenerator = new EduBackgroundGenerator();
            AgeGenerator ageGenerator = new AgeGenerator();
            while (i++ < 1000000){
                p.setName(nameGenerator.Men(2));
                p.setAge(new Random().nextInt(45));
                p.setSex("女");
                p.setHometown(addressGenerator.getOne());
                p.setEdu_bachground(eduBackgroundGenerator.Middle());

                ss.insert("com.fogcoding.Injector.mapper.PersonMapper.born",p);
//            System.out.println(p.toString());
//            p.clear();
            }
            ss.commit();


            // 查询所有用户
            List<Person> listMu = ss
                    .selectList("com.fogcoding.Injector.mapper.PersonMapper.getAll");
            for (Person person : listMu) {
                System.out.println(person);
            }
            // 提交事务
            ss.commit();
            // 关闭 SqlSession
            ss.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.toString());
            System.out.println(new String(bytes));
        }





    }




}
