import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Book[] books = new Book[n];
        if (n == 0) {
            System.out.println("N/A");
        } else {
            for (int i = 0; i < n; i++) {
                String bookName;
                String authorName;
                String isbnNumber;
                bookName = scanner.nextLine().trim();
                authorName = scanner.nextLine().trim();
                isbnNumber = scanner.nextLine();

                books[i] = new Book(bookName, authorName, isbnNumber);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("-----------------------------");
            System.out.println(books[i]);
            System.out.println("-----------------------------");
        }
    }
}

class Book {
    private String bookName;
    private String authorName;
    private String isbnNumber;

    public Book(String bookName, String authorName, String isbnNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbnNumber = isbnNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;

    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbnNumber() {
        return isbnNumber;

    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    @Override
    public String toString() {
        return "Book Name:\t" + getBookName() + "\nAuthor Name:\t" + getAuthorName() + "\nISBN:\t" + getIsbnNumber();
    }

}
