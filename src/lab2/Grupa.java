package lab2;

import java.util.Arrays;

public class Grupa {
    int nrStudenti = 0;
    Student[] listaStudenti = null;

    // public Grupa()
    // {
    //     this.nrStudenti = 0;
    //     this.listaStudenti = new Student[1];
    // }

    public Grupa(int nrStudenti)
    {
        this.listaStudenti = new Student[nrStudenti];
    }

    public Grupa(Student[] listaStudenti)
    {
        if(listaStudenti != null)
        {
            this.listaStudenti = listaStudenti;
            this.nrStudenti = listaStudenti.length;
        } else {
            System.out.println("EROAREEEEEE");
        }
    }

    public void add(int pozitie, Student s) {
        if (this.listaStudenti == null) {
            System.out.println("EROAREEEEEEEE");
        } else if (this.listaStudenti.length <= pozitie) {
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
