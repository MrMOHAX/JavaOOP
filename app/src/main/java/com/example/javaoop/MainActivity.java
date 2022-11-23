package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Cat myCat;
    int z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Cat singingCat = new Cat(){
            public void talk(){

                Log.i("talk()", "I'm singing! La-la-la!");
            }
        };

        singingCat.talk();

        Cat cat = new Cat();
        cat.talk();


        Cat cat1 = new Cat();
        cat1.catchMouse(1);
        cat1.catchMouse(3);

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