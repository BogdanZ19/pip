package lab3.work;

public class Adauga {
    Sistem sis;
    int piesaCurenta = 0;
    int agregatCurent = 0;
    int subsistemCurent = 0;

    public Adauga(Sistem sis) {
        this.sis = sis;
        System.out.println("Constructor Adauga");
    }

    public Adauga add(Piesa p) {
        this.sis.arrPiese[piesaCurenta] = p;
        piesaCurenta++;
        return this;
    }

    public Adauga add(Agregat a) {
        this.sis.arrAgregate[agregatCurent] = a;
        agregatCurent++;
        return this;
    }

    public Adauga add(Subsistem s) {
        this.sis.arrSubsisteme[subsistemCurent] = s; 
        subsistemCurent++;
        return this;
    }
}
