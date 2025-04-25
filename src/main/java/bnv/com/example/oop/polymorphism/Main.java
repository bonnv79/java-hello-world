package bnv.com.example.oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Output: Woof
        myCat.makeSound(); // Output: Meow
    }
}
