package lab6.Pb1;

import java.util.Arrays;
import java.util.List;


public class TestPb1 {
    static void printTest(Test t) {
        t.print();
    }

    public static void task1() {
        Test t = null;
        printTest(t);
    }

    public static void task2() {
        Test t = null;
        try {
            printTest(t);
        } finally {
            System.out.println("A");
        }
        // finally asigur executarea codului
        // daca puneam linia de code inafara blocului finally si prindeam o eroare,
        // linia nu se mai executa
    }

    public static void task3() {
        Test t = null;
        try {
            printTest(t);
        } catch (Exception e) {
            System.out.println("B");
        }
    }

    public static void task4() {
        int[] arr = { 1 };
        System.out.println(arr[1]);
    }

    public static void task5() {
        List<Integer> lst = Arrays.asList(1, 2, 4, 5, 2, 8);
        lst.add(1);
    }

    public static void main(String[] args) {
        task5();
        System.out.println("X");
    }
}
