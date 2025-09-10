class SquarePrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
        }
    }
}

public class SquareThread {
    public static void main(String[] args) {
        Thread t = new Thread(new SquarePrinter());
        t.start();
    }
}
