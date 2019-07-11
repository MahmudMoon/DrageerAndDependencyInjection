package com.example.moon.drageeranddependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class Gear {
    private static final String TAG = "Gear";
    @Inject
    public Gear() {
        Log.i(TAG, "Gear: ");
    }
}
