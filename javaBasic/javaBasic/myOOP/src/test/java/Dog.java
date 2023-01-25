public class Dog {
    public static void main(String[] args) {
        Stud stud = new Stud();
        System.out.println(stud.toString());
    }

}
class Persion {
    public Persion() {
        System.out.println("Fu 类无参构造");
    }
    private String name;

    public Persion(String name) {
        System.out.println(this.name);
        System.out.println(name);
        this.name = name;
        System.out.println(this.name);
    }
}

class Stud extends Persion {
    public Stud() {
        super("23");
        System.out.println("stud print");
    }

}