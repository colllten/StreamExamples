package IteratorPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Collection<Book> books = new ArrayList<>();
        books.add(new Book("CTCI", "McDowell"));
        books.add(new Book("The Code", "N/A"));

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
