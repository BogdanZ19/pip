package lab2;

public class TestPb03 {
    public static void main(String[] args) {
        Student s1 = new Student((long)1234, "Andrei", 1);
        Student s2 = new Student((long)567, "Paul", 2);
        Student s3 = new Student((long)9812, "Rares", 2);
        Student s4 = new Student((long)5427, "Marius", 2);

        Grupa g1 = new Grupa(5);
        Grupa g2 = new Grupa(new Student[]{s2, s3, s4});
        Grupa g3 = new Grupa();

        g1.add(0, s1);
        g1.add(3, s2);

        g3.add(0, s1);
        g3.add(3, s4);

        System.out.println("g1:\n");
        g1.print();
        System.out.println("g2:\n");
        g2.print();
        System.out.println("g3:\n");
        g3.print();
    }
}
