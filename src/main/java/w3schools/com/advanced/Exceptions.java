package w3schools.com.advanced;

public class Exceptions {
    public static void main(String[ ] args) {
        /*
        Java try and catch
         */
        System.out.println("- Java try and catch");
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[0]);
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        System.out.println("- The throw keyword");
        /*
        The throw keyword
         */
        checkAge(15); // Set age to 15 ( which is below 18...)
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
