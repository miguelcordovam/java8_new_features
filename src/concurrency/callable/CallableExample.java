package concurrency.callable;

import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) {

        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            } catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(task);

        System.out.println("future done? " + future.isDone());

        try {
            Integer result = future.get();
            System.out.println("future done? " + future.isDone());
            System.out.println("result: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
