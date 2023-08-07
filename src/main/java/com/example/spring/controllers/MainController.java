package com.example.spring.controllers;

import com.example.spring.models.Book;
import com.example.spring.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/book")
@AllArgsConstructor
public class MainController {
    private final BookService bookService;

    @GetMapping("/getBook/{id}")
    public Book getBook(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @PostMapping("/")
    public void addBook(String name, String author, int price){
        bookService.createBook(name, author, price);
    }

    @PostMapping("/deleteBook/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBookById(id);
    }
}
