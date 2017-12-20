package com.example.aman.cunninghamequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NTDCN_Activity extends AppCompatActivity {

    private TextView RMR, TEF, NEAT, Sum;
    private Button proceed;

    private Double RMRnum, TEFnum, NEATnum, roundedTEF, roundedNEAT;
    private static Double SumNum, roundedSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ntdcn);

        TEF = (TextView) findViewById(R.id.TEF);
        NEAT = (TextView) findViewById(R.id.NEAT);
        Sum = (TextView) findViewById(R.id.Sum);
        proceed = (Button) findViewById(R.id.Proceed);

        RMRnum = FFM_CalcActivity.getRMR();

        TEFnum = AT_Activity.getTEFnum();
        roundedTEF = (double) Math.round(TEFnum);
        TEF.setText(roundedTEF.toString());

        NEATnum = ATPartTwo_Activity.getNEAT() * RMRnum;
        roundedNEAT = (double) Math.round(NEATnum);
        NEAT.setText(roundedNEAT.toString());

        SumNum = TEFnum + NEATnum;
        roundedSum = (double) Math.round(SumNum);
        Sum.setText(roundedSum.toString());

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NTDCN_Activity.this, ERAT_Activity.class));
            }
        });
    }

    public static Double getSum() {
        return roundedSum;
    }
}
