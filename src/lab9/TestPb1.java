package lab9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.StringReader;

public class TestPb1 {
    public static void main(String[] args) {
        // task12();
        // task2();
        // task3();
    }

    static void task12() {
        String path = "./data/in.txt";

        File inputFile = new File(path);
        System.out.println(inputFile.isFile());
        String memorie = "";
        // ArrayList<String> listaLinii = new ArrayList<String>();
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader(inputFile));
            
            String s;
            while ((s = inputStream.readLine()) != null) {
                memorie += s + "\n";
            }

            inputStream.close();
        } catch (Exception e) {
            System.out.println("exceptie" + e);
        }

        try {
            BufferedReader inputStream = new BufferedReader(new StringReader(memorie));
            
            String s;
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                System.out.println("------------------");
            }

            inputStream.close();
        } catch (Exception e) {
            System.out.println("exceptie" + e);
        }
        // System.out.println(memorie);
    }

    static void task2() {
        String inputString = "mesaj\nfoarte\ninteresant\n";

        ArrayList<String> listaLinii = new ArrayList<String>();
        try {
            BufferedReader inputStream = new BufferedReader(new StringReader(inputString));
            
            String s;
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                System.out.println("------------------");
            }

            inputStream.close();
        } catch (Exception e) {
            System.out.println("exceptie" + e);
        }        
    }

    static void task3() {
        String inputString = "mesaj\nfoarte\ninteresant\n";
        
        ArrayList<String> listaLinii = new ArrayList<String>();
        try {
            BufferedReader inputStream = new BufferedReader(new StringReader(inputString));
            PrintWriter outputStream = new PrintWriter(new BufferedWriter(new FileWriter(new File("./data/out.txt"))));
            
            String s;
            while ((s = inputStream.readLine()) != null) {
                outputStream.println(s);
                outputStream.println("------------------");
            }

            inputStream.close();
            outputStream.close();
        } catch (Exception e) {
            System.out.println("exceptie" + e);
        }        
    }
}
