import java.util.Scanner;

abstract class Hewan {

    // abctrack Method (tdk memiliki body)
    public abstract void suara();

    // Reguler Method
    public void tidur() {
        System.out.println("Zzzz...");
    }
}

class Ayam2 extends Hewan {
    
    // membuat method void suara di dalam subclass
    public void suara() {
        System.out.println("Suara ayam : kukuruyukkk...");
    }
}

public class Abstrak1 {
    public static void main(String[] args) {
        // membuat objek Ayam2
        Ayam2 ayam = new Ayam2();
        ayam.suara();
        ayam.tidur();
    }
}
