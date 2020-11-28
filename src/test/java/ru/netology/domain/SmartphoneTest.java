package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {
    Smartphone smartphone = new Smartphone(2,"Huawei", 12309,"China");

    @Test
    void shouldMatchName(){
        boolean actual = smartphone.matches("Huawei");
        assertEquals (true,actual);
    }
    @Test
    void shouldMatchManufacture(){
        boolean actual = smartphone.matches("China");
        assertEquals (true,actual);
    }
    @Test
    void shouldMatchManufactureIgnoreCase(){
        boolean actual = smartphone.matches("china");
        assertEquals (true,actual);
    }

    @Test
    void shoulNotMatchManufacture(){
        boolean actual = smartphone.matches("Egypt");
        assertEquals (false,actual);
    }
}
