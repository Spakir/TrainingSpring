package com.example.demo.configs;

import com.example.demo.entities.Cat;
import com.example.demo.entities.Dog;
import com.example.demo.entities.Parrot;
import com.example.demo.entities.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration @PropertySource("classpath:pets.properties")
public class PetsConfig {

    @Bean
    @Scope("prototype")
    Cat getCat(){
        return new Cat();
    }
    @Bean
    Dog getDog(){
        return new Dog();
    }
    @Bean
    Parrot getParrot(){

        return new Parrot();

    }
    @Bean
    @Scope("prototype")
    Cat getUniqueCat(){
        return new Cat("пенис",23);
    }
}
