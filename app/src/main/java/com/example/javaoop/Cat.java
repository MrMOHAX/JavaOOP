package com.example.javaoop;

import android.util.Log;

public class Cat extends Animal  {
    protected int age;
    String name;
    final static int number0fLegs = 4;
    private String breed;
    private String color;

    public Cat() {

    }

    public Cat(int age, String name, String breed, String color) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public final void talk() {
        Log.i("talk()", "Meow! My name is " + name + ", I'm " + age + " years old, " + "I'm  a " + breed + " breed, and " + color + " color.");
    }
    public static final String whatCatsLike(){
        return  " I like playing, jumping and sometimes scratching";
    }

}
