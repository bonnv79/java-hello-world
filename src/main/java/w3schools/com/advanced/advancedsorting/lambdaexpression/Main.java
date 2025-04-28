package w3schools.com.advanced.advancedsorting.lambdaexpression;

import w3schools.com.advanced.advancedsorting.comparators.Car;
import w3schools.com.advanced.advancedsorting.comparators.SortByYear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Create a list of cars
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        // Use a lambda expression as a comparator:
        Collections.sort(myCars, (obj1, obj2) -> {
            Car a = (Car) obj1;
            Car b = (Car) obj2;
            if (a.year < b.year) return -1;
            if (a.year > b.year) return 1;
            return 0;
        });

        // Display the cars
        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}
