package lab3;

public class C extends A {
    public C(String s) {
        super(s);
        B tipB = new B();
        System.out.println("Constructor C");
    }
    B tipB = new B();
}
