package com.example.aman.cunninghamequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RMR_KGActivity extends AppCompatActivity {

    private EditText kgs;
    private Button submit;

    private Double kgWeight;
    private static Double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rmr_kg);

        kgs = (EditText) findViewById(R.id.RMR_lbs);
        submit = (Button) findViewById(R.id.Proceed);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kgWeight = Double.parseDouble(kgs.getText().toString());
                result = kgWeight;
                startActivity(new Intent(RMR_KGActivity.this, FFM_Activity.class));
            }
        });
    }

    public static Double getResult() {
        return result;
    }
}
