public class Book {
    private String authorName;
    private String bookName;
    private int pagesBook;

    public Book(String author, String name, int pages) {
        this.authorName = author;
        this.bookName = name;
        this.pagesBook = pages;
    }

    public String getAuthor() {
        return this.authorName;
    }

    public String getName() {
        return this.bookName;
    }

    public int getPages() {
        return this.pagesBook;
    }

    public String toString() {
        return this.authorName + ", " + this.bookName + ", " + this.pagesBook + " pages";
    }
}
