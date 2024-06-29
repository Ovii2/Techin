package lt.techin.evelinaC;

import lt.techin.library.Author;
import lt.techin.library.Book;
import lt.techin.library.BookCatalog;
import lt.techin.library.BookNotFoundException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyLibrary implements BookCatalog {

    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        if (book == null || book.getIsbn() == null || book.getTitle() == null || book.getIsbn().isEmpty() || book.getTitle().isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    @Override
    public Book getBookByIsbn(String isbn) {
        return books.stream()
                .filter(name -> name.getIsbn().contains(isbn))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException(isbn));
    }

    @Override
    public List<Book> searchBooksByAuthor(String authorName) {
        List<Book> foundBooks = books.stream()
                .filter(book -> book.getAuthors().contains(authorName))
                .collect(Collectors.toList());

        if (foundBooks.isEmpty()) {
            System.out.println("No books found by the author: " + authorName);
        }
        return foundBooks;
    }


    @Override
    public int getTotalNumberOfBooks() {
        return books.size();
    }

    @Override
    public boolean isBookInCatalog(String isbn) {
        return books.stream()
                .anyMatch(book -> book.getIsbn().equals(isbn));

    }

    @Override
    public boolean isBookAvailable(String isbn) {
        return books.stream().anyMatch(Book::isAvailable);
    }

    @Override
    public Book findNewestBookByPublisher(String publisher) {
        return books.stream()
                .filter(book -> book.getPublisher().equals(publisher))
                .max(Comparator.comparingInt(Book::getPublicationYear))
                .orElseThrow(() -> new BookNotFoundException("book not found" + publisher));
    }


    @Override
    public List<Book> getSortedBooks() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getPublicationYear)
                        .thenComparing(Book::getTitle)
                        .thenComparing(Book::getPageCount))
                .collect(Collectors.toList());

    }


    @Override
    public Map<String, List<Book>> groupBooksByPublisher() {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getPublisher));

    }

    @Override
    public List<Book> filterBooks(Predicate<Book> criteria) {
        return books.stream().filter(criteria).collect(Collectors.toList());
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        return books.stream()
                .map(Book::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
