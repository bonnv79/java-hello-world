package w3schools.com.javaclasses.innerclasses;

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println("Inner class: " + myInner.y + myOuter.x);

        // Private Inner Class
        // If you don't want outside objects to access the inner class, declare the class as private
//        OuterClass.PrivateInnerClass myPrivateInner = myOuter.new PrivateInnerClass();
//        System.out.println(myPrivateInner.y + myPrivateInner.x);

        // Static Inner Class
        OuterClass.StaticInnerClass myStaticInner = new OuterClass.StaticInnerClass();
        System.out.println("Static inner class: " + myStaticInner.y);

        // Access Outer Class From Inner Class
        OuterClass.MethodInnerClass myMethodInner = myOuter.new MethodInnerClass();
        System.out.println("Method inner class: " + myMethodInner.myInnerMethod());
    }
}