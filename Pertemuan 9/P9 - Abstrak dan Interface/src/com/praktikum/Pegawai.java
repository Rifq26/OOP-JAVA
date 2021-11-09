package com.praktikum;

public class Pegawai extends Manusia {

    private String gelarBelakang;

    public String getGelarBelakang() {
        return gelarBelakang;
    }

    public void setGelarBelakang(String gelarBelakang) {
        this.gelarBelakang = gelarBelakang;
    }

    @Override
    public void dataSingkat() {
        this.namaLengkap();
        System.out.println("Umur: " + this.getUmur() + " Tahun");

    }

    @Override
    public void namaLengkap() {
        System.out.println("Nama Pegawai: " + this.getNamaDepan() + " " + this.getNamaBelakang() + "," + this.getGelarBelakang());
    }

    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();
        pegawai.setNamaDepan("Sopo");
        pegawai.setNamaBelakang("Sujarwo");
        pegawai.setUmur(17);
        pegawai.setGelarBelakang("S.Kom");
        pegawai.dataSingkat();
    }
}
