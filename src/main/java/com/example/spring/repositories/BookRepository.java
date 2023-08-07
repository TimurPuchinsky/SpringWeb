package com.example.spring.repositories;

import com.example.spring.models.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BookRepository {
    private Long id = 1L;
    private final Map<Long, Book> book = new HashMap<>();

    {
        book.put(id++, new Book("Java", "A. Smith", 100));
        book.put(id++, new Book("Spring", "M. John", 200));
    }

    public Book findById(Long id) {
        return book.get(id);
    }

    public void addBook(String name, String author, int price){
        book.put(id++, new Book(name, author, price));
    }

    public void removeBook(Long id){
        book.remove(id);
    }
}
