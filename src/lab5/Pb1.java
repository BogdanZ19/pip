package lab5;

import java.util.Stack;
import java.util.Vector;

public class Pb1 {
    
    static String msg = "-+u+s+c-+e+r+t-+a-+i-+s+t+r-+y+u-+l+e+s";
    static Stack<String> s = new Stack<String>();

    static void task12() {
        // Task 1+2
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt((i));
            if (c == '+' || c == '-') {
                System.out.println(c);
            }
        }
    }

    static void task3() {
        // Task 3
    
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            if (c == '-' && !s.isEmpty()) {
                s.pop();
            } else if (c == '+') {
                s.push(String.valueOf(msg.charAt(i + 1)));
                i++;
            }
        }
        System.out.println("In stiva se afla: " + s.size() + " elemente");
        System.out.println(s);
    }

    static void task4() {
        Vector<String> v = new Vector<String>();
        v = (Vector<String>) s;
    
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }
    }
    public static void main(String[] args) {
        task12();
        task3();
        task4();
    }
}
