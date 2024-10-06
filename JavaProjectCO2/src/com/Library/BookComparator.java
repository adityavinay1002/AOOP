package com.Library;

import java.util.Comparator;

public class BookComparator {
    // Comparator to sort books by author
    public static Comparator<Book> byAuthor() {
        return Comparator.comparing(Book::getAuthor);
    }

    // Comparator to sort books by price
    public static Comparator<Book> byPrice() {
        return Comparator.comparingDouble(Book::getPrice);
    }

    // Comparator to sort books by year
    public static Comparator<Book> byYear() {
        return Comparator.comparingInt(Book::getYear);
    }
}

