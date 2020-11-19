package ru.netology.manager;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ProductManagerTest {
private ProductRepository repository = new ProductRepository();
private ProductManager manager = new ProductManager(repository);
private Book item1 = new Book(1,"Мертвые Души", 100, "Гоголь");
private Book item2 = new Book(2,"Преступление и наказание", 120,"Достоевский");
private Book item3 = new Book(3,"Бедная Лиза", 99, "Карамзин");
private Smartphone item4 = new Smartphone(4,"Samsung",11000, "Южная Корея");
private Smartphone item5 = new Smartphone(5, "Huawei", 9000,"Китай");
private Smartphone item6 = new Smartphone(6,"Apple", 15000,"США");

    @BeforeEach
    public void setUp() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
    }

    @Test
    void shouldSearchBy(){
        manager.searchBy("Samsung");
        Product expected = item4;
        Product actual = manager.findById(4);
        assertEquals(expected, actual);

    }
    @Test
    void shouldnotSearchBy(){
        manager.searchBy("Xiaomi");
        Product expected = null;
        Product actual = manager.findById(0);
        assertEquals(null, actual);
    }

}


