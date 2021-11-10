/**
 * Buatlah aplikasi berbasis OOP untuk menginput 10 data dengan menggunakan Array, lalu aplikasi dapat mencari salah satu data yang telah diinput.
 *
 * Sebagai contoh, data yang telah diinput adalah 10, 30, 2, 31, 23, 83, 77, 12, 8, 9.
 * Lalu aplikasi menampilkan pertanyaan, Apakah ingin mencari data? lalu kita masukkan data 30. Maka apabila data tersebut ada di dalam data yang telah diinput
 * maka data tersebut ditampilkan, jika tidak ada maka akan ada pesan bahwa tidak terdapat data yang dicari.
 */

package com.praktikum;

abstract class dataArray {

    public abstract void input();
    public abstract void search();
}



public class Main {

    public static void Enter(){
        System.out.print("\n");
    }



    public static void main(String[] args) {
        dataArrayImpl print = new dataArrayImpl();
        print.input();
        Enter();
        print.search();
    }
}
