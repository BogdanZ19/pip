package lab3.pb3;

public class Student {
    public int nota;
    Student(int nota) {
        this.nota = nota;
    }

    void print() {
        System.out.println("Nota este: " + nota);
    }
    
    String getRef() {
        return  Integer.toHexString(System.identityHashCode(this));
    }
    
    boolean esteColeg(final Student std) { // Merge
        // std = new Student(3) -> eroare
        return true;
    }
}
