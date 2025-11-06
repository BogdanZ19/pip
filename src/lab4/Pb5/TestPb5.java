package lab4.Pb5;

public class TestPb5 {
    public static void main(String[] args) {
        ClasaExterioara cx = new ClasaExterioara();
        ClasaExterioara.ClasaIn ci = cx.new ClasaIn();
        ci.metoda3();
        ClasaExterioara.ClasaInStatica cis = new ClasaExterioara.ClasaInStatica();
        cis.metoda1();
        ClasaExterioara.ClasaInStatica.metoda2();
    }    
}

//const clasa ext
//const clasa in
//ci -> met 3
//const cis
//cis -> met1()