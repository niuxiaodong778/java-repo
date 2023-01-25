package org.example;

import org.example.externalDemo.Teacher;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("danny");
        student.setAge(23);
        System.out.println(student.toString());
        System.out.println("external class");
        Teacher teacher = new Teacher();
        teacher.setName("Danny teacher");
        teacher.setAge(45);
        System.out.println(teacher.toString());
        System.out.println("Hello world!");
    }
}