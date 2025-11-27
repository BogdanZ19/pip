package lab9;

import java.util.Scanner;

public class TestPb2 {
    public static void main(String[] args) {
            task1();
    }

    static void task1() {
        Scanner inputStream = new Scanner(System.in);
        String citit = "";
        
        System.out.println("SCRIE CEVA!");
        citit = inputStream.nextLine();
        citit = citit.toUpperCase();
        
        System.out.println("OUTPUT:");
        System.out.println(citit);
        inputStream.close();
    }
}
