package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class Dog extends Pet {

    @Override
    public void play() {
        System.out.println("ГААВ");
    }

    @Override
    public void initMethod() {
        System.out.println("СОБАЧКА ПРИБЕЖАЛА");
    }

    @Override
    public void destroyMethod() {
        System.out.println("СОБАЧКА УБЕЖАЛА");
    }
}
