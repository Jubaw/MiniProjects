package LibraryBookManagementSystem;

import javax.xml.crypto.Data;
import java.awt.print.Book;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    static Scanner scanner = new Scanner(System.in);


    Books books = new Books();
    Database database = new Database();


    public void startMenu() {
        String menuSelection;
        do {
            System.out.println("""
                    Welcome to the library,please select from the menu.\s
                    1.Find book by author name\s
                    2.Find author by book name
                    3.Find book by genre
                    4.Add Book
                    5.List Books
                    6.Exit""");
            menuSelection = scanner.nextLine();
            switch (menuSelection) {
                case "1":
                    findBookByAuthor();
                    break;
                case "2":
                    findAuthorByBook();
                    break;
                case "3":
                    findBookByGenre();
                    break;
                case "4":
                    addBook();
                    break;
                case "5":
                    listBooks();
                    break;
                case "6":
                    exit();
                    return;
                default:
                    System.out.println("Invalid selection, choose from 1 to 6");

            }


        } while (!menuSelection.equalsIgnoreCase("6"));
    }


    public void findBookByAuthor() {
        String input;
        do {
            boolean isFound = false;
            System.out.println("Enter the author name");
            String authorNameInput = scanner.nextLine();
            for (Books book : database.getBooksList()) {
                if (book.getBookAuthor().equalsIgnoreCase(authorNameInput)) {
                    System.out.println("Book found:" + book.getBookName());
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("Book not found for: " + authorNameInput);
            }

            do {
                System.out.println("Search another book? Y/N");
                input = scanner.nextLine();
                if (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
                    System.out.println("Invalid input. Please enter 'Y' for yes or 'N' for no.");
                }
            } while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N"));
        } while (input.equalsIgnoreCase("Y"));
    }

    public void findAuthorByBook() {
        String input;
        do {
            boolean isFound = false;
            System.out.println("Enter the book name");
            String bookNameInput = scanner.nextLine();
            for (Books book : database.getBooksList()) {
                if (book.getBookName().equalsIgnoreCase(bookNameInput)) {
                    System.out.println("Author found : " + book.getBookAuthor());
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("Author is not found for: " + bookNameInput);
            }
            do {
                System.out.println("Find another author ? Y/N");
                input = scanner.nextLine();
                if (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
                    System.out.println("Invalid input. Please enter 'Y' for yes or 'N' for no.");
                }
            } while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N"));


        } while (input.equalsIgnoreCase("Y"));
    }

    public void findBookByGenre() {
        String input;
        do {

            boolean isFound = false;
            System.out.println("Enter the genre");
            String genreInput = scanner.nextLine();
            for (Books genre : database.getBooksList()) {
                if (genre.getBookGenre().equalsIgnoreCase(genreInput)) {
                    System.out.println("Books according to genre: " + genre.getBookName());
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("Could not find book according: " + genreInput);
            }

            do {
                System.out.println("Search another genre? (Y/N):");
                input = scanner.nextLine();
                if (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
                    System.out.println("Invalid input. Please enter 'Y' for yes or 'N' for no.");
                }
            } while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N"));
        } while (input.equalsIgnoreCase("Y"));
    }


    public static void exit() {
        System.out.println("Exiting program...");
        System.exit(0);
    }


    public void addBook(){
        System.out.println("Bookname: ");
        String name = scanner.nextLine();

        System.out.println("Book author: ");
        String author = scanner.nextLine();

        System.out.println("Book price: ");
        int price = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Genre: ");
        String genre = scanner.nextLine();

        Books newBook = new Books(name,author,price,genre);
        database.addBook(newBook);

        System.out.println(STR."Book added\nName:\{name}\nAuthor: \{author}\nPrice: \{price}\nGenre: \{genre}");

        System.out.println("Add new book ? Y/N");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Y")){
            addBook();
        }

    }


    public void listBooks(){
        List<Books> books = database.getBooksList();
        if (books.isEmpty()){
            System.out.println("There are no books in library");
        }else{
            for (Books book : database.getBooksList()){
                System.out.println("======================");
                System.out.println("Book Name: " + book.getBookName() +
                        "\nAuthor: " + book.getBookAuthor() +
                        "\nPrice: $" + book.getBookPrice() +
                        "\nGenre: " + book.getBookGenre());
            }
            System.out.println("======================");
        }

    }


}
