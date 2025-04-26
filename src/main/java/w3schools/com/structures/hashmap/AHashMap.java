package w3schools.com.structures.hashmap;

import java.util.HashMap;

public class AHashMap {
    public static void main(String[] args) {

        /*
        Add items: to add items to it, use the put() method
         */
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println("- HashMap: " + capitalCities);

        /*
        Access an item: to access a value in the HashMap, use the get() method to and refer to its key
         */
        System.out.println("- Access the England item: " + capitalCities.get("England"));

        /*
        Remove an item: to remove an item, use the remove() method and refer to the key
         */
        capitalCities.remove("England");
        System.out.println("- Remove the England item: " + capitalCities);

        /*
        To remove all items, use the clear() method
         */
        capitalCities.clear();
        System.out.println("- Remove all items: " + capitalCities);

        /*
        Add items again
         */
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        /*
        HashMap size
        To find out how many items there are, use the size() method
         */
        System.out.println("- HashMap size: " + capitalCities.size());

        /*
        Loop through a HashMap
        Loop through the items of a HashMap with a for-each loop
         */
        // print keys
        System.out.println("- Print keys");
        for (String i : capitalCities.keySet()) {
            System.out.println("loop through each key: " + i);
        }

        // print values
        System.out.println("- Print values");
        for (String i : capitalCities.values()) {
            System.out.println("loop through each value: " + i);
        }

        // print keys and values
        System.out.println("- Print keys and values");
        for (String key : capitalCities.keySet()) {
            System.out.println("loop through each key and value: " + key + ":" + capitalCities.get(key));
        }

        /*
        Other types
         */
        System.out.println("- Create a HashMap object called people that will store String keys and Integer values");
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String key : people.keySet()) {
            System.out.println("key: " + key + " - value: " + people.get(key));
        }
    }
}
