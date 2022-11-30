package com.example.javaoop;

import android.util.Log;

public interface Movable {
    //Интерфейсы 2 часть

    int speedOfMoving = 100;

    default void move(){
        Log.i("move()", "Move puma");
    }

    //интерфейсы 2 часть
    static void someMethod(){
        Log.i("someMethod()", "someMethod puma");
    }

}
