package com.fogcoding.generator.Person.model;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/3/22 13:10
 * @e-mail: thinfog@126.com
 */
public class Province {

    private String citycode;
    private String adcode;
    private String name;
    private String center;
    private String level;
    private ArrayList<City> districts;

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ArrayList<City> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<City> districts) {
        this.districts = districts;
    }

    public class City {
        private String citycode;
        private String adcode;
        private String name;
        private String center;
        private String level;
        private ArrayList<District> districts;

        public String getCitycode() {
            return citycode;
        }

        public void setCitycode(String citycode) {
            this.citycode = citycode;
        }

        public String getAdcode() {
            return adcode;
        }

        public void setAdcode(String adcode) {
            this.adcode = adcode;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCenter() {
            return center;
        }

        public void setCenter(String center) {
            this.center = center;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public ArrayList<District> getDistricts() {
            return districts;
        }

        public void setDistricts(ArrayList<District> districts) {
            this.districts = districts;
        }
    }

    public class District {
        private String citycode;
        private String adcode;
        private String name;
        private String center;
        private String level;
        private ArrayList<Street> districts;

        public String getCitycode() {
            return citycode;
        }

        public void setCitycode(String citycode) {
            this.citycode = citycode;
        }

        public String getAdcode() {
            return adcode;
        }

        public void setAdcode(String adcode) {
            this.adcode = adcode;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCenter() {
            return center;
        }

        public void setCenter(String center) {
            this.center = center;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public ArrayList<Street> getDistricts() {
            return districts;
        }

        public void setDistricts(ArrayList<Street> districts) {
            this.districts = districts;
        }
    }

    public class Street {
        private String citycode;
        private String adcode;
        private String name;
        private String center;
        private String level;
        private ArrayList districts;

        public String getCitycode() {
            return citycode;
        }

        public void setCitycode(String citycode) {
            this.citycode = citycode;
        }

        public String getAdcode() {
            return adcode;
        }

        public void setAdcode(String adcode) {
            this.adcode = adcode;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCenter() {
            return center;
        }

        public void setCenter(String center) {
            this.center = center;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public ArrayList getDistricts() {
            return districts;
        }

        public void setDistricts(ArrayList districts) {
            this.districts = districts;
        }
    }





}
