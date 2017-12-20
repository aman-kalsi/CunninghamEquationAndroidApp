package com.example.aman.cunninghamequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TDCN_Activity extends AppCompatActivity {

    private TextView NCB, ERAT, Sum;
    private Button Proceed;

    private Double NCBnum, ERATnum;
    private static Double SumNum, roundedERAT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdcn);

        NCB = (TextView) findViewById(R.id.RestDay);
        ERAT = (TextView) findViewById(R.id.ERAT);
        Sum = (TextView) findViewById(R.id.Sum);
        Proceed = (Button) findViewById(R.id.Proceed);

        NCBnum = NTDCN_Activity.getSum();
        NCB.setText(NCBnum.toString());

        ERATnum = 6.0 * ERAT_Activity.getERAT() * FFM_Activity.getResult();
        roundedERAT = (double) Math.round(ERATnum);
        ERAT.setText(roundedERAT.toString());

        SumNum = NCBnum + roundedERAT;

        Sum.setText(SumNum.toString());

        Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TDCN_Activity.this, Finish_Activity.class));
            }
        });
    }

    public static Double getSum() {
        return SumNum;
    }
}
