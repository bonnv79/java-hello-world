package w3schools.com.javaclasses.constructors;

public class Main {
    int modelYear;
    String modelName;

    public Main() {
        modelYear = 1990;
        modelName = "Kia";
    }

    public Main(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Main myCarDefault = new Main();
        System.out.println(myCarDefault.modelYear + " " + myCarDefault.modelName);

        Main myCar = new Main(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
