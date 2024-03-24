package libraryapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGUI extends JFrame{
    private Database database;
    public LibraryGUI(Database database) {
        this.database = database;
        // Rest of the constructor code...
    }

    private void showBooks() {
        // Fetch the list of books
        java.util.List<Books> books = database.getBooksList();
        StringBuilder booksInfo = new StringBuilder();
        for (Books book : books) {
            booksInfo.append("Name: ").append(book.getBookName())
                    .append(", Author: ").append(book.getBookAuthor())
                    .append(", Price: $").append(book.getBookPrice())
                    .append(", Genre: ").append(book.getBookGenre()).append("\n");
        }

        // Show the books information in a message dialog
        JOptionPane.showMessageDialog(this, booksInfo.toString());
    }







    public LibraryGUI(){
        setTitle("Library System");

        setSize(300,200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        JButton showBooksButton = new JButton("Show Books");
        showBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showBooks();
            }
        });
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(showBooksButton);


    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            LibraryGUI frame = new LibraryGUI();
            frame.setVisible(true);
        });
    }


}
