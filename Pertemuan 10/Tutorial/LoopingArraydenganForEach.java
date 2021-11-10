
/**
 * 41 - Looping Array dengan For Each
 */

import java.util.Arrays;

public class LoopingArraydenganForEach {
    
    public static void main (String[] args) {

        int arrayAngka[] = {11,12,13,14,15,16,17,18,19,20,21};
        //int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};
        System.out.println(Arrays.toString(arrayAngka));

        // looping
        System.out.println("looping standar");
        for(int i=0; i<10; i++){
            System.out.println("index ke-"+ i + " adalah = " + arrayAngka[i]);
        }

        System.out.println("\nlooping dengan properti array");
        // looping dengan properti array
        for(int i=0; i <arrayAngka.length; i++){
            System.out.println("index ke-"+ i + " adalah = " + arrayAngka[i]);
        }

        // mencetak panjang array
        System.out.println("Panjang array = " + arrayAngka.length);


        // looping khususon untuk collection <- array
        System.out.println("\nlooping for earch");
        for( int angka : arrayAngka){
            System.out.println("angka pada looping ini = " + angka);
        }
    }
}
