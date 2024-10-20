package com.example.demo.configs;


import com.example.demo.weather.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;


@Configuration
public class WeatherConfig {

    @Bean
    public WeekDay getDay() {
        DayOfWeek day = LocalDate.now().getDayOfWeek();
        switch (day) {
            case MONDAY :
                return  new Monday();
            case TUESDAY:
                return new Tuesday();
            case WEDNESDAY:
                return new Wednesday();
            case THURSDAY:
                return new Thursday();
            case FRIDAY:
                return new Friday();
            case SATURDAY:
                return new Saturday();
            case SUNDAY:
                return new Sunday();
            default:
                return null;
        }
    }
}
