class MessageThread extends Thread {
    private String message;

    public MessageThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message);
        }
    }
}

public class GreetingThreads {
    public static void main(String[] args) {
        Thread t1 = new MessageThread("Hello");
        Thread t2 = new MessageThread("Welcome");

        t1.start();
        t2.start();
    }
}
