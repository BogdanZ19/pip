package lab10;

public class TestPb2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            (new ThreadAdormit()).start();
        }
    }

    static public class ThreadAdormit extends Thread {
        int sleepTime = (int) ((Math.random() * 10)) + 1;
        private static int numarTask = 0;
        private final int id = numarTask++;

        public void run() {
            try {
                Thread.sleep(sleepTime * 1000);
            } catch (Exception e) {
                System.out.println("eroare sleep");
            } finally {
                System.out.println("#" + id + " Am dormit: " + sleepTime + " secunde");
            }
        }

    }
}
