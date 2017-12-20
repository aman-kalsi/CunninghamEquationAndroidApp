package com.example.aman.cunninghamequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FFM_CalcActivity extends AppCompatActivity {

    private TextView RMR;
    private Double BFP, FFMnum, roundedFFM, roundedRMR;
    private static Double RMRnum;
    private Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ffm_calc);

        BFP = FFM_Activity.getBFP();
        RMR = (TextView) findViewById(R.id.RMRn);

        proceed = (Button) findViewById(R.id.Proceed);

        FFMnum = FFM_Activity.getResult() - (FFM_Activity.getResult()*(FFM_Activity.getBFP()/100));
        roundedFFM = (double) Math.round(FFMnum);

        RMRnum = 500 + (22*(FFMnum));
        roundedRMR = (double) Math.round(RMRnum);
        RMR.setText(roundedRMR.toString());

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FFM_CalcActivity.this, TEF_Activity.class));
            }
        });
    }

    public static Double getRMR() {
        return RMRnum;
    }
}
