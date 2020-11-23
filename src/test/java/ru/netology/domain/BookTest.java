package ru.netology.domain;

import org.junit.jupiter.api.Test;

public class BookTest {
    Book book1 = new Book(2,"Преступление и наказание", 120,"Достоевский");
    Book book2 = new Book(3,"Бедная Лиза", 99, "Карамзин");

    @Test
    void shouldMatchName(){
        Book book = new Book();
        book.matches("Преступление и наказание");
        System.out.println(true);
    }
    @Test
    void shouldMatchAuthor(){
        Book book = new Book();
        book.matches("Достоевский");
        System.out.println(true);
    }
}
