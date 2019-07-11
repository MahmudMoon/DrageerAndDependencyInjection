package com.example.moon.drageeranddependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class Cylender {
    private static final String TAG = "Cylender";
    @Inject
    public Cylender() {
        Log.i(TAG, "Cylender: ");
    }
}
