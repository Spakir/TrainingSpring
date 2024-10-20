package com.example.demo;

import com.example.demo.entities.Cat;
import com.example.demo.entities.Dog;
import com.example.demo.entities.Pet;
import com.example.demo.music.MusicPlayer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        ApplicationContext appContext = new AnnotationConfigApplicationContext("com.example.demo.music","com.example.demo.configs");
        System.out.println("---------------------------------------------\nБИНЫ СОЗДАЛИСЬ");
        MusicPlayer musicPlayer = (MusicPlayer) appContext.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println("Something...");
        System.out.println("SOMETHING ELSE!");

    }
}
