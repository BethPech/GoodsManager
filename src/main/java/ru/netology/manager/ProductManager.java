package ru.netology.manager;

import ru.netology.domain.Product;
import ru.netology.repository.ProductRepository;

public class ProductManager {
    private ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }


    public void add(Product item) {
        repository.save(item);
    }

    public Product[] getAll() {
        Product[] items = repository.findAll();
        Product[] result = new Product[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public Product[] removeById(int id) {
        Product[] result = repository.removeById(id);
        return result;
    }


    public void findAll() {
        repository.findAll();
    }

    public Product findById(int id) {
        Product result = repository.findById(id);
        return result;
    }

    public Product[] searchBy(String name) {
        Product[] items = repository.findAll();


        return Product[];
    }
    public boolean matches(Product product, String search) {
        // ваш код
    }
}


