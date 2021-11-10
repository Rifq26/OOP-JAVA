/**
 * 43 - Operasi pada array
 */

import java.util.Arrays;

public class OperasiPadaArray {
    public static void main (String[] args) {
        
        int[] arrayAngka3 = {1,2,3,4,5};

        /* merubah array menjadi String */
        System.out.println("\nMerubah array menjadi String\n ========");
        printArray(arrayAngka3);

        /* melakukan copy array */
        System.out.println("\nMelakukan copy array\n ========");
        int[] arrayAngka4 = new int[5];
        printArray(arrayAngka3);
        printArray(arrayAngka4);

        System.out.println("\nCopy array dengan menggunkan loop");
        for(int i=0; i<arrayAngka3.length; i++) {
            arrayAngka4[i] = arrayAngka3[i];
        }
        printArray(arrayAngka3);
        System.out.println("\t\taddress array " + arrayAngka3); // address array 
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        System.out.println("\nmengcopy dengan copyOf");
        // tipe data[] newNama = Arrays.copyOf(namaVaribel,newLength);
        int[] arrayAngka5 = Arrays.copyOf(arrayAngka3, 3);
        printArray(arrayAngka3);
        System.out.println("\t\taddress array " + arrayAngka3);
        printArray(arrayAngka5);
        System.out.println(arrayAngka5);

        System.out.println("\nmengcopy dengan copyOfRange");
        // tipe data[] newNama = Arrays.copyOf(namaVaribelOriginalArray,from,to);
        int[] arrayAngka6 = Arrays.copyOfRange(arrayAngka3, 2, 5);
        printArray(arrayAngka3);
        System.out.println("\t\taddress array " + arrayAngka3); // address array 
        printArray(arrayAngka6);
        System.out.println(arrayAngka6);


        /* fill array */
        System.out.println("\n\nFill Array\n ======");
        int[] arrayAngka7 = new int[6];
        printArray(arrayAngka7);
        Arrays.fill(arrayAngka7, 1);
        printArray(arrayAngka7);


        /* komparasi array */
        System.out.println("\n\nKomparasi Array\n ======");
        int[] arrayAngka8 = {1,2,3,4,5,6};
        int[] arrayAngka9 = {1,2,3,4,5,6};

        // MENCOCOKAN 2 BUAH ARRAY MENGUNAKAN KEYWORD equal
        System.out.println("Membandingkan antara dua buah array: "+Arrays.equals(arrayAngka8, arrayAngka9));
        if (arrayAngka8 == arrayAngka9){
            System.out.println("array ini sama");
        } else {
            System.out.println("Array ini beda");
        } // yang artinya mencocokan 2 buah nilai dengan menggunakan 2 kondisi if else kurang valid


        // /* compare array dengan keyword 'compare' */
        // System.out.println("\nmengecek mana array yang lebih besar");
        // System.out.println(Arrays.compare(arrayAngka8, arrayAngka9));

        // /* cek index yang berbeda arraay dengan keyword 'mismatch' */
        // System.out.println("\nmengecek mana index yang berbeda");
        // System.out.println(Arrays.mismatch(arrayAngka8, arrayAngka9));

        /* sort array */
        System.out.println("\nsorting array\n =======");
        int[] arrayAngka10 = {1,3,5,4,7,6,2};
        printArray(arrayAngka10);
        // sorting array dengan keyword 'sort'
        Arrays.sort(arrayAngka10);
        printArray(arrayAngka10);


        /* search array */ 
        System.out.println("\nsearch array\n =======");
        int angka = 3;
        // Arrays.binarySearch(nameVariabelArray, key/value);
        int posisi = Arrays.binarySearch(arrayAngka10, angka);
        System.out.println("angka " + angka + " ada di index " + posisi);

        /* cari posisi index array bebas */
        System.out.println("\nsearch posisi index array bebas\n =======");
        System.out.println("cari posisi index angka 5");
        int[] arr = {2,3,5,6,7};
        int cari = 5; //cari posisi index angka 5
        printArray(arr);
            for(int i =0;i < arr.length;i++){
                if(cari == arr[i]){
                    System.out.println("ada di-index ke-"+i);
                }
            }
     


        /* TUGAS */
        // sorting besar kecil
        // operasi tambah antara dua buah array
        // menggabungkan dua buah array

    }

    private static void printArray(int[] dataArray) {
        System.out.println("array " + Arrays.toString(dataArray));
    }
}