package com.example.aman.cunninghamequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RMR_LBActivity extends AppCompatActivity {

    private EditText lbs;
    private Button submit;

    private Double lbWeight;
    private static Double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rmr_lb);

        lbs = (EditText) findViewById(R.id.RMR_lbs);
        submit = (Button) findViewById(R.id.Proceed);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lbWeight = Double.parseDouble(lbs.getText().toString());
                result = lbWeight / 2.2;
                startActivity(new Intent(RMR_LBActivity.this, FFM_Activity.class));
            }
        });


    }

    public static Double getResult() {
        return result;
    }
}
