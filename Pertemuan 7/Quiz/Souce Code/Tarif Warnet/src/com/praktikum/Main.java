package com.praktikum;

/*
    NAMA            : RIFQI MUHAMMAD
    NIM             : 2020071014
    PROGRAM STUDI   : INFORMATIKA
 */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

class User{

    public Scanner inputKeyboard= new Scanner(System.in);
    public ArrayList listData = new ArrayList();
    public InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public BufferedReader input = new BufferedReader(inputStreamReader);
    public boolean runCode = true;

    //deklarsi variabel
    int inputPilihan, selectedMenu;
    int i;
    float hasil;
    float internet, typing, gaming;
    float scan, printWarna, printBW, tehBotol;
    float hasiInternet, hasilTyping, hasilGaming, hasilScan, hasilPrintWarna, hasilPrintBW, hasilTehBotol;
    char inputJenisPenggunaan, inputFasilitasTambahan;

    public User(){
        inputPilihan = this.inputPilihan;
        selectedMenu = this.selectedMenu;
        inputJenisPenggunaan = this.inputJenisPenggunaan;
        inputFasilitasTambahan = this.inputFasilitasTambahan;
        internet = this.internet;
        typing = this.typing;
        gaming = this.gaming;
        scan = this.scan;
        printWarna = this.printWarna;
        printBW = this.printBW;
        tehBotol = this.tehBotol;
        hasiInternet = this.hasiInternet;
    }

    // 1
    public void insertJenisPengunaan() throws IOException {
        System.out.println("\n[1] INTERNET");
        System.out.println("[2] MENGETIK");
        System.out.println("[3] GAME ONLINE");
        System.out.print("\tINPUT PILIHAN > ");
        int selectedSubMenuJenis = Integer.valueOf(input.readLine());
        if (selectedSubMenuJenis == 1){
            System.out.print("JUMLAH WAKTU UNTUK INTERNET (MENIT) > ");
            internet = Float.valueOf(input.readLine());
            hasiInternet = (internet/60) * 4000;
            //this.hasilInternet = hasiInternet;
            System.out.println("Internet " + internet +  " Menit = Rp." + hasiInternet);
            listData.add(hasiInternet);
        }else if(selectedSubMenuJenis == 2){
            System.out.print("JUMLAH WAKTU UNTUK MENGETIK (MENIT) > ");
            //this.typing = Float.valueOf(input.readLine());
            typing = Float.valueOf(input.readLine());
            hasilTyping = (typing/60) * 2000;
            System.out.println("Mengetik " + typing +  " Menit = Rp." + hasilTyping);
            listData.add(hasilTyping);
        }else if(selectedSubMenuJenis == 3){
            System.out.print("JUMLAH WAKTU UNTUK BERMAIN GAME ONLINE (MENIT) > ");
            gaming = Float.valueOf(input.readLine());
            hasilGaming = (gaming/60) * 5000;
            System.out.println("Game Online " + gaming +  " Menit = Rp." + hasilGaming);
            listData.add(hasilGaming);
        } else {
            System.out.println("PILIHAN TIDAK DITEMUKAN");
        }
    }

    //2
    public void insertFasilitasTambahan() throws IOException {
        System.out.println("\n[1] SCAN");
        System.out.println("[2] PRINT");
        System.out.println("[3] TEH BOTOL");
        System.out.print("\tINPUT PILIHAN > ");
        int selectedSubMenuFasilitas = Integer.valueOf(input.readLine());
        if(selectedSubMenuFasilitas == 1){
            System.out.print("JUMLAH FILE YANG DI SCAN > ");
            scan = Float.valueOf(input.readLine());
            hasilScan = scan * 1000;
            System.out.println("Scan " + scan +  " File = Rp." + hasilScan);
            listData.add(hasilScan);
        }else if(selectedSubMenuFasilitas == 2){
            System.out.println("\n[1] WARNA");
            System.out.println("[2] HITAM PUTIH ");
            System.out.print("\tINPUT > ");
            int selectionFasilitasPrint = Integer.valueOf(input.readLine());
            if(selectionFasilitasPrint == 1){
                System.out.print("PRINT WARNA BERAPA LEMBAR > ");
                printWarna = Float.valueOf(input.readLine());
                hasilPrintWarna = printWarna * 500;
                System.out.println("Print Warna " + printWarna +  " Lembar = Rp." + hasilPrintWarna);
                listData.add(hasilPrintWarna);
            } if (selectionFasilitasPrint == 2){
                System.out.print("PRINT HITAM PUTIH BERAPA LEMBAR > ");
                printBW = Float.valueOf(input.readLine());
                hasilPrintBW = printBW * 300;
                System.out.println("Print Hitam Putih " + printBW +  " Lembar = Rp." + hasilPrintBW);
                listData.add(hasilPrintBW);
            }
        }else if(selectedSubMenuFasilitas == 3){
            System.out.print("TEH BOTOL BERAPA BOTOL > ");
            tehBotol = Float.valueOf(input.readLine());
            hasilTehBotol = tehBotol * 3000;
            System.out.println("Teh Botol " + tehBotol +  " = Rp." + hasilTehBotol);
            listData.add(hasilTehBotol);
        }else{
            System.out.println("PILIHAN TIDAK DITEMUKAN");
        }

    }

    //3
    public void showAllInput() throws IOException {
        System.out.println();
        if (listData.isEmpty()){
            System.out.print("Data masih kosong, Silahkan input data!!");
        } else {
            for (int i = 0; i < listData.size(); i++){

                System.out.println(String.format("[%d] %s", i, listData.get(i)));
                //System.out.println("" + listData.get(listData.indexOf(i)) );


            }
        }
//        System.out.println("hasil Rp." + );
    }

    //4
    public void deleteInput() throws IOException{
        System.out.println();
        showAllInput();
        System.out.println("Pilih nomer data: ");
        int indexData = Integer.valueOf(input.readLine());


        // hapus index data
        listData.remove(indexData);
    }

    //5
    public void selesai() throws IOException{
        System.out.println("Total yang harus di bayar yaitu = Rp.0");
        System.exit(0);
    }

    public void customer() throws IOException{

        System.out.println("\nWELCOME WARNET \"CONNECT\"");
        System.out.println("[1] INSERT JENIS PENGUNAAN");
        System.out.println("[2] INSERT FASILITAS TAMBAHAN");
        System.out.println("[3] SHOW ALL INPUT");
        System.out.println("[4] DELETE INPUT");
        System.out.println("[5] SELESAI");
        System.out.println("[6] EXIT");
        System.out.println("[-] MEMBER/NON-MEMBER (SOON FITUR)");
        System.out.print("\tINPUT PILIHAN > ");
        selectedMenu = Integer.valueOf(input.readLine());

        switch (selectedMenu){
            case 1:
                insertJenisPengunaan();
                break;
            case 2:
                insertFasilitasTambahan();
                break;
            case 3:
                showAllInput();
                break;
            case 4:
                deleteInput();
                break;
            case 5:
                selesai();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("PILIHAN TIDAK DITEMUKAN");
        }
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        User x = new User();

        // memanggil dan menjalankan runCode sampe dimana kondidi False baru selesai.
        do{
            x.customer();
        } while (x.runCode);
    }
}
