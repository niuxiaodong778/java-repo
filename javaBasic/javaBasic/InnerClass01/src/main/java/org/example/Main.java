package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.carAge = 1;
        car.carColor = "red";
        car.carName = "宾利";
        System.out.println(car.toString());
        System.out.println("Hello world!");
    }
}