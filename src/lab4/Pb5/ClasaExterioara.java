package lab4.Pb5;

public class ClasaExterioara {
    ClasaExterioara() {
        System.out.println("Constructor exterior");
    }
    static class ClasaInStatica {
        ClasaInStatica() {
            System.out.println("Constructor interior static");
        }
        void metoda1() {
            System.out.println("Metoda 1, ClasaInStatica");
        }
        static void metoda2() {
            System.out.println("Metoda 2, ClasaInStatica");
        }
    }

    class ClasaIn {
            ClasaIn() {
                System.out.println("Constructor interior");
            }
            void metoda3() {
                System.out.println("Metoda 3, ClasaIn");
            }
    }
    static void metodaBuna() {
        System.out.println("Metoda buna");
    }
}
