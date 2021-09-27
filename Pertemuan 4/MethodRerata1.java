import java.util.Scanner;

public class MethodRerata1 {
    
    static int i = 0;

    //Method untuk menghitung total
    static double total() {
        Scanner input = new Scanner(System.in);
        double bilangan, total=0, rataRata=0;
        char jawab = 'y';

        while(jawab == 'y') {
            //int i = 0;
            i++;
            System.out.print("Masukkan bilangan : ");
            bilangan = input.nextDouble();
            total += bilangan;
            System.out.print("Ingin memasukkan bilangan lagi? [y/t] : ");
            jawab = input.next().charAt(0);
        }
        return total;
    }

    // Method untuk menghitung rata-rata
    static double rerata(double nilaiTotal, int jumlahData) {
        return nilaiTotal / jumlahData;
    }

    public static void main(String[] args) {
        double t = total();
        System.out.println("Nilai total data    = " + t);
        System.out.println("Nilai rerata data   = " + rerata(t,i));
    }
}