package org.example;

import org.example.ZI.ZIClass;
import org.example.fu.FU;

public class Main {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.setAge(23);
        s1.setName("danny");
        s1.setTeacherName("KIT");
        System.out.println(s1.toString() + " teacher: "+ s1.getTeacherName());
        Student s2 =new Student();
        s2.setAge(23);
        s2.setName("danny");
//        s2.setTeacherName("kit");
        System.out.println(s1.toString() + " teacher: "+ s2.getTeacherName());
        System.out.println("===========================================");

        ZIClass zi = new ZIClass();

        System.out.println("Hello world!");
    }
}