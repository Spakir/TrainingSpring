package com.example.demo.music;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FaggotMusic implements Music {
    @Override
    public void getSound() {
        System.out.println("ОПЕНИНГ ХЕЛЬСИНГА");
    }
}
