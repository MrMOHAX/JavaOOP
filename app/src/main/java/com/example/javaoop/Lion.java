package com.example.javaoop;

import android.util.Log;

public class Lion extends Cat {
    public void talk() {
        Log.i("talk()", "R-r-r! I'm lion. My name is " + name + ", I'm " + age + " years old." + Lion.whatCatsLike());
    }
    public static String whatCatsLike(){
        return  "I'm lion and i like playing, jumping and sometimes scratching";
    }
}