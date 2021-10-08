package com.praktikum;

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}

public class ReferencePadaObject {

    public static void main(String[] args) {
        Buku buku1 = new Buku("Linux Tutorial", "Jarwo");
        buku1.display();

        // menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        // assignment object
//        Buku buku2 = buku1;
        Buku buku2 = new Buku("Tutorial Install Java", "Sopo");
        buku2.judul = "Tutorial Install Python"; //merubah judul buku
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        // membuat object kedalam methods yang bernama 'fungsi'
        fungsi(buku2);
    }

    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("\nAddress dalam fungsi : " + addressDataBuku);
        dataBuku.penulis = "Sopo dan Jarwo";
        System.out.println("Judul dalam fungsi : " + dataBuku.penulis);

    }
}
