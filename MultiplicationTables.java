class TableThread extends Thread {
    private int number;

    public TableThread(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class MultiplicationTables {
    public static void main(String[] args) {
        Thread t1 = new TableThread(5);
        Thread t2 = new TableThread(10);

        t1.start();
        t2.start();
    }
}
