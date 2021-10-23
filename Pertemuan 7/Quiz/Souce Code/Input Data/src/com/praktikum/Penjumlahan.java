package com.praktikum;

/*
    NAMA            : RIFQI MUHAMMAD
    NIM             : 2020071014
    PROGRAM STUDI   : INFORMATIKA
 */

import java.util.Scanner;

public class Penjumlahan extends InputData {

    public static int hasilPenjumlahan, hasilRata;

    // method penjumlahan
    public int penjumlahanNilaiData(){

        hasilPenjumlahan = this.hasilPenjumlahan;
        this.hasilPenjumlahan = (this.getNilaiA() + this.getNilaiB() + this.getNilaiC());

        System.out.println("\nPenjumlahan Nilai:");
        System.out.println("Nilai A + B + C = " + this.hasilPenjumlahan);
        return this.hasilPenjumlahan;
    }

    //method nilai rata-rata
    public int nilaiRataRata(){

        hasilRata = this.hasilRata;
        hasilRata = this.hasilPenjumlahan / 3;

        System.out.println("\nNilai rata-rata = " + this.hasilRata);
        return this.hasilRata;
    }
}
