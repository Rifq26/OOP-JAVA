
/**
 * 42 - Mengenal Array Lebih Dalam (Pass by Reference)
 */

 import java.util.Arrays;

public class MengenalArrayLebihDalam {
    public static void main (String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];

        // mencetak address memory array
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);


        arrayAngka2 = arrayAngka1;
        // mencetak address memory array setelah 'arrayAngka2 = arrayAngka1'
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));


        arrayAngka1[0] = 100;
        arrayAngka1[3] = 400;
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));
    
        ubahArray(arrayAngka1);
        System.out.println("\n\nArray 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));
    
    }

    // method yang argumentnya adalah reference, pass by reference
    // bukan pass by value

    private static void ubahArray(int[] dataArray) {
        dataArray[0] = 125;
    }


}
