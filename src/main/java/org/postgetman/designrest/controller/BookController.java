package org.postgetman.designrest.controller;

import org.postgetman.designrest.domain.Book;
import org.postgetman.designrest.service.BookService;
import org.postgetman.designrest.service.impl.BookServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService service;

    public BookController(){
        this.service = new BookServiceImpl();
    }

    @GetMapping
    public List<Book> findAll(){
        return service.findAll();
    }
}
