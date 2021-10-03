package com.praktikum;

// class tanpa constructor atau class polos
class Polos {
    String dataString;
    int dataInteger;
}

// class dengan constructor
class mahasiswa {
    String nama, NIM, jurusan;

    /*
    // constructor dipanggil saat object pertama kali dibuat
    mahasiswa() {
        System.out.println("Ini adalah constructor");
    }
    */

    // construktor dengan parameter
    mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan + "\n");
    }

}

public class Constructor {

    public static void main(String[] args) throws Exception {

        //mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa mahasiswa1 = new mahasiswa("Jarwo", "12345", "Teknik");
        mahasiswa mahasiswa2 = new mahasiswa("ucup", "54321", "Teknik");



        /*
        // pemanggilan constructor
        new mahasiswa();
         */


        /*Polos objectPolos = new Polos();
        objectPolos.dataString = "polos";
        objectPolos.dataInteger = 1;
        System.out.println(objectPolos.dataString);
        System.out.println(objectPolos.dataInteger);*/
    }
}
