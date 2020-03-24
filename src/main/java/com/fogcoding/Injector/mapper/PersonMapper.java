package com.fogcoding.Injector.mapper;

import com.fogcoding.generator.Person.model.Person;

import java.util.List;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/3/24 20:32
 * @e-mail: thinfog@126.com
 */
public interface PersonMapper {

    List<Person> getAll();


    int born(Person person);

}
