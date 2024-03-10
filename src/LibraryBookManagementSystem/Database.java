package LibraryBookManagementSystem;

import java.lang.reflect.Array;
import java.util.*;

public class Database {
    private List<Books> booksList = new ArrayList<>();

    public Database() {
        booksList.add(new Books("Crime and Punishment", "Fyodor Dostoyevsky", 1000, "Philosophical Fiction"));
        booksList.add(new Books("Les Miserables", "Victor Hugo", 1500, "Historical Fiction"));
        booksList.add(new Books("1984", "George Orwell", 1000, "Dystopian"));
        booksList.add(new Books("Frankeinstein", "Mary Shelley", 1200, "Gothic Fiction"));
        booksList.add(new Books("Hamlet", "William Shakespeare", 1500, "Drama"));
        booksList.add(new Books("Bir İdam Mahkumunun Son Günü", "Victor Hugo", 1100, "Roman"));
        // Add other books similarly
    }

    public List<Books> getBooksList() {
        return booksList;
    }

   /* HashMap<String,String> bookNameAndAuthor = new HashMap<>();

    {
        bookNameAndAuthor.put("Crime and Punishment","Fyodor Dostoyevski");
        bookNameAndAuthor.put("Les Miserables","Victor Hugo");
        bookNameAndAuthor.put("Bir idam mahkumunun son günü","Victor Hugo");
        bookNameAndAuthor.put("1984","George Orwell");
        bookNameAndAuthor.put("Frankeinstein","Mary Shelley");
        bookNameAndAuthor.put("Hamlet","William Shakespeare");
    }

   int[] bookPrices = new int[5];
    {
        bookPrices[0] = 1000;
        bookPrices[1] = 1500;
        bookPrices[2] = 850;
        bookPrices[3] = 500;
        bookPrices[4] = 2000;
    }*/






}
