package com.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding some sample books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, 1925));
        library.addBook(new Book("1984", "George Orwell", 8.99, 1949));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 12.99, 1960));

        boolean running = true;
        while (running) {
            System.out.println("\nLibrary Book Sorting System");
            System.out.println("1. Sort by Title (Comparable)");
            System.out.println("2. Sort by Author (Comparator)");
            System.out.println("3. Sort by Price (Comparator)");
            System.out.println("4. Sort by Year (Comparator)");
            System.out.println("5. Clone a Book");
            System.out.println("6. Display All Books");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.sortByTitle();
                    library.displayBooks();
                    break;

                case 2:
                    library.sortByAuthor();
                    library.displayBooks();
                    break;

                case 3:
                    library.sortByPrice();
                    library.displayBooks();
                    break;

                case 4:
                    library.sortByYear();
                    library.displayBooks();
                    break;

                case 5:
                    System.out.print("Enter book index to clone: ");
                    int index = scanner.nextInt();
                    try {
                        Book clonedBook = library.cloneBook(index);
                        System.out.println("Cloned Book: " + clonedBook);
                    } catch (CloneNotSupportedException | IndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 6:
                    library.displayBooks();
                    break;

                case 7:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}

