package lab9;

import java.io.RandomAccessFile;

public class TestPb3 {
    public static void main(String[] args) throws Exception{
        var path = "./data/pb3.txt";
        
        // task1
        var fisier = new RandomAccessFile(path, "rw");
        // fisierul este scris in binary, nu este text
        task1(fisier);
        fisier.close();

        // task2
        fisier = new RandomAccessFile(path, "rw");
        task2(fisier);
        fisier.close();

        // task3
        fisier = new RandomAccessFile(path, "rw");
        task3(fisier);
        fisier.close();
    }

    static void task1(RandomAccessFile fisier) throws Exception{
        System.out.println("Task1:");
        
        fisier.writeDouble(2.3);
        fisier.writeDouble(3.14);
        fisier.writeBoolean(true);
        fisier.writeInt(12);
        fisier.writeInt(15);
        fisier.writeFloat(2.3f);
    }

    static void task2(RandomAccessFile fisier) throws Exception{
        System.out.println("\nTask2:");

        fisier.seek(2 * 8 + 1); // 2 * double + 1 * bool
        System.out.println(fisier.readInt());
        System.out.println(fisier.readInt());
        fisier.seek(2 * 8);
        System.out.println(fisier.readBoolean());
    }

    static void task3(RandomAccessFile fisier) throws Exception{
        System.out.println("\nTask3:");

        fisier.seek(2 * 8 + 1);
        var aux = fisier.readInt();
        aux++;
        fisier.seek(2 * 8 + 1);
        fisier.writeInt(aux);   // scrie primul int actualizat si se muta pe urmatorul
                                // spatiu de memorie

        aux = fisier.readInt(); // citeste al doilea int
        aux++;
        fisier.seek(2 * 8 + 1 + 4); // 2 * double + 1 * bool + 1 * int
        fisier.writeInt(aux);

        fisier.seek(0);
    
        System.out.println("Double 1: " + fisier.readDouble());
        System.out.println("Double 2: " + fisier.readDouble());
        System.out.println("Boolean: " + fisier.readBoolean());
        System.out.println("Int 1: " + fisier.readInt());
        System.out.println("Int 2: " + fisier.readInt());
        System.out.println("Float: " + fisier.readFloat());
    }
}
