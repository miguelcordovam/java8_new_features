package streams;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

import streams.Dish.Type;

public class Filtering {

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
				new Dish("salmon", false, 450, Dish.Type.FISH) );
		
		
		List<String> threeHighCaloricDishNames = menu.stream()
				.filter(d -> {System.out.println("filtering: " + d.getName()); return d.getCalories() > 300;})
				.map(Dish::getName).limit(3).collect(toList());
		System.out.println(threeHighCaloricDishNames);
		
		// Filtering with a predicate
		System.out.println("*************************************");
		List<Dish> vegetarianMenu = menu.stream()
									.filter(Dish::isVegetarian)
									.collect(toList());
		
		vegetarianMenu.forEach(System.out::println);
		
		System.out.println("*************************************");
		
		//Filtering with limit
		
		List<Dish> dishes = menu.stream()
				.filter(d -> d.getCalories() > 400)
				.limit(3)
				.collect(toList());
		
		dishes.forEach(System.out::println);
		
		System.out.println("*************************************");

		//Skip
		
		List<Dish> dishesSkipped = menu.stream()
				.filter(d -> d.getCalories() > 300)
				.skip(2)
				.collect(toList());
		dishesSkipped.forEach(System.out::println);
		
		System.out.println("*************************************");
		//First 2 meat dishes
		
		List<Dish> firstTwoDishes = menu.stream()
				.filter(d -> d.getType() == Type.MEAT)
				.limit(2)
				.collect(toList());
		
		firstTwoDishes.forEach(System.out::println);
		
		
		System.out.println("*************************************");
		//Mapping
		
		List<String> dishNames = menu.stream()
				.map(Dish::getName)
				.collect(toList());

		System.out.println(dishNames);
		
		List<String> words = Arrays.asList("Java8", "Learning", "Developer", "in", "abc");
		
		List<Integer> wordsLength = words.stream().map(String::length).collect(toList());
		System.out.println(wordsLength);

		List<Integer> dishNameLengths = menu.stream()
				.map(Dish::getName)
				.map(String::length)
				.collect(toList());
        System.out.println(dishNameLengths);
    }
	
}
