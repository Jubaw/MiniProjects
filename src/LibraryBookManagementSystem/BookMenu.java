package LibraryBookManagementSystem;

import java.awt.print.Book;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BookMenu {
    static Scanner scanner = new Scanner(System.in);


    Books books = new Books();
    Database database = new Database();





    public void startMenu(){
        String exit;
        do {
            System.out.println("Welcome to the library,please select from the menu. " +
                    "\n1.Find book by author name " +
                    "\n2.Find author by book name" +
                    "\n3.Find book by genre\n4.Exit") ;
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input){
                case 1:
                    findBookByAuthor();
                    break;

                case 2:
                    findAuthorByBook();
                    break;
                case 3:
                    findBookByGenre();
                    break;
                case 4:
                    break;

            }

            System.out.println("Y for Menu,N for exit ? Y/N");
            exit = scanner.nextLine();
            if (exit.equalsIgnoreCase("N")){
                break;
            }else if(exit.equalsIgnoreCase("N")){
                continue;
            }
        }while (exit.equalsIgnoreCase("Y"));
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
                System.out.println("Could not find book according: " +genreInput);
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
}
