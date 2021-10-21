import java.util.Scanner;


public class nomer1{
    
    public static void main(String[] args) {

    int jam, menit, detik;
    
    // membuat objek inputan
    Scanner inputKeyboard = new Scanner(System.in);
        System.out.print("\nJam = ");
        jam = inputKeyboard.nextInt();

        System.out.print("Menit = ");
        menit =  inputKeyboard.nextInt();
        
        System.out.print("detik =  ");
        detik = inputKeyboard.nextInt();
        
        int jam1 =  jam * 3600, menit1 = menit * 60;

        int totalWaktu = jam1 + menit1 + detik, pulsa = totalWaktu / 5, biaya = pulsa * 150;

        System.out.println(jam+" jam : "+ menit +" menit : "+ detik + " detik ");
        System.out.println("Biaya yang telah di keluarkan = " + biaya);
    }
}
