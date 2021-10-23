package com.praktikum;
import java.util.Scanner;

public class Karyawan {

    protected static int gajiPokok, jamLembur, jamKerja;
    protected static int golongan, tunjangan;
    protected static double potonganGajiPokok, potonganTunjangan, totalPajak,  gajiLembur, gajiBersih;
    protected static String namaKaryawan;
    // objek scanner input
    Scanner inputKeyboard = new Scanner(System.in);

    public void gajiKaryawan() {

        System.out.print("Nama Karyawan\t : ");
        namaKaryawan = inputKeyboard.nextLine();
        System.out.print("Golongan\t\t : ");
        golongan = inputKeyboard.nextInt();
        System.out.print("Total Jam Kerja\t : ");
        jamKerja = inputKeyboard.nextInt();
        if(golongan == 1){
            // Rupiah
            gajiPokok = 1486500;
            tunjangan = 250000;
        } else if (golongan == 2){
            gajiPokok = 1926000;
            tunjangan = 300000;
        } else if (golongan == 3){
            gajiPokok = 2456700;
            tunjangan = 350000;
        } else if (golongan == 4){
            gajiPokok = 2899500;
            tunjangan = 400000;
        }

        if(jamKerja > 173) {
            jamLembur = jamKerja - 173;
        } else {
            jamLembur = 0;
        }

        gajiLembur = 20000 * jamLembur;
        potonganGajiPokok = (0.5 / 100) * gajiPokok;
        potonganTunjangan = (0.5 / 100) * tunjangan;
        totalPajak = potonganGajiPokok + potonganTunjangan;
        gajiBersih = (((gajiPokok + gajiLembur) + tunjangan) - totalPajak);
    }

    public void Display(){

        System.out.println("\nID          : ID001");
        System.out.println("Nama        : " + namaKaryawan);
        System.out.println("Golongen    : " + golongan);
        System.out.println("Jabatan     : Supervisor");
        System.out.println("Status      : Karyawan Tetap");

        System.out.println("\nGaji Pokok  : Rp." + gajiPokok);
        System.out.println("Tunjangan   : Rp." + tunjangan);
        System.out.println("Gaji Lembur : Rp." + gajiLembur);
        System.out.println("Total Pajak : Rp." + totalPajak);
        System.out.println("Gaji Bersih : Rp." + gajiBersih);
    }
}
