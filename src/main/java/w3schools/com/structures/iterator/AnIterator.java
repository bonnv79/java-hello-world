package w3schools.com.structures.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class AnIterator {
    public static void main(String[] args) {
        /*
        Getting an Iterator
        Make a collection
         */
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get an iterator
        Iterator<String> it = cars.iterator();
        System.out.println("- Print the first item: " + it.next());

        /*
        looping through a collection
         */
        System.out.println("- Looping through a collection");
        while (it.hasNext()) {
            System.out.println("Item: " + it.next());
        }

        /*
        Removing items from a collection
         */
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        System.out.println("- Removing items from a collection");
        Iterator<Integer> item = numbers.iterator();
        while (item.hasNext()) {
            Integer i = item.next();
            if (i < 10) {
                item.remove();
            }
        }
        System.out.println("Items: " + numbers);
    }
}
