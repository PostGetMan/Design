package org.postgetman.designrest.service;

import org.postgetman.designrest.domain.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book findOne(final Long id);

    Book findOne(final String title);

    void addBook(Book book);

    void deleteBook(final String name);
}
