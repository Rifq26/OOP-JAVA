package com.praktikum;

/*
    NAMA            : RIFQI MUHAMMAD
    NIM             : 2020071014
    PROGRAM STUDI   : INFORMATIKA
 */

import java.util.Scanner;

public class Main extends Penjumlahan {

    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        // membuat objek memanggilMethod di class Main
        Main memanggilMethod = new Main();

        memanggilMethod.inputNilai();
        memanggilMethod.displayHasil();
        memanggilMethod.penjumlahanNilaiData();
        memanggilMethod.nilaiRataRata();
        memanggilMethod.displayMinMax();



    }
}
