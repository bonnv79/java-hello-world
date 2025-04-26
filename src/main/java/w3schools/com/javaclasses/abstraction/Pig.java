package w3schools.com.javaclasses.abstraction;

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    // Overwrite sleep method
//    public void sleep() {
//        System.out.println("Zzz Zzz");
//    }
}