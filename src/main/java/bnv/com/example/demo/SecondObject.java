package bnv.com.example.demo;

public class SecondObject {
    private int x = 1;
    protected int y;

    // Constructor function
    public SecondObject() {
    }

    public SecondObject(int x) {
        this.x = x;
    }

    public SecondObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void showXY() {
        System.out.println("x:y: " + x + ":" + y);
    }
}
