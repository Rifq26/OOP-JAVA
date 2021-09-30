public class MultipleAttributes {
    String fname = "John", lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        MultipleAttributes myObj = new MultipleAttributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
