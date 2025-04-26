package w3schools.com.structures.listsorting;

import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {
    public static void main(String[] args) {

        /*
        Sort an ArrayList of Strings alphabetically in ascending order:
         */
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars);  // Sort cars

        System.out.println("- Sort an ArrayList of Strings alphabetically in ascending order");
        for (String i : cars) {
            System.out.println(i);
        }

        /*
        Sort an ArrayList of Integers numerically in ascending order:
         */
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        System.out.println("- Sort an ArrayList of Integers numerically in ascending order");
        for (int i : myNumbers) {
            System.out.println(i);
        }

        /*
        Reverse the Order
         */
//        Collections.sort(cars, Collections.reverseOrder()); // Sort cars
        cars.sort(Collections.reverseOrder()); // Sort cars

        System.out.println("- Sort an ArrayList of Strings alphabetically in descending order");
        for (String i : cars) {
            System.out.println(i);
        }


//        Collections.sort(myNumbers, Collections.reverseOrder()); // Sort myNumbers
        myNumbers.sort(Collections.reverseOrder()); // Sort myNumbers

        System.out.println("- Sort an Arraylist of Integers numerically in descending order");
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
