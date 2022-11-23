package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Cat myCat;
    int z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat1 = new Cat();
        cat1.talk();

        Cat cat2 = new Cat( 5, "Vaska");
        cat2.talk();

        Cat cat3 = new Cat(8, "Murzik");
        cat3.talk();

        Cat.CatMood catMood = new Cat().new CatMood();
        Log.i("levelOfMood", String.valueOf(catMood.levelOfMood));

        Log.i("number0Legs","cat1 number of legs: " +  cat1.number0fLegs);
        Lion lion = new Lion();
        lion.talk();
    }

    void method(double x, int y){
        int a;
        a = 1;

        a = y+1;
        double d = x*2;
        z = a + y;
    }
    void method1(){
        int a;
        a = 1;
    }
}