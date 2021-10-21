import java.util.*;

public class nomer4 {

public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    double phi = 3.14;
    double jariJari, luas,keliling;

    System.out.println("\n");
    System.out.print("Masukkan Nilai Panjang Jari-jari : ");
    jariJari = input.nextDouble();

    luas = 0.5 * (phi * jariJari * jariJari);
    keliling = 2 * phi * jariJari;

    System.out.print("Luas Lingkaran = " + (int)luas + " \nKeliling lingkaran = "+ (int)keliling);


    }

}
