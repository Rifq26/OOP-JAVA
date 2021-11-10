/**
 * 44 - Latihan Array
 */

 import java.util.Arrays;

 public class LatihanArray {
     public static void main(String[] args) {
         
        int[] arrayNumber1 = {2,4,6,21,7,3,11,8};
        int[] arrayNumber2 = {0,5,2,9,7,4,3,1};

        // Penjumlahan antara dua buah array
        int[] arrayHasilPenjumlahan = tambahArray(arrayNumber1,arrayNumber2);
        displayArray(arrayNumber1, "array 1");
        displayArray(arrayNumber2, "array 2");
        displayArray(arrayHasilPenjumlahan, "hasil penjumlahan");
        Enter();

        // Menggabungkan dua buah array
        int[] arrayHasilPenggabungan = new int[arrayNumber1.length + arrayNumber2.length];

        for (int i=0; i<arrayNumber1.length; i++){
            arrayHasilPenggabungan[i] = arrayNumber1[i]; 
        }
        for (int i=0; i<arrayNumber2.length; i++){
            arrayHasilPenggabungan[i + arrayNumber1.length] = arrayNumber1[i];
        }

        displayArray(arrayNumber1, "array 1");
        displayArray(arrayNumber2, "array 2");
        displayArray(arrayHasilPenjumlahan, "hasil menggabungkan");
        Enter();

        // Sorting reverse, mengurutkan data tapi terbalik (besar ke ke-kecil)
        displayArray(arrayNumber1, "array 1");
        displayArray(arrayNumber1, "sorted 1");

        // memnaggil method reverse
        reverse(arrayNumber1);
        displayArray(arrayNumber1, "reserved metode 1");
        Enter();

        displayArray(arrayNumber2, "array 2");
        displayArray(arrayNumber2, "sorted 2");
        reverse2(arrayNumber2);
        displayArray(arrayNumber2, "reserved metode 2");
        Enter();

     }

     private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2){
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i=0; i<arrayInt1.length; i++){
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
     }

     private static void reverse(int[] arrayData){
            Arrays.sort(arrayData);

            int[] arrayBuffer = Arrays.copyOf(arrayData, arrayData.length);

        for (int i=0; i < arrayData.length; i++){
            arrayData[i] = arrayBuffer[(arrayBuffer.length -1) - i];
        }
     }

     private static void reverse2(int[] arrayData){
         Arrays.sort(arrayData);
         int buffer;

         for (int i=0; i < arrayData.length/2; i++){
            buffer = arrayData[i];
            arrayData[i] = arrayData[(arrayData.length - 1) - i];
            arrayData[(arrayData.length - 1) - i] = buffer;
         }
     }


     private static void displayArray(int[] arrayData, String message){
         System.out.println(message + " = " + Arrays.toString(arrayData));
     }
     
     // ENTER dengen method
     public static void Enter(){
         System.out.print("\n");
     }
 }