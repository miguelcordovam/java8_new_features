package concurrency.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExample {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newWorkStealingPool();
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()-> "test", pool);

        System.out.println(future.isDone());

        future.thenAccept(System.out::println);
    }
}
