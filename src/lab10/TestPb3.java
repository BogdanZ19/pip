package lab10;
import java.util.concurrent.*;

public class TestPb3 {
    public static void main(String[] args) throws InterruptedException {
        Thread firDaemon = new Thread(new FirDaemon());
        firDaemon.setDaemon(true);
        firDaemon.start();
        System.out.println(firDaemon.isDaemon());
    
        TimeUnit.SECONDS.sleep(1);
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
        Thread[] masiv = new Thread[10]; 
        public void run() {
            for (int i = 0; i < masiv.length; i++) {
                masiv[i] = new Thread(new FirGenerat());
                masiv[i].start();
                System.out.println("FirGenerat " + i + " pornit" + " daemon: " + masiv[i].isDaemon());
                //toate vor fi daemon pentru ca sunt subthread-uri ale unui fir daemon
            }
        }
    }
}
