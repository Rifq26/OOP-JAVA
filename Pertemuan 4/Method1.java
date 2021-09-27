/**
 * namafile : Method1.java
 * tanggal, 23 September 2021
 */

public class Method1 {
    // deklarasi method
    static void methodKu() {

        int i = 1;
        System.out.println("Methodku dipanngil");

        while (i < 5){
            System.out.print(i + " ");
            i++;
        }
    }

    public static void main(String[] args) {
        methodKu();
    }
}