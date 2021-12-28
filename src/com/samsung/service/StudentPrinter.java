package com.samsung.service;

import com.samsung.model.Person;
import com.samsung.model.Student;

public class StudentPrinter implements Printer{
    public void printInfo(Person p){
        System.out.println("Студент: имя-"+p.getFirstName()+", фамилия-"+p.getSecondName()+
                ", телефон-"+(p.getPhone()==null?"не указан":p.getPhone())+", возраст-"+p.getAge()+", группа-"+((Student)p).getGroup()+" баллы-"+((Student)p).getScore());
    }
}
