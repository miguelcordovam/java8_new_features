package streams.parallel;

import java.util.function.Function;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SequentialSum {

    public static long measureSumPerf(Function<Long, Long> adder, long n) {

        long fastest = Long.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;

            if (duration < fastest){
                fastest = duration;
            }
        }

        return fastest;
    }

    private static long sum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .reduce(0L, Long::sum);

    }

    private static long longStreamSum(long n) {
        return LongStream.rangeClosed(1, n).reduce(0L, Long::sum);

    }

    private static long longStreamParallelSum(long n) {
        return LongStream.rangeClosed(1, n).parallel().reduce(0L, Long::sum);

    }

    private static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n).parallel()
                .reduce(0L, Long::sum);

    }

    private static long iterativeSum(long n) {
        long result = 0;
        for (long i = 1L; i <= n; i++) {
            result += i;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Sequential: " + measureSumPerf(SequentialSum::sum, 10_000_000));

        System.out.println("Parallel: " + measureSumPerf(SequentialSum::parallelSum, 10_000_000));

        System.out.println("Iterative: " + measureSumPerf(SequentialSum::iterativeSum, 10_000_000));

        System.out.println("LongStream: " + measureSumPerf(SequentialSum::longStreamSum, 10_000_000));

        System.out.println("ParallelLongStream: " + measureSumPerf(SequentialSum::longStreamParallelSum, 10_000_000));

    }

}
