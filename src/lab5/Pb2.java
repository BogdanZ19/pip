package lab5;

import java.util.HashMap;

public class Pb2 {
    static String nr_pi_100 = "3.1415926535897932384626433832795028841971693993" + "751058209749445923078164062862089986280348253421170679";
    
    static void task1() {
        HashMap<String, Integer> hash;

        for(int i = 2; i < nr_pi_100.length(); i++) {
            String pair;
            pair = String.valueOf(nr_pi_100.charAt(i));
            pair += String.valueOf(nr_pi_100.charAt(i+1));
            
            if(hash.containsKey(pair))
            {
                hash.get(pair)++;
            }
            
            hash.put(pair, 1)
        }
    }

    public static void main(String[] args) {
    }
}
