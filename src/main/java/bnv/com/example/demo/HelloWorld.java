package bnv.com.example.demo;

public class HelloWorld {
    int myNum = 5;               // Integer (whole number)
    float myFloatNum = 5.99f;    // Floating point number
    char myLetter = 'D';         // Character
    boolean myBool = true;       // Boolean
    String myText = "Hello";     // String

    public static void main(String[] args) {
        System.out.println("hello world");

        System.out.println("===================================");
        System.out.println("demo if");
        checkNumber(20);

        System.out.println("===================================");
        System.out.println("demo switch");
        checkDay(1);
        checkDay(0);
    }

    public static void checkNumber(int x) {
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("y is greater than x");
        }
    }

    public static void checkDay(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }
}

