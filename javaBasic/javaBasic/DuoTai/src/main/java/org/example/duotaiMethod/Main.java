package src.main.java.org.example.duotaiMethod;

public class Main {
    public static void main(String[] args) {
        Animal  dog = new Dog();
        /*
        * 调用成员变量：编译看左边 ，运行看右边
        * 编译看左边：javac在编译的时候会看左边父类中有没有这个变量，如果有编译成功，如果没有编译失败
        * 运行也看左边：java运行代码的时候，实际获取的就是左边父类中的成员变量的值
        *
        * 调用成员方法：编译看左边，运行看右边
        * 编译看左边：看左边父类中有没有这个方法，如果有编译成功，如果没有编译失败；
        * 运行看右边：java运行代码的时候，实际上运行的是右边子类的方法
        *
        * 怎么理解呢？
        * Animal a = new Dog();
        * a是一个Animal类型的，我们用a去调用成员变量和方法的时候肯定是使用的父类的变量啊
        * 对于成员变量：在子类对象中会把父类的成员变量也继承下的，父： name；      子：name
        * 对于成员方法：子类中如果实现了父类的方法，这时候子类中的方法就把子类中的方法--  覆盖  --了
        *
        * 多态实例化一个对象和非多态实例化一个对象的区别
        *   1. 多态的时候对于成员变量：寻找成员变量的时候直接找父类的成员；普通方式的引用成员变量的时候先找自己（子类）类中
        * 是否包含这个成员变量，如果存在就使用它，如果没有再去找父类中是否包含这个成员变量
        *
        * 多态的弊端
        *     多态不能直接调用子类特有的方法（需要强制类型转换）
        * */
        dog.show(); // Dog ------------- show dog
        System.out.println(dog.name); // 动物

        Animal cat = new Cat();
        cat.show(); // Cat ---------------show
        System.out.println(cat.name); // 动物
        // ==============================================

    }
}

class Animal {
    String name = "动物";

    public void show() {
        System.out.println("动物---show方法");
    }
}

class Cat extends Animal {
    String name = "cat";

    @Override
    public void show() {
        System.out.println("Cat ---------------show");
        // 这时候下面应该输出cat
        System.out.println("Cat this.name "+this.name);
    }
}

class Dog extends Animal {
    String name = "dog";

    @Override
    public void show() {
        System.out.println("Dog ------------- show " + name);
    }
}