package w3schools.com.structures.wrapperclass;

public class WrapperClass {
    public static void main(String[] args) {

        System.out.println("- Creating wrapper objects");
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        System.out.println("- You can use certain methods to get information about the specific object.");
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        /*
        Other useful method is the toString() method, which is used to covert wrapper objects to strings
         */
        Integer myInt1 = 100;
        String myString = myInt1.toString();
        System.out.println("- Covert wrapper objects to strings: " + myString);
    }
}
