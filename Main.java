class NumberPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberPrinter t = new NumberPrinter();
        t.start(); // start the thread
    }
}
