package com.example.moon.drageeranddependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class Engine {

    Break_ break_;
    Cylender cylender;
    Gear gear;
    private static final String TAG = "Engine";
    @Inject
    public Engine(Break_ break_, Cylender cylender, Gear gear) {
        this.break_ = break_;
        this.cylender = cylender;
        this.gear = gear;
        Log.i(TAG, "Engine: ");

    }
}
