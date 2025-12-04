package lab10;
import java.util.concurrent.*;

public class TestPb3 {
    public static void main(String[] args) {
        (new FirGenerat()).run();
    }

    static public class FirGenerat implements Runnable {
        public void run() {
            while(true) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }

                Thread.yield();
            }
        }
    }

    static public class FirDaemon implements Runnable {
        public void run() {
            
        }
    }
}
