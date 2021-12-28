package com.samsung.service;

import com.samsung.model.Person;
import com.samsung.model.Student;

public  class PersonDemo {
    public static void demo() {
        PersonPrinter perPr = new PersonPrinter();
        StudentPrinter stuPr = new StudentPrinter();
        Person p = new Person("Aa", "Bb", 12);
        perPr.printInfo(p);
        p.setAge(13);
        p.setPhone("11");
        perPr.printInfo(p);
        Student st=new Student("Petya","Ivanov",12,"1234",33);
        stuPr.printInfo(st);
        st.setAge(13);
        st.setGroup("21");
        st.setPhone("123");
        st.setScore(34);
        stuPr.printInfo(st);
    }
}
