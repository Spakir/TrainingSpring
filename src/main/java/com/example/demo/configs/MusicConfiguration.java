package com.example.demo.configs;

import com.example.demo.music.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.beans.BeanProperty;


@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class MusicConfiguration {
    @Autowired
    Music faggotMusic;
    @Autowired
    Music classicMusic;
    @Autowired
    Music rockMusic;


    @Bean
    MusicPlayer getMusicPlayer(WeatherConfig weatherConfig) {
        switch (weatherConfig.getDay().getWeekDayName()) {
            case "monday":
                return new MusicPlayer(faggotMusic);
            case "tuesday":
                return new MusicPlayer(classicMusic);
            default:
                return new MusicPlayer(rockMusic);
        }
    }
}
