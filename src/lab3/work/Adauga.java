package lab3.work;

public class Adauga {
    Sistem sis;
    int piesaCurenta = 0;
    int agregatCurent = 0;
    int subsistemCurent = 0;

    Adauga(Sistem sis) {
        this.sis = sis;
        System.out.println("Constructor Adauga");
    }

    Adauga add(Piesa p) {
        this.sis.arrPiese[piesaCurenta] = p;
        piesaCurenta++;
        return this;
    }

    Adauga add(Agregat a) {
        this.sis.arrAgregate[agregatCurent] = a;
        agregatCurent++;
        return this;
    }

    Adauga add(Subsistem s) {
        this.sis.arrSubsisteme[subsistemCurent] = s; 
        subsistemCurent++;
        return this;
    }
}
