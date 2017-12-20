package com.example.aman.cunninghamequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AT_Activity extends AppCompatActivity {

    private TextView TEFFactor;
    private Button Proceed;

    private static Double TEFnum, roundedTEF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at_);

        TEFFactor = (TextView) findViewById(R.id.TEFFactor);
        Proceed = (Button) findViewById(R.id.Proceed);

        TEFnum = TEF_Activity.getTEF() * FFM_CalcActivity.getRMR();
        roundedTEF = (double) Math.round(TEFnum);
        TEFFactor.setText(roundedTEF.toString());

        Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AT_Activity.this, ATPartTwo_Activity.class));
            }
        });
    }

    public static Double getTEFnum() {
        return TEFnum;
    }
}
