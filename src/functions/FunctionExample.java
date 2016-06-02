package functions;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
	
		Function<Integer, Integer> f = x -> x + 1;
		Function<Integer, Integer> g = x -> x * 2;
		Function<Integer, Integer> h = f.andThen(g);
		Function<Integer, Integer> h2 = f.compose(g);
		
		int result = h.apply(10);
		int result2 = h2.apply(10);
		
		System.out.println(result);
		System.out.println(result2);
	}
}
