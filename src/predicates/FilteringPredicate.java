package predicates;

import util.Book;
import util.BookType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilteringPredicate {

    private static void print(String message, List<Book> books) {
        System.out.println(message);
        books.forEach(System.out::println);
    }

    private static List<Book> filterBy(List<Book> books, Predicate<Book> condition) {

        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            if (condition.test(book)) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }


//    private static List<Book> filterByBefore2000(List<Book> books) {
//        List<Book> filteredBooks = new ArrayList<>();
//
//        for (Book book : books) {
//            if (book.getYear() < 2000) {
//                filteredBooks.add(book);
//            }
//        }
//
//        return filteredBooks;
//
//    }
//
//    private static List<Book> filterByPriceLowerThan16(List<Book> books) {
//        List<Book> filteredBooks = new ArrayList<>();
//
//        for (Book book : books) {
//            if (book.getPrice() < 16.0) {
//                filteredBooks.add(book);
//            }
//        }
//
//        return filteredBooks;
//
//    }

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


        Predicate<Book> before2000 = (Book b) -> b.getYear() < 2000;
        Predicate<Book> priceLowerThan16 = (Book b) -> b.getPrice() < 16.0;


        List<Book> booksBefore2000 = filterBy(books, before2000);
        List<Book> booksLowerThan16 = filterBy(books, priceLowerThan16);

        print("Books before 2000: ", booksBefore2000);
        print("Books lower than $16: ", booksLowerThan16);


    }

}
