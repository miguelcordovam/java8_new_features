package util;

public class Book {

	private String title;
	private int year;
	private int numberOfPages;
	private BookType type;
	private String authorName;
	private double price;

	public Book(String title, int year, int numberOfPages, BookType type,
			String authorName, double price) {
		this.title = title;
		this.year = year;
		this.numberOfPages = numberOfPages;
		this.type = type;
		this.authorName = authorName;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public BookType getType() {
		return type;
	}

	public void setType(BookType type) {
		this.type = type;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return title + " - " + year + " - " + authorName + " - " + type.toString() + " - " + price ;
	}

	
	
}
