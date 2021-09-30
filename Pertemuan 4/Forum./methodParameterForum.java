import java.util.Scanner;

public class methodParameterForum {
    
    // Buatlah 1 contoh program yang menggunakan method parameter.
    static int luas(int alas, int tinggi) {
        int luas = alas * tinggi;
        return luas;
    }

    public static void main(String[] args) {
        int alas, tinggi;
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas Jajar Genjang\n\n");
        System.out.print("Masukan nilai alas: ");
        alas = input.nextInt();
        System.out.print("Masukan nilai tinggi: ");
        tinggi = input.nextInt();
        System.out.println("Luas Jajar Genjang: " + alas + " * " + tinggi + " = " + luas(alas, tinggi));
    }
}
