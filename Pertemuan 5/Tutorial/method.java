package com.praktikum;

class mAhasiswa {

    // data member
    String nama, NIM;

    // constructor
    mAhasiswa(String nama, String NIM){
        //keyword this untuk memanggil nama data member
         this.nama = nama;
         this.NIM = NIM;

         /*
         //cara memanggil method di luar class
         method.test();
         // 'method' merupakan name class dan 'test' merupakan name method
          */
    }

    // method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    // method tanpa return dan dgn parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    // method dgn return dan parameter
    String sayHi(String message) {
        return message + " juga, nama saya adalah " + this.nama;
    }
}

//class Dosen {
//    String nama;
//
//    // contructor
//    Dosen(String nama){
//        this.nama = nama;
//    }
//}

public class method {
    public static void main(String[] args) {
        mAhasiswa mahasiswa1 = new mAhasiswa("Jarwo", "12345");
        System.out.println(mahasiswa1.nama);

        mahasiswa1.show(); // memanggil method 'show()'

        mahasiswa1.setNama("Sopo"); //mengganti nama method
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("Ganteng");
        System.out.println(data);

//        Dosen dosen1 = new Dosen("Panjul");



        //test();
    }

    /*
    static void test(){
        System.out.println("ini adalah method tes");
    }
    */
}
