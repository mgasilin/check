package com.samsung.service;

import com.samsung.model.Person;

public class PersonPrinter implements Printer{
    public void printInfo(Person p){
        System.out.println("Человек: имя-"+p.getFirstName()+", фамилия-"+p.getSecondName()+
                ", телефон-"+(p.getPhone()==null?"не указан":p.getPhone())+", возраст-"+p.getAge());
    }
}
