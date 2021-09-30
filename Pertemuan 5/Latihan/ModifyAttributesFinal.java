public class ModifyAttributesFinal {
    final int x = 10;
    public static void main(String[] args) {
        ModifyAttributesFinal myObj = new ModifyAttributesFinal();
        myObj.x = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);

        /*
            Kata final keyword berguna 
            ketika Anda ingin variabel selalu menyimpan nilai 
            yang sama, seperti PI (3,14159...).
        */
    }
}
