package library;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Library library = new Library();
    boolean running = true;

    while (running) {
    System.out.println("Bibliotekssystem");
    System.out.println("1. Lägg till bok");
	System.out.println("2. Lägg till e-bok");
	System.out.println("3. Sök bok");
    System.out.println("4. Visa alla böcker");
	System.out.println("5. Sortera böcker efter år");
	System.out.println("6. Avsluta");
	System.out.print("Välj: ");
	int choice = scanner.nextInt();
	scanner.nextLine();

	switch (choice) {
		case 1:
		       System.out.print("Titel: ");
		       String title = scanner.nextLine();
		       System.out.print("Författare: ");
		       String author = scanner.nextLine();
		       System.out.print("År: ");
		       int year = scanner.nextInt();
		       scanner.nextLine();
		       library.addBook(new Book(title, author, year));
		       System.out.println("Bok tillagd!");
		       break;

		 case 2:
		        System.out.print("Titel: ");
		        String eTitle = scanner.nextLine();
		        System.out.print("Författare: ");
		        String eAuthor = scanner.nextLine();
		        System.out.print("År: ");
		        int eYear = scanner.nextInt();
		        scanner.nextLine();
		        System.out.print("Format: ");
		        String format = scanner.nextLine();
		        library.addBook(new Ebook(eTitle, eAuthor, eYear, format));
		        System.out.println("E-bok tillagd!");
		        break;

		  case 3:
		         System.out.print("Skriv titel att söka: ");
		         String searchTitle = scanner.nextLine();
		         Book found = library.searchByTitle(searchTitle);
		         if (found != null) {
		         System.out.println("Hittade: " + found);
		         } else {
		         System.out.println("Ingen bok hittades.");
		        }
		         break;

		  case 4:
		          library.showAllBooks();
		          break;

		  case 5:
		         library.sortByYear();
		         library.showAllBooks();
		         break;

		  case 6:
		         running = false;
		         System.out.println("Avslutar...");
		         break;

		  default:
		          System.out.println("Fel val, försök igen!");
		            }
		        }
		        scanner.close();
		    }
		}

