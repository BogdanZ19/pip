package lab6.Pb2;

public class TestPb2 {
    public class PIPException extends Exception {
        private String mesaj;
        static long serialVersionUID;

        PIPException(String arg) {
            this.mesaj = arg;
        }

        public String toString() {
            return this.mesaj;
        }
    }

    static void metodaCuExtectie() throws PIPException {
        int[] x = { 1, 2, 3, 4, 5, 6 };
        int rand = 1 + (int) (Math.random() * 7);
        if (rand > 3) {
            throw new TestPb2().new PIPException("exceptie PIP");
        }

    }

    public static void main(String[] args) {
        // Task1
        // try {
        // metodaCuExtectie();
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        // Task2
        // daca mostenesc Exception, metodele care folosesc exceptia creata
        // trebuie sa specifice in definitie "throws exceptie_creata"

        // Task3
        try {
            for (int i = 0; i < 10; i++) {
                metodaCuExtectie();
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        for (int i = 0; i < 10; i++) {
            try {
                metodaCuExtectie();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
