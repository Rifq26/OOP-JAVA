public class Objek1 {

    public void pesan(String nama){
        System.out.println(nama + " Selamat datang di OOP Java");
    }
    static void test(){
        System.out.println("test Aja");
    }
    public static void main(String[] args) {
        Objek1 obj1 = new Objek1();
        Objek1 obj2 = new Objek1();
        obj1.pesan("Rifqi");
        obj1.pesan("Romie");
        obj2.test();
        Objek1.test();
    }
}
