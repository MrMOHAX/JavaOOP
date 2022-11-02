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
        Cat vaska = new Cat();
        vaska.talk();

        Puma bagira = new Puma();
        bagira.talk();

        Cat puma = new Puma();
        puma.talk();

        Cat murzik = new Lion();
        murzik.talk();

        z=z++;

        myCat = new Cat(4, "Puma", "britan", "black");
        myCat.talk();

        Cat glasha = new Cat(1, "Masha", "Homelike", "red");
        glasha.number0fLegs = 4;
        Log.i("number0fLegs", String.valueOf(glasha.number0fLegs));
        glasha.talk();

        puma.name = "Leo";
        puma.breathe();
        puma.talk();
        puma.isAlive = true;
        Log.i("isAlive", String.valueOf(puma.isAlive));
        Log.i("breathe()", "My name is " +  puma.name + " and " + puma.breathe());

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