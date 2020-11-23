package ru.netology.domain;
import org.junit.jupiter.api.Test;

public class ProductTest {
    private Product product = new Product(1,"Мертвые Души", 100);

    @Test
    void shouldMatch() {
        product.matches("Мертвые Души");
        System.out.println(true);
    }
    @Test
    void shouldNotMatch() {
        product.matches("Titanic");
        System.out.println(false);
    }

}
