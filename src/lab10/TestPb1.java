package lab10;

public class TestPb1 {
    static public class Descrescator implements Runnable {
        protected int numarator = 10;
        // contor fire de executie
        private static int numarTask = 0;
        // index-ul firului de executie
        private final int id = numarTask++;

        public Descrescator(int numarator) {
            this.numarator = numarator;
        }

        public Descrescator() {
        }

        public String stare() {
            String x = new String();
            if (numarator > 0)
                x = String.valueOf(numarator);
            else
                x = "Decoleaza!";
            return "#" + id + "(" + x + "). ";
        }

        public void run() { // executie in fir
            while (numarator >= 0) {
                System.out.println(stare());
                numarator--;
                Thread.yield();
            }
        }
    }
    
    public static void main(String[] args) {
        // System.out.println("In asteptarea decolarii:");
        // task1();
        // System.out.println("In asteptarea decolarii:");
        // task2();
        System.out.println("In asteptarea decolarii:");
        task3();
        System.out.println("Terminare main.");
    }
    
    static void task1() {
        Descrescator decoleaza = new Descrescator();
        decoleaza.run();
    }

    static void task2() {
        Thread t = new Thread(new Descrescator());
        t.start();
    }

    static void task3() {
        for(int i = 0; i < 5; i++) {
            new Thread(new Descrescator()).start();
        }
    }
}
