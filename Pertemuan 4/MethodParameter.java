/**
 * namafile : MethodParameter.java
 * tanggal, 23 September 2021
 */

public class MethodParameter {
    static void methodKu(String namaDepan, String namaBelakang){ // nama adlh parameter
        String nama = namaDepan + " " + namaBelakang;
        System.out.println("Selamat Datang " + nama);
    }
    
    public static void main(String[] args) {
        // pemanggilan method dgn argument
        methodKu("Rifqi", "Muhammad"); // Rifqi,Muhammad adlh argument
    }
}
