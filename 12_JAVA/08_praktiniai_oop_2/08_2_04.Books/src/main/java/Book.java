public class Book {
    private String title;
    private int pages;
    private int pubYear;

    public Book(String title, int pages, int pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPubYear() {
        return pubYear;
    }

    @Override
    public String toString() {
        return String.format("%s, %d pages, %d%n", this.title, this.pages, this.pubYear);
    }
}
