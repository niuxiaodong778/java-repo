package org.example.Java8Inter;

public class InterImpl implements Inter{
    @Override
    public void show() {
        System.out.println("InterImpl show");
    }

    @Override
    public void method() {
        System.out.println("this is InterImpl method");
    }
}
