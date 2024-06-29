
public class Book {

    private String name;
    private int publishingYear;
    private int pageCount;
    private String author;

    public Book(String name, int ReleaseYear, int pages, String author) {
        this.name = name;
        this.publishingYear = ReleaseYear;
        this.pageCount = pages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagecount() {
        return pageCount;
    }

    public static Book convertToBook(String line) {
        String[] fields = line.split(",");
        return new Book(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2]), fields[3]);
    }

    @Override
    public String toString() {
        return String.format("%s,%d,%d,%s", name, publishingYear, pageCount, author);
    }
}
