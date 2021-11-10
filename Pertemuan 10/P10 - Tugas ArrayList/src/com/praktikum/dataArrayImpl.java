/**
 * Buatlah aplikasi berbasis OOP untuk menginput 10 data dengan menggunakan Array, lalu aplikasi dapat mencari salah satu data yang telah diinput.
 *
 * Sebagai contoh, data yang telah diinput adalah 10, 30, 2, 31, 23, 83, 77, 12, 8, 9.
 * Lalu aplikasi menampilkan pertanyaan, Apakah ingin mencari data? lalu kita masukkan data 30. Maka apabila data tersebut ada di dalam data yang telah diinput
 * maka data tersebut ditampilkan, jika tidak ada maka akan ada pesan bahwa tidak terdapat data yang dicari.
 */

package com.praktikum;

import java.util.Scanner;
import java.util.ArrayList;

public class dataArrayImpl extends dataArray {

    private Scanner inputKeyboard = new Scanner(System.in);
    private int jumlahData;
    public Character dataSearch = 'N';
    public ArrayList<Integer> arrayData = new ArrayList<Integer>();

    @Override
    public void input() {
        System.out.print("Jumlah data array > ");
        //int jumlahData = new Scanner(System.in).nextInt();
        this.jumlahData = inputKeyboard.nextInt();
        //jumlahData = inputKeyboard.nextInt();

        //ArrayList arrayData = new ArrayList();
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Nilai ke-" + (i+1) + " : ");
            arrayData.add(new Scanner(System.in).nextInt());

            // Untuk tipe data String
            //arrayData.add(new Scanner(System.in).nextLine());

        }
    }

    @Override
    public void search() {
        //input();

        int cari, track=0;
        System.out.print("Apakah ingin cari data [Y/N] > ");
        // input scanner char Y/N
        dataSearch = new Scanner(System.in).next().charAt(0);
        if (dataSearch == 'Y' || dataSearch == 'y'){

            System.out.print("\nInput nilai yang dicari: ");
            int valueSearch = new Scanner(System.in).nextInt();

            /**
             * // melihat boolean input data
             * System.out.println(arrayData.contains(valueSearch));
             */

            if (arrayData.contains(valueSearch)){
                System.out.println("Nilai " + valueSearch + " ditemukan\n\n");
            } else {
                System.out.print("Nilai tidak ditemukan\n\n");
            }
        }
        for(int i=0; i<arrayData.size(); i++){
            System.out.print(arrayData.get(i) +" ");
        }
        System.out.println("\nTotal array berjumlah " + arrayData.size() + " data");

    }
}
