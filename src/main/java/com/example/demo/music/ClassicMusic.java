package com.example.demo.music;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements  Music{
    @Override
    public void getSound() {
        System.out.println("Piano");
    }
}
