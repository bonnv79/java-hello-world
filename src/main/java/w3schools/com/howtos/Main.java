package w3schools.com.howtos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*
        Count Number of Words in a String
         */
        System.out.println("=====================================================================");
        System.out.println("- Count Number of Words in a String");
        String words = "One Two Three Four";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);

         /*
        Java How To Reverse a String
         */
        System.out.println("=====================================================================");
        System.out.println("- Java How To Reverse a String");
        String originalStr = "Hello";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: " + reversedStr);

        /*
        Calculate the Sum of an Array
         */
        System.out.println("=====================================================================");
        System.out.println("- Calculate the Sum of an Array");
        int[] myArray = {1, 5, 10, 25};
        int sum = 0;

// Loop through the array elements and store the sum in the sum variable
//        for (int i = 0; i < myArray.length; i++) {
//            sum += myArray[i];
//        }
        for (int i : myArray) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);

        /*
        Convert a String to an Array
         */
        System.out.println("=====================================================================");
        System.out.println("- Convert a String to an Array");
        // Create a string
        String myStr = "Hello";

// Convert the string to a char array
        char[] myArray1 = myStr.toCharArray();
        for (char i1 : myArray1) {
            System.out.println(i1);
        }

        /*
        Java How To Sort an Array
         */
        System.out.println("=====================================================================");
        System.out.println("- Java How To Sort an Array");
        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
        Arrays.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }

        /*
        How To Calculate the Average of Array Elements
         */
        System.out.println("=====================================================================");
        System.out.println("- How To Calculate the Average of Array Elements");
        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum1 = 0;

// Get the length of the array
        int length = ages.length;

// Loop through the elements of the array
        for (int age : ages) {
            sum1 += age;
        }

// Calculate the average by dividing the sum1 by the length
        avg = sum1 / length;

// Print the average
        System.out.println("The average age is: " + avg);

        /*
        How To Find the Smallest Element in an Array
         */
        System.out.println("=====================================================================");
        System.out.println("- How To Find the Smallest Element in an Array");
        // An array storing different ages1
        int ages1[] = {20, 22, 18, 35, 48, 26, 87, 70, 1};

// Create a 'lowest age' variable and assign the first array element of ages1 to it
        int lowestAge = ages1[0];

// Loop through the elements of the ages1 array to find the lowest age
        for (int age : ages1) {
            // Check if the current age is smaller than the current 'lowest age'
            if (lowestAge > age) {
                // If the smaller age is found, update 'lowest age' with that element
                lowestAge = age;
            }
        }

// Output the value of the lowest age
        System.out.println("The lowest age in the array is: " + lowestAge);

        /*
        Loop Through an ArrayList
         */
        System.out.println("=====================================================================");
        System.out.println("- Loop Through an ArrayList");
        ArrayList<String> cars1 = new ArrayList<String>();
        cars1.add("Volvo");
        cars1.add("BMW");
        cars1.add("Ford");
        cars1.add("Mazda");
        for (String i : cars1) {
            System.out.println(i);
        }

         /*
        Loop Through a HashMap
         */
        System.out.println("=====================================================================");
        System.out.println("- Loop Through a HashMap");
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        // Print keys
        System.out.println("+ Print keys");
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        // Print values
        System.out.println("+ Print values");
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        // Print keys and values
        System.out.println("+ Print keys and values");
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

          /*
        Loop Through an Enum
         */
        System.out.println("=====================================================================");
        System.out.println("- Loop Through an Enum");
        enum Level {
            LOW,
            MEDIUM,
            HIGH
        }
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }

          /*
        Area of Rectangle
         */
        System.out.println("=====================================================================");
        System.out.println("- Area of Rectangle");
        int length1 = 5;
        int width = 2;
        int area = length1 * width;
        System.out.println("Area of rectangle: " + area);

          /*
        Check Whether a Number is Even or Odd
         */
        System.out.println("=====================================================================");
        System.out.println("- Check Whether a Number is Even or Odd");
        int number = 5;

// Find out if the number above is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

          /*
        Check Whether a Number is Even or Odd
         */
        System.out.println("=====================================================================");
        System.out.println("- Check Whether a Number is Even or Odd");
        int myNum = 10; // Is this a positive or negative number?

        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }

          /*
        Square Root of a Number
         */
        System.out.println("=====================================================================");
        System.out.println("- Square Root of a Number");
        System.out.println("Find the square root of 64: " + Math.sqrt(64));

        /*
        How To Generate a Random Number
         */
        System.out.println("=====================================================================");
        System.out.println("- How To Generate a Random Number");
        System.out.println("Math.random(): " + Math.random());
        int randomNum = (int)(Math.random() * 101); // 0 to 100
        System.out.println("Random from 0 to 100: " + randomNum);

    }
}
