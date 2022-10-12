package com.example.javaoop;

import android.util.Log;

public class Cat {
    int age;
    String name;
    String breed;
    String color;


    public Cat() {

    }

    public Cat(int age, String name, String breed, String color) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void talk() {
        Log.i("talk()", "Meow! My name is " + name + ", I'm " + age + " years old, " + "I'm  a " + breed + " breed, and " + color + " color.");
    }


}
