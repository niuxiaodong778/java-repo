package org.example;

public class Car {
    // 车的属性
    String carName;
    int carAge;
    String carColor;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carAge=" + carAge +
                ", carColor='" + carColor + '\'' +
                '}';
    }

    public Car(String carName, int carAge, String carColor) {
        this.carName = carName;
        this.carAge = carAge;
        this.carColor = carColor;
    }

    // 发动机属性
    class Engine{
        public Engine() {
        }

        public Engine(String engineName, int engineAge) {
            this.engineName = engineName;
            this.engineAge = engineAge;
        }

        String engineName;
        int engineAge;
        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
