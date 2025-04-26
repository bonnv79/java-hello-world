package bnv.com.example.javaclasses.userinput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        System.out.println("nextBoolean is: " + myObj.nextBoolean());
        System.out.println("nextByte is: " + myObj.nextByte());
        System.out.println("nextDouble is: " + myObj.nextDouble());
        System.out.println("nextFloat is: " + myObj.nextFloat());
        System.out.println("nextInt is: " + myObj.nextInt());
        System.out.println("nextLong is: " + myObj.nextLong());
        System.out.println("nextShort is: " + myObj.nextShort());
    }
}
