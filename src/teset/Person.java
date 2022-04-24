/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teset;

/**
 *
 * @author mohme
 */
public class Person {
public Person(){}
    public Person(String name, int age, String address, Gender stdGender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.stdGender = stdGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getStdGender() {
        return stdGender;
    }

    public void setStdGender(Gender stdGender) {
        this.stdGender = stdGender;
    }
    private String name;
    private int age;
    private String address;
    Gender stdGender;
    public static int rullnum=5;
   
}


enum Gender{
 Man,Women
}
