public class constructorParameters {
    int x;

    public constructorParameters(int y) {
        x = y;
    }
    public static void main(String[] args) {
        constructorParameters myObj = new constructorParameters(5);
        System.out.println(myObj.x);
    }
}
