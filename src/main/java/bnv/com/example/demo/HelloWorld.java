package bnv.com.example.demo;

import java.util.Arrays;

public class HelloWorld {// String

    public static void main(String[] args) {
        System.out.println("hello world");

        System.out.println("===================================");
        System.out.println("demo types");
        System.out.println(TypesClass.myNum);
        System.out.println(TypesClass.myFloatNum);
        System.out.println(TypesClass.myLetter);
        System.out.println(TypesClass.myBool);
        System.out.println(TypesClass.myText);

        System.out.println("===================================");
        System.out.println("demo if");
        checkNumber(20);

        System.out.println("===================================");
        System.out.println("demo switch");
        checkDay(1);
        checkDay(0);

        System.out.println("===================================");
        System.out.println("demo while");
        demoWhile(5);

        System.out.println("===================================");
        System.out.println("demo For Break");
        demoForBreak(5);

        System.out.println("===================================");
        System.out.println("demo For Continue");
        demoForContinue(5);

        System.out.println("===================================");
        System.out.println("demo array");
        demoArray();

        System.out.println("===================================");
        System.out.println("demo for array");
        demoForArray();

        System.out.println("===================================");
        System.out.println("demo Multi-Dimensional Array");
        demoMultiDimensionalArray();

        System.out.println("===================================");
        System.out.println("demo object");
        demoObject();
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

    public static void demoWhile(int n) {
        int i = 0;
        while (i < n) {
            System.out.println("while: " + i);
            i++;
        }
    }

    public static void demoForBreak(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("for break: " + i);
        }
    }

    public static void demoForContinue(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("for continue: " + i);
        }
    }

    public static void demoArray() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println("first item: " + cars[0]);
        System.out.println(Arrays.toString(cars));
        System.out.println("length: " + cars.length);
    }

    public static void demoForArray() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println("Loop Through an Array");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("Loop Through an Array with For-Each");
        for (String i : cars) {
            System.out.println(i);
        }
    }

    public static void demoMultiDimensionalArray() {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};

        System.out.println("Loop Through a Multi-Dimensional Array");
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println("[" + i + "]" + "[" + j + "]" + " : " + myNumbers[i][j]);
            }
        }

        System.out.println("Loop Through a Multi-Dimensional Array (for-each)");
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println("[" + i + "]" + " : " + i);
            }
        }
    }

    public static void demoObject() {
        MainObject mObj = new MainObject();
        System.out.println("Main object: " + mObj.x);

        SecondObject a = new SecondObject();
        SecondObject a1 = new SecondObject(2);
        SecondObject a2 = new SecondObject(3, 4);
        SecondObject[] array = {a, a1, a2};

        for (SecondObject i : array) {
//            System.out.println("x:y: " + i.getX() + ":" + i.getY());
            i.showXY();
        }
    }


}

