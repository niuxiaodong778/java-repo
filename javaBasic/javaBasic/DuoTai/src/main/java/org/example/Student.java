package src.main.java.org.example;

public class Student extends Person{
    @Override
    public void show() {
        System.out.println("name:" + getName() + " age:" + getAge() +" " + getClass());
    }
}
