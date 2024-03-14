package LibraryBookManagementSystem;

import java.lang.reflect.Array;
import java.util.*;

public class Database {
    private List<Books> booksList = new ArrayList<>();

    public void addBook(Books book) {
        booksList.add(book);
    }
    public void removeBook(Books book ){
        booksList.remove(book);
    }

    public List<Books> getBooksList() {
        return booksList;
    }
    public Database() {
        booksList.add(new Books("Crime and Punishment", "Fyodor Dostoyevsky", 1000, "Philosophical Fiction"));
        booksList.add(new Books("Les Miserables", "Victor Hugo", 1500, "Historical Fiction"));
        booksList.add(new Books("1984", "George Orwell", 1000, "Dystopian"));
        booksList.add(new Books("Frankeinstein", "Mary Shelley", 1200, "Gothic Fiction"));
        booksList.add(new Books("Hamlet", "William Shakespeare", 1500, "Drama"));
        booksList.add(new Books("Bir İdam Mahkumunun Son Günü", "Victor Hugo", 1100, "Roman"));
        // Add other books similarly

    }

    @Override
    public String toString() {
        return "Database{" +
                "booksList=" + booksList +
                '}';
    }









}
