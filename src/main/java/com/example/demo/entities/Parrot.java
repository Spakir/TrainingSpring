package com.example.demo.entities;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

@AllArgsConstructor
public class Parrot extends Pet {

    @Override
    public void play() {
        System.out.println("СЕРЕГАААА");
    }

    @Override
    public void initMethod() {
        System.out.println("САШЕНЬКА ЮВЕЛИР ПРИЛЕТЕЛ");
    }

    @Override
    public void destroyMethod() {
        System.out.println("ОН ОТРАВИЛСЯ НАХУЙ");
    }

}
