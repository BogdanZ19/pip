package lab4.Pb4;

public class TestPb4 {
    public static void main(String[] args) {
        Interf1 obj = new ClasaA();
        obj.metoda1();
        ((Interf2)obj).metoda2();
        ((Interf3)obj).metoda3();
        ((ClasaA)obj).metoda4();
        Interf4.metoda4();
    }    
    // mutam in alt pachet -> interfetele trebuie sa fie publice
}
