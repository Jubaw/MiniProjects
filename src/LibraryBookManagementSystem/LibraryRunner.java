package LibraryBookManagementSystem;

import javax.swing.*;

public class LibraryRunner {
    public static void main(String[] args) {
        BookMenu bookMenu = new BookMenu();
        Database database = new Database(); // Make sure this matches your actual database setup

        bookMenu.startMenu();
    }
}