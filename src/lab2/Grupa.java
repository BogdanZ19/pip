package lab2;

import java.util.Arrays;

public class Grupa {
    int nrStudenti;
    Student[] listaStudenti;

    public Grupa()
    {
        this.nrStudenti = 0;
        this.listaStudenti = new Student[1];
    }

    public Grupa(int nrStudenti)
    {
        this.listaStudenti = new Student[nrStudenti];
    }

    public Grupa(Student[] listaStudenti)
    {
        this.listaStudenti = listaStudenti;
        this.nrStudenti = listaStudenti.length;
    }

    public void add(int pozitie, Student s) {
        if (this.listaStudenti == null || this.listaStudenti.length <= pozitie) {
            this.listaStudenti = Arrays.copyOf(this.listaStudenti, pozitie + 1);
            this.listaStudenti[pozitie] = s;
        } else {
            this.listaStudenti[pozitie] = s;
        }
    }

    public void print() {
        for (Student student : listaStudenti) {
            if (student != null) {
                student.print();
            }
        }
    }
}
