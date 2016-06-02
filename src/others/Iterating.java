package others;

public class Iterating {

    public static void main(String[] args) {

        String str = "Thisis111atestforjava8";

//		str.chars().forEach(System.out::println);
//		
//		str.chars()
//			.mapToObj(ch -> Character.valueOf((char)ch))
//			.forEach(System.out::println);

        str.chars()
                .filter(Character::isDigit)
                .mapToObj(ch -> Character.valueOf((char) ch))
                .forEach(System.out::println);

    }

}
