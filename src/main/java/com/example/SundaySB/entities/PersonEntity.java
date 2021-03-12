package com.example.SundaySB.entities;

import javax.persistence.*;

@Entity
public class PersonEntity {

    public PersonEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String age;
    String address;
    String mobile_number;
    String adhar_number;

    public PersonEntity(String name, String age, String address, String mobile_number, String adhar_number) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobile_number = mobile_number;
        this.adhar_number = adhar_number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getAdhar_number() {
        return adhar_number;
    }

    public void setAdhar_number(String adhar_number) {
        this.adhar_number = adhar_number;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                ", adhar_number='" + adhar_number + '\'' +
                '}';
    }
}
