package ru.netology.domain;

import org.junit.jupiter.api.Test;

public class BookTest {
    Book book = new Book(2,"Преступление и наказание", 120,"Достоевский");

    @Test
    void shouldMatchName(){
        book.matches("Преступление и наказание");
        System.out.println(true);
    }
    @Test
    void shouldMatchAuthor(){
        book.matches("Достоевский");
        System.out.println(true);
    }

    @Test
    void shoulNotMatchAuthor(){
        book.matches("Толстой");
        System.out.println(false);
    }
}
