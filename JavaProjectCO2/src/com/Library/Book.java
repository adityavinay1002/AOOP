package com.Library;

import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private String author;
    private double price;
    private int year;

    public Book(String title, String author, double price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    // Comparable: Natural order comparison by title
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    // Cloneable: Creating a deep copy of the book
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow copy is sufficient for immutable fields
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price + ", Year: " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Double.compare(book.price, price) == 0 &&
               Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, year);
    }
}
