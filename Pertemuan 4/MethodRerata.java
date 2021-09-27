import java.util.Scanner;

public class MethodRerata {
    
    /* Buat program menghitung rata" dari nilai yang dimasukan user secara bebas */

    static void rerata(){
        
        Scanner input = new Scanner(System.in);

        double angka, total = 0, rataRata = 0;
        char jawab = 'y';

        do{
            System.out.print("Masukan bilangan : ");
            angka = input.nextDouble();
            total = angka + total;
            
            System.out.print("Ingin memasukan bilangan lagi? [y/t]");
            jawab = input.next().charAt(0);     
        } while (jawab == 'y');
        
        rataRata = total / 2;
        System.out.println("Total     : "+total);
        System.out.println("Rata-rata : "+rataRata);
    }

    public static void main(String[] args) {
        rerata();
    }
}
