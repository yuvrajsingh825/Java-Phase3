package library;

public class Book {

    private int id;
    private String title;
    private String author;
    private Status status;

    private enum Status {
        AVAILABLE,
        ISSUED
    }

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = Status.AVAILABLE;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Status getStatus() {
        return status;
    }

    public void issueBook() {
        if (status == Status.AVAILABLE) {
            status = Status.ISSUED;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book already issued.");
        }
    }

    public void returnBook() {
        if (status == Status.ISSUED) {
            status = Status.AVAILABLE;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    @Override
    public String toString() {
        return id + " | " + title + " | " + author + " | " + status;
    }
}