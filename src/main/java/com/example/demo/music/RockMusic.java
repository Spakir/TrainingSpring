package com.example.demo.music;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public void getSound() {
        System.out.println("Guitar");
    }
}
