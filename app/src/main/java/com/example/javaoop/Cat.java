package com.example.javaoop;

import android.util.Log;

public abstract class Cat extends Animal  {
    private int age;
    String name;
    final static int number0fLegs = 4;
    static int count = 0;
    private String breed;
    private String color;

    String helloText;
    CatMood catMood;


    static class CountResetter{
     boolean moreThan100;
     CountResetter(){
         if (Cat.count > 5){
             moreThan100 = true;
         }
         if (moreThan100){
             resetCount(0);
         }
     }
     void resetCount(int value){
         Cat.count = value;
     }
    }

    class CatMood{
        int levelOfMood;

        CatMood(){
            if (Cat.this.age < 2) {
                levelOfMood = 100;
            }
            else if (Cat.this.age >= 2 && Cat.this.age < 7) {
                levelOfMood = 50;
            }
            else if (Cat.this.age >= 7){
                levelOfMood = 20;
            }
        }
    }

    public Cat() {
        count++;
        this.name = "John Doe";
        this.age = -1;

        catMood = new CatMood();

        switch (catMood.levelOfMood) {
            case 100:
                helloText = "Meow! I'm happy cat:) My name is " + name + ", I'm " + age + " years old, " + "I'm  a " + breed + " breed, and " + color + " color.";
                break;
            case 50:
                helloText = "Meow! I'm cat:) My name is " + name + ", I'm " + age + " years old, " + "I'm  a " + breed + " breed, and " + color + " color.";
                break;
            case 20:
                helloText = "Meow! I'm old and sick cat:( My name is " + name + ", I'm " + age + " years old, " + "I'm  a " + breed + " breed, and " + color + " color.";
                break;
        }
    }

        public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;

        switch (catMood.levelOfMood) {
            case 100:
                helloText = "Meow! I'm happy cat:) My name is " + name + ", I'm " + age + " years old, " + "I'm  a " + breed + " breed, and " + color + " color.";
                break;
            case 50:
                helloText = "Meow! I'm cat:) My name is " + name + ", I'm " + age + " years old, " + "I'm  a " + breed + " breed, and " + color + " color.";
                break;
            case 20:
                helloText = "Meow! I'm old and sick cat:( My name is " + name + ", I'm " + age + " years old, " + "I'm  a " + breed + " breed, and " + color + " color.";
                break;
        }


    }

    public void talk() {
        Log.i("talk()", helloText);
    }
    public static String whatCatsLike(){
        return  " I like playing, jumping and sometimes scratching";
    }

    public void catchMouse(int mouseWeight){
        class Mouse{
            String color;
            int weight;


            public Mouse(String color, int weigh ){
                this.color = color;
                this.weight = weigh;
            }
            String mouseVoice(){
                return "Pi-pi-pi-pivo";
            }
        }
        Mouse mouse = new Mouse("White", mouseWeight);
        if (mouse.weight<2){
            Log.i("cat say ", "I will eat you!" + mouse.mouseVoice());
        } else {
            Log.i("cat say ", "I afraid you!");
        }
    }
}
