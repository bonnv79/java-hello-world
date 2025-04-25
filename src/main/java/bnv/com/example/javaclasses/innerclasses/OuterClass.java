package bnv.com.example.javaclasses.innerclasses;

public class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }

    private class PrivateInnerClass {
        int y = 5;
    }

    static class StaticInnerClass {
        int y = 5;
    }

    class MethodInnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}
