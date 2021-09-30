public class constructorParameters1 {
    int modelYear;
    String modelName;

    public constructorParameters1(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        constructorParameters1 myCar = new constructorParameters1(2002, "BMW");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
