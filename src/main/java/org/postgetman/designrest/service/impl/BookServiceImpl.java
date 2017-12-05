package org.postgetman.designrest.service.impl;

import org.postgetman.designrest.domain.Book;
import org.postgetman.designrest.service.BookService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookServiceImpl implements BookService{

    private List<Book> books;

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public Book findOne(Long id) {
        for(Book b : books){
            if(b.getId().equals(id)) return b;
        }

        return null;
    }

    @Override
    public Book findOne(final String title) {
        for(Book b : books){
            if(b.getTitle().equals(title)) return b;
        }

        return null;
    }

    @Override
    public void addBook(Book book) {
        if(books == null){
            books = new ArrayList<>();
        }
        if(!books.contains(book)){
            books.add(book);
        }
    }

    @Override
    public void deleteBook(final String title) {
        books.removeIf(b -> b.getTitle().equals(title));
    }
}
