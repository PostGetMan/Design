package org.postgetman.designrest.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Author extends AbstractEntity{

    private String fullName;

    private int age;

    private Set<Book> books;

    public Author(){

    }

    public Author(final String fullName){
        this.fullName = fullName;
    }
}
