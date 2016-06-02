package collectors;

import util.Dish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsExamples {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));


        // Comparator
        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);

        Optional<Dish> mostCalorieDish = menu.stream().collect(Collectors.maxBy(dishCaloriesComparator));

        System.out.println(mostCalorieDish.get());

        //Summarization

        int totalCalories = menu.stream().collect(Collectors.summingInt(Dish::getCalories));

        //Average

        double avgCalories = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println("total: " + totalCalories);
        System.out.println("avg: " + avgCalories);


        //Summarizing statistics

        IntSummaryStatistics menuStats = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));

        System.out.println(menuStats);

        // Joining

        String shortMenu = menu.stream().map(Dish::getName).collect(Collectors.joining(","));
        System.out.println(shortMenu);

        // Total
        int totalCalories2 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (i, j) -> i + j));
        System.out.println(totalCalories2);

        int totalCalories3 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));
        System.out.println(totalCalories3);
    }


}
