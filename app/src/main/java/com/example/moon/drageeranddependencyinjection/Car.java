package com.example.moon.drageeranddependencyinjection;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

public class Car {
    Engine engine;
    Wheel wheel;
    Context context;
    private static final String TAG = "Car";


    @Inject
    public Car(Engine engine, Wheel wheel){
        this.engine = engine;
        this.wheel = wheel;

    }

    public void drive(){
        Log.i(TAG, "drive: "+"Vummmmmmmmmmmmmmmmmmmmmmm");
        //Toast.makeText(context,"Vummmmmmmmmmmmmmmm.....", Toast.LENGTH_SHORT).show();
    }
}
