package com.example.moon.drageeranddependencyinjection;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragAndDropPermissions;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linear_layout);
        Button button = new Button(this);
        button.setText("Drive Car");
        button.setGravity(Gravity.CENTER);
        button.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(button);


//        Context context = getApplicationContext();
//        Engine engine = new Engine();
//        Wheel wheel = new Wheel();
//        car = new Car(context,engine,wheel);

       CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getCar();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car.drive();
            }
        });
    }
}
