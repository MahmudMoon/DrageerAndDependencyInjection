package com.example.moon.drageeranddependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class Wheel {
    private static final String TAG = "Wheel";
    @Inject
    public Wheel() {
        Log.i(TAG, "Wheel: ");
    }
}
