package com.example.demo.entities;


import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Cat extends Pet{
    public Cat(String name,int age){
        super(name,age);
    }
    @Override
    public void play() {
        System.out.println("ММЯЯУУ");
    }

    @Override
    public void initMethod() {
        System.out.println("КОТЯРА НАХУЙ БЛЕВОТНЫЙ ПРИШЕЛ");
    }

    @Override
    public void destroyMethod() {
        System.out.println("БЛЕВОТНЫЙ КОТЯРА НАХУЙ ПОМЕР");
    }
}
