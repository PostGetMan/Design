package org.postgetman.designrest.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Book extends AbstractEntity{

    private String title;

    private String genre;

    private int pages;

    private Author author;

    public Book(){

    }

    public Book(final String title,final String genre){
        this.title = title;
        this.genre = genre;
    }

}
