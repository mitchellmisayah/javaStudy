public class Book {

    private String name;
    private int pages;
    private int year;

    public Book(String name, int pages, int year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    // getters.

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.pages + " pages" + ", " + this.year;
    }

}
