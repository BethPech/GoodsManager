package ru.netology.domain;


import org.junit.jupiter.api.Test;

public class ProductTest {
    private Product product = new Product();
//    private Product product1 = new Product(11, "phone", 160);
//    private Product product2 = new Product(45, "book", 678);

    @Test
    void shouldMatch() {
        product.matches("Мертвые Души");
        System.out.println(true);
    }

}
