package com.miao.springmvc.domain;

import java.util.Arrays;
import java.util.List;

/**
 * @author miaoyin
 * @date 2021/1/7 - 21:29
 * @commet:
 */

public class User {
    private String userName;
    private Integer userAge;
    private String[] hobby;
    private Pet pet;
    private List<Pet> pets;

    public User() {
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", hobby=" + Arrays.toString(hobby) +
                ", pet=" + pet +
                ", pets=" + pets +
                '}';
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
