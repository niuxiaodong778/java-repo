package src.main.java.org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Teacher t = new Teacher();
        t.setName("teacher001");
        t.setAge(34);

        Student s = new Student();
        s.setName("student001");
        s.setAge(16);

        Admin a = new Admin();
        a.setName("admin001");
        a.setAge(54);

        /*
        *   这个register的参数目前只能是admin，student，teacher 这三种类型
        *   这时候会调用各自类的自己重写的方法
        *   这里如果不重写就会调用其父类的方法
        *
        *
        * 多态的个人理解就是一个方法的参数是父类，传参的时候可以穿子类，方法调用的时候调用其子类方法
         */
        register(t);
        register(s);
        register(a);

    }
    private static void register(Person person){
        person.show();
    }
}