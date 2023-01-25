public class method {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        s1.launch();
    }
}
class Person {
    public void eat(){
        System.out.println("eat fun");
    }
    public void drank(){
        System.out.println("drank water");
    }
}
class Stu extends Person{
    public void launch(){
        eat();
        drank();
    }

    @Override
    public void eat() {
        System.out.println("Override eat");
//        super.eat();
    }

    @Override
    public void drank() {
        System.out.println("Override drank");
//        super.drank();
    }
}
