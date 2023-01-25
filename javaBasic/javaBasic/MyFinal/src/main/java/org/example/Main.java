package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Teacher t = new Teacher();
        t.setAge(34);
        t.setName("Danny");
        System.out.println(t.toString());

        final Teacher t2 = new Teacher("Jhon",45);
        System.out.println(t2.toString());
        t2.setName("JJJJJ");
        t2.setAge(55);
        System.out.println(t2.toString());

//        t2 = new Teacher(); 这种情况是会报错的，地址不能改变
    }
}

class Teacher {
    private String name;

    private int age;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Teacher() {
    }
}