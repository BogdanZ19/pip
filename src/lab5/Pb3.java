package lab5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Pb3 {
    static List<Integer> arr = Arrays.asList(1, 2, 4, 5, 2, 8);

    static void Task1() {
        // Creez un obiect de tip HashSet care implementeaza interfata set
        // in HashSet nu se pot introduce doua elemente identice => toate elementele
        // sunt unice.
        HashSet<Integer> set = new HashSet<Integer>(arr);

        // La crearea variabilei set se pastreaza doar elementele unice din arr
        // deci daca numarul de elemente din set difera de cel din arr => s-au
        // eliminat unele elemente care se repetau

        if (set.size() == arr.size()) {
            System.out.println("Lista are elemente unice");
        } else {
            System.out.println("Lista nu are elemente unice");
        }
    }

    static void Task2() {
        // Am utilizat metoda sort care compara fiecare element prin functia furnizata
        // ca si parametru.
        arr.sort((a, b) -> {
            if (a > b) {
                return 1;
            } else if (a < b) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(arr);
    }

    public static void main(String[] args) {
        Task1();
        Task2();
    }
}
