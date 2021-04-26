package com.example.lab2rom;

import com.example.lab2rom.task2.*;

import org.junit.Test;

public class testT2 {

    @Test
    public void TestTaskTwo(){

        System.out.println("Проверка обьектов: ");
        Author Guskova = new Author("Guskova", "guskovaBooks@gmail.com");
        System.out.println(Guskova);


        Book Java = new Book("OOP v Java", Guskova, 4.3, 13);
        System.out.println(Java);

        System.out.println("Проверка геттеров с сеттеров: ");
        Java.setPrice(6.2);
        System.out.println("Проверка setPrice(): " + Java.getPrice());
        Java.setQty(5);
        System.out.println("Проверка setQty(): " + Java.getQty());

        System.out.println("Проверка Book - getName(): " + Java.getName());
        System.out.println("Проверка Book - getPrice(): " + Java.getPrice());
        System.out.println("Проверка Book - getQty(): " + Java.getQty());
        System.out.println("Проверка Book - getAuthor(): " + Java.getAuthor());
        System.out.println("Проверка Author - getName(): " + Guskova.getName());
        System.out.println("Проверка Author - getEmail(): " + Guskova.getEmail());

    }
}
