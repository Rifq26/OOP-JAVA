/*
package com.praktikum;


//    NAMA            : RIFQI MUHAMMAD
//    NIM             : 2020071014
//    PROGRAM STUDI   : INFORMATIKA


import java.util.Scanner;

public class MinMax extends InputData{

    public int nilaiMaximum(int nilaiA, int nilaiB, int nilaiC){

        int max;
        max = (getNilaiA() > getNilaiB())? getNilaiA():getNilaiB();
        max = (max > getNilaiC())? max:getNilaiC();

        //System.out.println("Nilai maximumnya = ");
        return max;
    }

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

    public static void main(String[] args) {
        MinMax met = new MinMax();
        met.displayMinMax();
    }
}
*/
