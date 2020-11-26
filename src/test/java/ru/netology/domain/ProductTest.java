package ru.netology.domain;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.compare;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    private Product product = new Product(1,"Мертвые Души", 100);

    @Test
    void shouldMatch() {
        boolean actual = product.matches("Мертвые Души");
        assertEquals (true,actual);
    }
    @Test
    void shouldNotMatch() {
        boolean actual = product.matches("Titanic");
        assertEquals (false,actual);
    }

}
