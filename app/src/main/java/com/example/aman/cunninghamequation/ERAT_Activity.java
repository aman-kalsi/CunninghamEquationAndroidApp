package com.example.aman.cunninghamequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ERAT_Activity extends AppCompatActivity {

    private EditText ERATfac;
    private Button finish;
    private static Double ERATfactor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erat_);

        ERATfac = (EditText) findViewById(R.id.Submit);
        finish = (Button) findViewById(R.id.Finish);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ERATfactor = ( Double.parseDouble(ERATfac.getText().toString()) / 60);
                startActivity(new Intent(ERAT_Activity.this, TDCN_Activity.class));
            }
        });
    }

    public static Double getERAT() {
        return ERATfactor;
    }
}
