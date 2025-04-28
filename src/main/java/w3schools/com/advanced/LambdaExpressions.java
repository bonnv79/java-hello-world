package w3schools.com.advanced;

import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        System.out.println("- Use a lambda expression in the ArrayList's forEach() method to print every item in the list:");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {
            System.out.println(n);
        });

        System.out.println("- Use Java's Consumer interface to store a lambda expression in a variable:");
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        System.out.println("- Create a method which takes a lambda expression as a parameter:");
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
