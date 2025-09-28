package library;

public class Ebook extends Book {
    private String format;

    public Ebook(String title, String author, int year, String format) {
        super(title, author, year);
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + " [Format: " + format + "]";
    }

	}
