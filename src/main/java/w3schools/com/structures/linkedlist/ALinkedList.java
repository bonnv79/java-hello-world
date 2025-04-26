package w3schools.com.structures.linkedlist;

import java.util.LinkedList;

/*
When To Use
Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
 */

public class ALinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("- Loop through each item of the LinkedList");
        for (String i : cars) {
            System.out.println("Each item in a loop through the LinkedList: " + i);
        }

        cars.addFirst("Kia");
        System.out.println("- Add first: " + cars);

        cars.addLast("Toyota");
        System.out.println("- Add last: " + cars);

        cars.removeFirst();
        System.out.println("- Remove first: " + cars);

        cars.removeLast();
        System.out.println("- Remove last: " + cars);

        System.out.println("- Get first: " + cars.getFirst());
        System.out.println("- Get last: " + cars.getLast());
    }
}
