package lab4.Pb1;

public class TestPb1 {
    static void printAutomobil(Autovehicul a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        Berlina b = new Berlina();
        b.tipAutomobil();
        b.printBerlina();

        System.out.println("\n//1");
        Autovehicul s = new Sport();
        s.tipAutomobil();
        ((Sport)s).printSport();

        System.out.println("\n//2");
        Object m = new Sport();
        ((Sport)m).tipAutomobil();
        
        System.out.println("\n//3");
        TestPb1.printAutomobil(b);
        TestPb1.printAutomobil(s);
        TestPb1.printAutomobil((Sport)m);

        System.out.println("\n//4");
        Autovehicul auto = new Autovehicul();
        TestPb1.printAutomobil((Sport)auto);
    }
}
