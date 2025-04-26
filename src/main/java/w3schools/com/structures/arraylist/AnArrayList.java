package w3schools.com.structures.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class AnArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // You can also add an item at a specified position by referring to the index number:
        cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)

        System.out.println("- ArrayList items: " + cars);

        // Access an Item
        String carName = cars.get(0);
        System.out.println("- Access an Item 0: " + carName);

        // Change an Item
        cars.set(0, "Opel");
        System.out.println("- Change an Item 0: " + cars.get(0));

        // Remove an Item
        cars.remove(0);
        System.out.println("- Remove an Item 0:" + cars);

        // To remove all the elements in the ArrayList
        cars.clear();
        System.out.println("- Remove all the items: " + cars);

        // Add the items to ArrayList again
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // ArrayList size
        // To find out how many elements an ArrayList have, use the size method
        int arrayListSize = cars.size();
        System.out.println("- ArrayList size: " + arrayListSize);

        // Loop through an ArrayList
        // Loop through the elements of an ArrayList with a for loop
        System.out.println("- Loop through the elements of an ArrayList with a for loop");
        for (String i : cars) {
            System.out.println("each item in the loop: " + i);
        }

        // Other types
        // Create an ArrayList to store number (add elements of type Integer)
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        System.out.println("- Create an ArrayList to store number (add elements of type Integer)");
        for (int i : myNumbers) {
            System.out.println("Each item in a loop through an Arraylist of Integers: " + i);
        }

        // Sort an ArrayList
        Collections.sort(cars); // sort cars
        System.out.println("- Sort an ArrayList of Strings in ascending order");
        for (String i : cars) {
            System.out.println("Sorted an ArrayList of Strings: " + i);
        }

        // Sort an ArrayList of Integers
        myNumbers.add(33);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);
        Collections.sort(myNumbers);
        System.out.println("- Sort an ArrayList of Integers in ascending order");
        for (int i : myNumbers) {
            System.out.println("Sorted the ArrayList of Integers: " + i);
        }
    }
}
