package ru.netology.domain;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.compare;

public class ProductTest {
    private Product product = new Product(1,"Мертвые Души", 100);

    @Test
    void shouldMatch() {
        boolean actual = product.matches("Мертвые Души");
        System.out.println(compare(true,actual));
    }
    @Test
    void shouldNotMatch() {
        boolean actual = product.matches("Titanic");
        System.out.println(compare(true,actual));
    }

}
