package com.Library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Library implements Iterable<Book> {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Sort books by title (Comparable interface)
    public void sortByTitle() {
        Collections.sort(books);
    }

    // Sort books using custom Comparator
    public void sortByAuthor() {
        Collections.sort(books, BookComparator.byAuthor());
    }

    public void sortByPrice() {
        Collections.sort(books, BookComparator.byPrice());
    }

    public void sortByYear() {
        Collections.sort(books, BookComparator.byYear());
    }

    // Clone a book by index
    public Book cloneBook(int index) throws CloneNotSupportedException {
        return (Book) books.get(index).clone();
    }

    // Iterable: Allow iteration over books
    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }

    // Display all books
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
