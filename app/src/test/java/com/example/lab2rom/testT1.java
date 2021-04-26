package com.example.lab2rom;
import com.example.lab2rom.task1.Author;

import org.junit.Test;

public class testT1 {
    @Test
    public void TestTaskOne(){
        Author a1 = new Author("Anastasia Romanenko", "anastasiaromanenko040101@gmail.com");
        System.out.println(a1);

        a1.setName("Mark");
        a1.setEmail("markBooks@gmail.com");
        System.out.println(a1);
        System.out.println("name: " + a1.getName());
        System.out.println("email: " + a1.getEmail());

    }
}
