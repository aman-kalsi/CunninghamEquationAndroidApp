package com.example.aman.cunninghamequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeightChoose_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_choose_);

        Button lbBtn = (Button) findViewById(R.id.LBs);
        Button kgBtn = (Button) findViewById(R.id.KGs);

        lbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WeightChoose_Activity.this, RMR_LBActivity.class));
            }
        });

        kgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WeightChoose_Activity.this, RMR_KGActivity.class));
            }
        });
    }
}
