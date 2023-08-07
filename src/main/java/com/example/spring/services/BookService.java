package com.example.spring.services;

import com.example.spring.models.Book;
import com.example.spring.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Book getBookById(Long id) {
        Book book = bookRepository.findById(id);
        if (book == null) throw new IllegalArgumentException();
        return book;
    }

    public void createBook(String name, String author, int price) {
        bookRepository.addBook(name, author, price);
    }

    public void deleteBookById(Long id) {
        bookRepository.removeBook(id);
    }
}
