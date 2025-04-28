package w3schools.com.advanced.threads;

public class AnRunnable implements Runnable {
    public static void main(String[] args) {
        AnRunnable obj = new AnRunnable();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
