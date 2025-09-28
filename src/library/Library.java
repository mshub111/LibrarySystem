package library;


import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchByTitle(String searchTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                return book;
            }
        }
        return null;
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Inga böcker i biblioteket");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    // Bubble Sort för årtal
    public void sortByYear() {
        int n = books.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (books.get(j).getYear() > books.get(j + 1).getYear()) {
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        System.out.println("Böckerna är sorterade efter år.");
    }
}
