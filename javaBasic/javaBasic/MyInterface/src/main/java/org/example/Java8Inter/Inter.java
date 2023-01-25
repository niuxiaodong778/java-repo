package org.example.Java8Inter;

public interface Inter {
    void show();
    default void method(){
        System.out.println("this is default method");
    }
}
