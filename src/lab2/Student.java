package lab2;

public class Student {
    private String numeStudent;
    private long numarMatricol  = 0;
    private int anStudiu = 1;

    public Student(String nume, int anStudiu) {
        this.numeStudent = nume;
        this.numarMatricol = 0;
        this.anStudiu = anStudiu;
    }

    public Student(long numarMatricol, String nume)
    {
        this.numarMatricol = numarMatricol;
        this.numeStudent = nume;
        System.out.println("1111111111111111");
    }

    public Student(String nume, long numarMatricol)
    {
        this.numarMatricol = numarMatricol;
        this.numeStudent = nume;
        System.out.println("2222222222222");
    }

    public Student(long numarMatricol, String nume, int anStudiu) {
        this.numarMatricol = numarMatricol;
        this.numeStudent = nume;
        this.anStudiu = anStudiu;
    }

    public Student(Student std)
    {
        this(std.numarMatricol, std.numeStudent, std.anStudiu);
        //AVEM VOIE SA FOLOSIM CONSTRUCTORUL O SINGURA DATA IN ALT CONSTRUCTOR
    }

    void printStudent() {
        System.out.println("Validare " + isValidStudent(this) + "\nNume: " + this.numeStudent + "\nNrMatricol " + 
        this.numarMatricol + "\nAn Studiu " + this.anStudiu + "\n");
    }

    static boolean isValidStudent(Student std) {
        if(std.numarMatricol == 0 || std.numeStudent == null) {
            return false;
        }
        return true;
    }
}
