import java.util.Scanner;

abstract class Manusia {

    protected static String namaKaryawan, ttl = "";
    protected static String ttl = null;
    protected static String domisili, jabatan;
    protected static int umur;
    Scanner inputKeyboard = new Scanner(System.in);

    public abstract void domisili();

    public void namaLengkap() {
        System.out.println("Nama :");
        namaKaryawan = inputKeyboard.nextLine();
    }
    public void umur() {
        System.out.println("Umur :");
        umur = inputKeyboard.nextInt()
    }

    public void ttl() {
        System.out.println("Tanggal lahir :");
        ttl = inputKeyboard.nextLine();
    }
}

class Pegawai extends Manusia {

    public void domisili(){
        System.out.println("Domisili :");
        domisili = inputKeyboard.nextLine();
    }
    public void jabatan(){
        System.out.println("Jabatan :");
        jabatan = inputKeyboard.nextLine();
    }

}

public class inputBiodataPegawai {
    
    public static void main(String[] args) {
        inputBiodataPegawai display = new inputBiodataPegawai();
        display.namaLengkap();
        display.umur();
        display.ttl();
        display.domisili();
    }
}
