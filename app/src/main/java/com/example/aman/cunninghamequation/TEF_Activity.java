package com.example.aman.cunninghamequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TEF_Activity extends AppCompatActivity {

    private EditText TEF_Factor;
    private Button submit;

    private static Double TEF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tef_);

        TEF_Factor = (EditText) findViewById(R.id.TEF_Factor);
        submit = (Button) findViewById(R.id.Submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TEF = ( Double.parseDouble(TEF_Factor.getText().toString()) / (FFM_Activity.getRounded() * 2.2) ) / 10;
                startActivity(new Intent(TEF_Activity.this, AT_Activity.class));
            }
        });
    }

    public static Double getTEF() {
        return TEF;
    }
}
