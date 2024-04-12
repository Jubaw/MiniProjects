package libraryapp;

public class LibraryRunner {
    public static void main(String[] args) {
        BookMenu bookMenu = new BookMenu();
        Database database = new Database();

        bookMenu.startMenu();
    }
}