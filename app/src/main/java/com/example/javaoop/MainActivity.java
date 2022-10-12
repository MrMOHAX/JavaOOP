package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(4, "Puma", "britan", "black");
        myCat.talk();

        Cat murzik = new Cat(2, "Murza", "Siamskaya", "Black and white");
        murzik.talk();

        Cat glasha = new Cat(1, "Glasha", "Homelike", "red");
        glasha.talk();
    }
}