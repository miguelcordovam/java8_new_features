package concurrency.runnable;

public class RunableExample {

    public static void main(String[] args) {

        Runnable task = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Hello " + name);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");
    }
}
