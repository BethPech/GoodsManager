package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static java.lang.Boolean.compare;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    Book book = new Book(2,"Преступление и наказание", 120,"Достоевский");

    @Test
    void shouldMatchName(){
        boolean actual = book.matches("Преступление и наказание");
        assertEquals (true,actual);
    }
    @Test
    void shouldMatchAuthor(){
        boolean actual = book.matches("Достоевский");
        assertEquals (true,actual);
    }
    @Test
    void shouldMatchAuthorIgnoreCase(){
        boolean actual = book.matches("достоевский");
        assertEquals (true,actual);
    }

    @Test
    void shoulNotMatchAuthor(){
        boolean actual = book.matches("Толстой");
        assertEquals (false,actual);
    }
}
