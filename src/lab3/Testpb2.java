package lab3;
import lab3.work.*;

public class Testpb2 {
    public static void main(String[] args) {
        Sistem sis = new Sistem();
        Adauga adauga = new Adauga(sis);

        adauga.add(new Piesa());
        adauga.add(new Piesa());
        adauga.add(new Piesa());
        adauga.add(new Agregat());
        adauga.add(new Agregat());
        adauga.add(new Subsistem());
    }
}
//task3 
//metodele add necesita vizibilitatea public