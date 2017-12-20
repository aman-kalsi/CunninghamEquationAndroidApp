package com.example.aman.cunninghamequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Finish_Activity extends AppCompatActivity {

    private TextView RestCalories, ExerciseCalories;

    private Double RestFloor, ExerciseFloor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_);

        RestCalories = (TextView) findViewById(R.id.RestCalories);
        ExerciseCalories = (TextView) findViewById(R.id.ExerciseCalories);

        RestFloor = Math.floor(NTDCN_Activity.getSum());
        RestFloor = Math.floor(RestFloor / 100) * 100;
        RestCalories.setText(RestFloor.toString());

        ExerciseFloor = Math.floor (TDCN_Activity.getSum());
        ExerciseFloor = Math.floor(ExerciseFloor / 100) * 100;
        ExerciseCalories.setText(ExerciseFloor.toString());
    }
}
