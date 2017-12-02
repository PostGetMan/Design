package org.postgetman.designrest.controller;

import org.postgetman.designrest.domain.Book;
import org.postgetman.designrest.dto.BookDTO;
import org.postgetman.designrest.service.BookService;
import org.postgetman.designrest.service.impl.BookServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController extends BaseController{

    private BookService service;

    public BookController(){
        this.service = new BookServiceImpl();
    }

    @GetMapping
    public List<Book> findAll(){
        return service.findAll();
    }

    @PostMapping
    public void addBook(@RequestBody BookDTO bookDTO){
        service.addBook(convert(bookDTO,Book.class));
    }
}
