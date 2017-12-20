package com.example.aman.cunninghamequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FFM_Activity extends AppCompatActivity {

    protected EditText BFP;
    protected Button submit;

    protected static Double result, rounded;
    protected static Double BodyFatPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ffm);

        BFP = (EditText) findViewById(R.id.RMR_lbs);
        submit = (Button) findViewById(R.id.Proceed);

        if (RMR_KGActivity.getResult() != 0)
            result = RMR_KGActivity.getResult();
        else if (RMR_LBActivity.getResult() != 0)
            result = RMR_LBActivity.getResult();

        rounded = (double) Math.round(result);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BodyFatPercentage = Double.parseDouble(BFP.getText().toString());
                startActivity(new Intent(FFM_Activity.this, FFM_CalcActivity.class));
            }
        });
    }

    public static Double getBFP() {
        return BodyFatPercentage;
    }

    public static Double getResult() {
        return result;
    }

    public static Double getRounded() {
        return rounded;
    }
}
