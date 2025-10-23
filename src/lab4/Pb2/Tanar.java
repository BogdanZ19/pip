package lab4.Pb2;

public class Tanar {
    void metoda1() {
        System.out.println("Tanar.metoda1()");
    }
    void metoda2() {
        System.out.println("Tanar.metoda2()");
    }
    void metoda3() {
        System.out.println("Tanar.metoda3()");
        this.metoda1();
    }
}
