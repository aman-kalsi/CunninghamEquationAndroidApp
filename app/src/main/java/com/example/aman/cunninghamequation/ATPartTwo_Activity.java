package com.example.aman.cunninghamequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ATPartTwo_Activity extends AppCompatActivity {

    private EditText NEATsubmit;
    private Button submit;

    private static Double NEATfactor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atparttwo_activity);

        NEATsubmit = (EditText) findViewById(R.id.NEATsubmit);
        submit = (Button) findViewById(R.id.Submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NEATfactor = Double.parseDouble(NEATsubmit.getText().toString());
                startActivity(new Intent(ATPartTwo_Activity.this, NTDCN_Activity.class));
            }
        });
    }

    public static Double getNEAT() {
        return NEATfactor;
    }
}
