package lab6.Pb3;

class E1 extends Exception {
    private static final long serialVersionUID = 1;
}

class E2 extends Exception {
    private static final long serialVersionUID = 2;
}

class E3 extends Exception {
    private static final long serialVersionUID = 3;
}

class A {
    void g() throws Exception {
        Exception[] e = { new E1(), new E2(), new E3() };
        int rand = (int) (Math.random() * 4);

        if (rand != 3) {
            throw e[rand];
        }
    }
}

class B {
    void f() throws Exception {
        A a = new A();

        try {
            a.g();
        } catch (Exception e) {
            System.out.println("hash la creare: " + e.hashCode());
            throw e;
        }
    }
}

public class TestPb3 {

    static void var1() {
        B b = new B();

        try {
            b.f();
        } catch (Exception e) {
            System.out.println("tip = " + e.getClass().getSimpleName() + " | hash = " + e.hashCode());
        }
    }

    static void var2() {
        B b = new B();

        try {
            b.f();
        } catch (E1 e) {
            System.out.println("tip = E1 | hash = " + e.hashCode());
        } catch (E2 e) {
            System.out.println("tip = E2 | hash = " + e.hashCode());
        } catch (E3 e) {
            System.out.println("tip = E3 | hash = " + e.hashCode());
        } catch (Exception e) {
            // ca sa scap de eroare la b.f() -> Unhandled exception type Exception
            // alta varianta ar fi sa specific "throws Exception" la definire
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("var1:");
        var1(); // ajunge acelasi hashCode ca si cel creat in B()
        System.out.println("\nvar2:");
        var2();

        System.out.println("\n\nTest");

        B b = new B();

        try {
            b.f();
        } catch (Exception e) {
            System.out.println("tip = " + e.getClass().getSimpleName() +
                    " | hash = " + e.hashCode()); // acelasi hashCode
            throw e;
        }

    }
}
