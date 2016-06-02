package comparing;

import util.Book;
import util.BookType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComposingComparators {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Hope to die", 2014, 400, BookType.THRILLER, "James Patterson", 12.65));
        books.add(new Book("The Notebook", 2014, 272, BookType.ROMANCE, "Nicholas Sparks", 15.89));
        books.add(new Book("NYPD Red", 2014, 400, BookType.THRILLER, "James Patterson", 14.55));
        books.add(new Book("The Catcher in the Rye", 1991, 224, BookType.FICTION, "J D Salinger", 6.25));
        books.add(new Book("Refactoring", 1999, 464, BookType.TEXTBOOK, "Martin Fowler", 36.05));
        books.add(new Book("NoSql Distilled", 2012, 192, BookType.TEXTBOOK, "Martin Fowler", 31.01));
        books.add(new Book("Facts and fallacies of Sofware Engineering", 2002, 224, BookType.TEXTBOOK, "Robert Glass", 38.86));
        books.add(new Book("Software Creativity", 2006, 484, BookType.TEXTBOOK, "", 23.02));
        books.add(new Book("The Wedding", 2005, 304, BookType.ROMANCE, "Nicholas Sparks", 13.60));


        // Sorting

        books.sort(Comparator.comparing((Book book) -> book.getYear()));

        //Using method references, shorter and more readable
        books.sort(Comparator.comparing(Book::getYear));

        //Composing comparators
        books.sort(Comparator.comparing(Book::getYear).thenComparing(Book::getTitle));

        //Reversing
        books.sort(Comparator.comparing(Book::getYear).reversed());

        books.forEach(System.out::println);
    }

}
