package com.praktikum;
import java.util.Scanner;

public class InputData {

    // variabel input masing-masing nilai
    protected static int nilaiA, nilaiB, nilaiC;
    Scanner inputKeyboard = new Scanner(System.in);

    // setter dan getter nilai A
    public void setNilaiA(int valueA){
        this.nilaiA = valueA;
    }
    public int getNilaiA(){
        return this.nilaiA;
    }

    // setter dan getter nilai B
    public void setNilaiB(int valueB){
        this.nilaiB = valueB;
    }
    public int getNilaiB(){
        return this.nilaiB;
    }

    // setter dan getter nilai C
    public void setNilaiC(int valueC){
        this.nilaiC = valueC;
    }
    public int getNilaiC(){
        return this.nilaiC;
    }

    // method input nilai
    public void inputNilai(){
        System.out.println("Input nilai:");
        System.out.print("A : ");
        this.nilaiA = inputKeyboard.nextInt();
        System.out.print("B : ");
        this.nilaiB = inputKeyboard.nextInt();
        System.out.print("C : ");
        this.nilaiC = inputKeyboard.nextInt();
    }

    // method Display hasil data
    public void displayHasil(){

        System.out.println("\nHasil input data:");
        System.out.println("Nilai A = " + this.getNilaiA());
        System.out.println("Nilai B = " + this.getNilaiB());
        System.out.println("Nilai C = " + this.getNilaiC());
    }

//    public int penjumlahanNilaiData(){
//
//        hasilPenjumlahan = this.hasilPenjumlahan;
//        this.hasilPenjumlahan = (this.getNilaiA() + this.getNilaiB() + this.getNilaiC());
//
//        System.out.println("\nPenjumlahan Nilai:");
//        System.out.println("Nilai A + B + C = " + this.hasilPenjumlahan);
//        // memanggil method
//        InputData displayRata = new InputData();
//
//        displayRata.penjumlahanNilaiData();
//        return this.hasilPenjumlahan;
//    }
//
//    public int nilaiRataRata(){
//
//       // hasilRata = this.hasilRata;
//        hasilRata = this.hasilPenjumlahan / 3;
//
//        InputData displayRata = new InputData();
//
//
//        System.out.println("\nNilai rata-rata = " + this.hasilRata);
//        displayRata.nilaiRataRata();
//        return this.hasilRata;
//    }

//    public void displayMinMax(){
//
//        System.out.println("Nilai maximumnya = " + nilaiMaximum(this));
//        System.out.println("Nilai minimumnya = ");
//    }

    // method nilai max
    public int nilaiMaximum(int nilaiA, int nilaiB, int nilaiC){

        int max;
        max = (getNilaiA() > getNilaiB())? getNilaiA():getNilaiB();
        max = (max > getNilaiC())? max:getNilaiC();

        //System.out.println("Nilai maximumnya = ");
        return max;
    }

    // method nilai min
    public int nilaiMinimum(int nilaiA, int nilaiB, int nilaiC){

        int min;
        min = Math.min(getNilaiA(), getNilaiB());
        if(getNilaiC() < min){
            min = getNilaiC();
        }

        //System.out.println("Nilai minimumnya = ");
        return min;
    }

    public void displayMinMax(){

        //displayMinMax() = this.displayMinMax();

        System.out.println("\nNilai Minimal dan Maximal yaitu:");
        System.out.println("Nilai minimumnya = " + (nilaiMinimum(getNilaiA(), getNilaiB(), getNilaiC())));
        System.out.println("Nilai maximumnya = " + (nilaiMaximum(getNilaiA(), getNilaiB(), getNilaiC())));

    }
}
