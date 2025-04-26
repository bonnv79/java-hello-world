package w3schools.com.structures.hashset;

import java.util.HashSet;

public class AHashSet {
    public static void main(String[] args) {
        /*
        Add items
        to add items to it, use the add() method
         */
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println("- Add items to HashSet: " + cars);

        /*
        Check if an item exits
        To check whether an item exits in a HashSet, use the contains() method
         */
        System.out.println("- Check if Mazda item exits: " + cars.contains("Mazda"));

        /*
        Remove an item
        to remove an item, use the remove() method
         */
        cars.remove("Volvo");
        System.out.println("- Remove Volvo item: " + cars);

        /*
        To remove all items, use the clear() mothed
         */
        cars.clear();
        System.out.println("- Remove all items: " + cars);

        /*
        Add the items back to the HashSet
         */
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        /*
        HashSet size
        To find out how many items there are, use the size() method
         */
        System.out.println("- HashSet size: " + cars.size());

        /*
        Loop through a HashSet
        Loop through the items of an HashSet with a for-each loop
         */
        System.out.println("- Loop through a HashSet");
        for (String i : cars) {
            System.out.println("Item: " + i);
        }

        /*
        Other types
        Use a HashSet that stores Integer object
         */
        HashSet<Integer> numbers = new HashSet<Integer>();
        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // show which numbers between 1 and 10 are in the set
        System.out.println("- Show which numbers between 1 and 10 are in the set");
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }

    }
}
