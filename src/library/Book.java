package library;

public class Book {
	    protected String title;
	    protected String author;
	    protected int year;

	    public Book(String title, String author, int year) {
	        this.title = title;
	        this.author = author;
	        this.year = year;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public int getYear() {
	        return year;
	    }

	    @Override
	    public String toString() {
	        return title + " av " + author + " (" + year + ")";
	    }
	}
