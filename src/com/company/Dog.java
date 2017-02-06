package com.company;


public class Dog extends Animal{

    public Dog(int weight, String name, String color, int age, String food ){
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.age = age;
        this.food = food;

    }
    public void eat(){
        System.out.println("Dog is eating " + food + "!");

    }
    public void ageOfDog(){
        int dogAge = age * 7;
        System.out.println("Dog's age in dog years is " + dogAge);
    }
}
