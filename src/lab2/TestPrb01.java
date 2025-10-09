package lab2;
// import lab2.Student;

public class TestPrb01 {
    double var1;
    boolean var2;
    public static void main(String[] args) {
        Student s1 = new Student("Andrei", 1);
        Student s2 = new Student(5132432, "Paul");
        Student s3 = new Student(59871231, "Claudiu", 3);
        Student s4 = new Student(s3);
    
        s1.printStudent();
        s2.printStudent();
        s3.printStudent();
        s4.printStudent();
        //Task 5: boolean - false, double 0.0
        //Rez: camp al clasei -> se dau valorile default
        //     in metode -> nu se aloca val default

        //Task 6 (DA, SUNT DIFERITI DIN PUNCT DE VEDERE AL SUPRAINCARCARII)
        // Student s5 = new Student("Andrei", (long) 123);
        // Student s6 = new Student(812957128, "Cristi");
    }


}
