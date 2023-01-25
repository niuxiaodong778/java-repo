public class TestClass {
    public static void main(String[] args) {
        ZI zi = new ZI();
        zi.ZiShow();
    }
}
class FU {
    String name="FU class";
}
class ZI extends FU{
    String name = "ziClass";

    public void ZiShow(){
        String name = "zi";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
