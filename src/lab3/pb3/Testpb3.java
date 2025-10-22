package lab3.pb3;

public class Testpb3 {
    public static void main(String[] args) {
        // 1. Ce efect are cuvântul final în fața unei variabile primare (int, long,
        // ....)?
        System.out.println("//1");
        final int x = 5;
        System.out.println(x);
        // x = 2; // Unresolved compilation problem: The final local variable var may
        // already have been assigned
        // Raspuns:
        // keyword-ul var are efectul de a transforma variabila intr-o constanta dupa
        // asignarea primei valori
        System.out.println("\n//2");


        // 2. Unde și când se poate modifica o variabilă finală?
        final int y;
        y = 3;
        // y = 4; // Eroare
        System.out.println(y);
        // Raspuns:
        // O variabila finala se poate modifica pana la prima asignare, ori pe linia in
        // care este definita, ori dupa;


        // 3. Este posibil modificarea conținutul unui variablile de tip obiect declarat
        // final?
        System.out.println("\n//3");
        System.out.println("s1:");

        Student s1 = new Student(8);
        System.out.println("referinta s1: " + s1.getRef());
        s1.print();

        s1.nota = 3;
        System.out.println("\nReferinta s1 dupa asignare: " + s1.getRef());
        s1.print();

        s1 = new Student(12);
        System.out.println("\nSchimbarea referintei: " + s1.getRef());
        s1.print();

        System.out.println("\ns2:");
        final Student s2 = new Student(7);
        System.out.println("referinta s2: " + s2.getRef());

        s2.nota = 5;
        System.out.println("referinta s2 dupa asignare: " + s2.getRef());
        s2.print();
        // s2 = new Student(9); //EROARE: The final local variable s2 cannot be
        // assigned.

        // Raspuns:
        // Este posibila modificarea continutului. In acest caz, keyword-ul final face
        // ca
        // referinta obiectului sa fie constanta


        // 4. Cu ce scop se pune final în fața unei clase?
        
        // Raspuns:
        // Final se pune in fata unei clase pentru a impiedica mostenirea acesteia
        // ex: Clasele Unu si Doi


        // 5. Este posibil să se pună final la declararea unui parametru la o metodă?
        // Motivați utilitatea în cazul
        // unui răspuns afirmativ.

        // Raspuns:
        // Da, este posibil (ex in clasa Student). Utilitatea revine din faptul ca astfel, 
        // acel parametru nu isi poate schimba valoarea / referinta in cadrul metodei. 

        // 6. Care ar fi scopul utilizării împreună static și final la în fața unei variabile/câmp?
        
        // Scopul ar fi de a crea o variabila constanta la nivel de clasa ???

    }
}
