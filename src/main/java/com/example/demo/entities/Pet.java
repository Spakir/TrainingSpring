package com.example.demo.entities;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;


@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Pet {
    private String name  = "sd";

    @Value("${age}")
    private int age;
    public abstract void play();
    @PostConstruct
    public abstract void initMethod();

    @PreDestroy
    public abstract void destroyMethod();

}
