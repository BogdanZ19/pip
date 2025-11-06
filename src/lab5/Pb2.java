package lab5;

import java.util.HashMap;
import java.util.Map;


public class Pb2 {
    static String nr_pi_100 = "3.1415926535897932384626433832795028841971693993"
            + "751058209749445923078164062862089986280348253421170679";

    static class Data {
        int nrRep = 1; // Construiesc la prima gasire a unei perechi

        public String toString() {
            return String.valueOf(nrRep);
        }
    }

    // Folosesc clasa data ca sa pot incrementa direct valoarea stocata
    static HashMap<String, Data> hash = new HashMap<String, Data>();

    static void Task1() {

        for (int i = 2; i < nr_pi_100.length() - 1; i++) {
            String pair;

            // creez perechea de la iteratia curenta
            pair = String.valueOf(nr_pi_100.charAt(i));
            pair += String.valueOf(nr_pi_100.charAt(i + 1));

            // verific daca am mai gasit perechea pana acum
            if (hash.containsKey(pair)) {
                (hash.get(pair)).nrRep++;
            } else {
                // daca nu, creez obiectul Data specific pentru perechea gasita
                hash.put(pair, new Data());
            }
        }
        System.out.println(hash);
    }

    static void Task2() {
        int max = Integer.MIN_VALUE;
        String maxKey = "";
        // iterez prin hashMap si gasesc perechea cu cele mai multe repetari
        for (Map.Entry<String, Data> entry : hash.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue().nrRep;

            if (value > max) {
                max = value;
                maxKey = key;
            }
            // printez fiecare cheie + valoare pe cate o linie
            System.out.println(key + ": " + value);
        }
        System.out.println("Perechea cu frecventa cea mai mare este: " + maxKey);
    }

    public static void main(String[] args) {
        System.out.println("Task1:");
        Task1();
        System.out.println("\nTask2:");
        Task2();
    }
}
