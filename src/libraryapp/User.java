package libraryapp;


import java.util.List;

public class User {

    private String name;
    private String surname;
    private int userId;
    private String email;
    private String phoneNumber;
    private List<Books> borrowedBooks;

    public User(String name, String surname, int userId, String email, String phoneNumber, List<Books> borrowedBooks) {
        this.name = name;
        this.surname = surname;
        this.userId = userId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = borrowedBooks;
    }


    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getUserId() {
        return userId;
    }

    public int setUserId(int userId) {
        this.userId = userId;
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Books> getBooksBorrowed() {
        return borrowedBooks;
    }

    public void setBooksBorrowed(List<Books> booksBorrowed) {
        this.borrowedBooks = booksBorrowed;
    }



    public void borrowBook(Books book) {
        borrowedBooks.add(book);
    }

    // Additional method to return a borrowed book
    public void returnBook(Books book) {
        borrowedBooks.remove(book);
    }




}
