package com.fogcoding.generator.Person;

import com.fogcoding.generator.Person.model.Province;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/3/22 12:26
 * @e-mail: thinfog@126.com
 */
public class AddressGenerator {

    private Random random = new Random();
    private List<Province> list = new ArrayList<Province>();
    private String[] shengfen = {};
    private String city_json = "";

    public AddressGenerator() {
        InputStream path = this.getClass().getResourceAsStream("/geoinfo-all.json");
        BufferedReader reader = new BufferedReader(new InputStreamReader(path));
        Gson gson = new Gson();
        list = gson.fromJson(reader, new TypeToken<List<Province>>() {}.getType());
    }

    public String getOne() {
        String addr = "";
        int provice = random.nextInt(list.size()-1);
        Province province = list.get(provice);

        Province.City cityaddr = null;
//        System.out.println(new Gson().toJson(province));
        if (province.getDistricts().size() > 1) {
            int city = random.nextInt(province.getDistricts().size()-1);
            cityaddr = province.getDistricts().get(city);
            addr = addr.concat(province.getName());
        } else if (province.getDistricts().size() == 1){
            cityaddr = province.getDistricts().get(0);
            addr = addr.concat(province.getName());
        }
        try {
            System.out.println(province.getName());
            System.out.println(cityaddr.getName());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        Province.District districtaddr = null;
        if (cityaddr != null && cityaddr.getDistricts().size() > 1) {
            int district = random.nextInt(cityaddr.getDistricts().size()-1);
            districtaddr = cityaddr.getDistricts().get(district);
            addr = addr.concat(districtaddr.getName());
        }else if (cityaddr != null && cityaddr.getDistricts().size() == 1){
            districtaddr = cityaddr.getDistricts().get(0);
            addr = addr.concat(districtaddr.getName());
        }
        Province.Street strretaddr = null;
        if (districtaddr != null &&  districtaddr.getDistricts().size() > 1) {
            int street = random.nextInt(districtaddr.getDistricts().size()-1);
             strretaddr = districtaddr.getDistricts().get(street);
            addr = addr.concat(strretaddr.getName());
        }else if (districtaddr != null && districtaddr.getDistricts().size() == 1){
            strretaddr = districtaddr.getDistricts().get(0);
            addr = addr.concat(strretaddr.getName());
        }
        try {
            System.out.println(strretaddr.getName());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        //不知道为什么会出现空值，所以补锅一样搞了个重来操作
        if (addr.equals("")){
            return getOne();
        }
        return addr;
    }


}
