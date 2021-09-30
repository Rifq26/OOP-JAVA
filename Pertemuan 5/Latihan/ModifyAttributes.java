public class ModifyAttributes {

    int x = 20, y;

    public static void main(String[] args) {
        ModifyAttributes myObj = new ModifyAttributes();
        myObj.x = 40; // x is now 40
        myObj.y = 2;
        System.out.println(myObj.x);
        System.out.println(myObj.y);

    }
    
}
