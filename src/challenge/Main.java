package challenge;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        //Find all transactions in the year 2011 and sort them by value (small to high).

        List<Transaction> txs = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        System.out.println(txs);

        //What are all the unique cities where the traders work?

        List<String> cities = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(toList());

        System.out.println(cities);

        //Find all traders from Cambridge and sort them by name.

        List<Trader> tradersFromCambridge =
                transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(t -> t.getCity().equalsIgnoreCase("Cambridge"))
                        .distinct()
                        .sorted(comparing(Trader::getName))
                        .collect(toList());

        System.out.println(tradersFromCambridge);

        // Return a string of all traders names sorted alphabetically.

        String result = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));

        System.out.println(result);

        // Are any traders based in Milan?

        boolean isThereTraderMilan = transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Milan"))
                .findFirst().isPresent();


        boolean milanBased = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));

        System.out.println(isThereTraderMilan);

        //Print all transactions values from the traders living in Cambridge.

        transactions.stream()
                .filter(t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .forEach(t -> System.out.println(t.getValue()));

        //What is the highest value of all the transactions?

        int highest = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Math::max).get();

        Optional<Integer> highestValue = transactions.stream().map(Transaction::getValue).reduce(Integer::max);

        System.out.println(highest);

        //Find the transaction with the smallest value.

        int smallest = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Math::min).get();

        Optional<Transaction> smallestTransaction =
                transactions.stream()
                        .min(comparing(Transaction::getValue));

        System.out.println(smallest);


        // Total txs

        int total = transactions.stream().mapToInt(Transaction::getValue).sum();
        System.out.println(total);

    }

}
