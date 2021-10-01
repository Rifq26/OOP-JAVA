package com.praktikum.P5;

// membuat class sebagai template
class Mahasiswa {
    String nama, NIM, jurusan;
    double IPK;
    int umur;
}

public class introductionClassAndObject {

    public static void main(String[] args) {

        // instansiasi atau membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Rifqi Muhammad";
        mahasiswa1.NIM = "2020071014";
        mahasiswa1.jurusan = "Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 17;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur + " Tahun\n");

        // object mahasiswa2
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Java Javac";
        mahasiswa2.NIM = "202xxxxx";
        mahasiswa2.jurusan = "Informatika";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 25;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur + " Tahun");
        
    }

}
