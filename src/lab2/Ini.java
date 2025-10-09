package lab2;

public class Ini {
    static Test t1 = new Test("unu - static");

    Ini (String s) {
        Test t2 = new Test(s);
    }

    static Test t3 = new Test("trei - static");
    Test t4 = new Test("patru - simplu");
    

}
