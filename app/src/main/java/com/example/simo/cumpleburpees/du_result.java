package com.example.simo.cumpleburpees;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Simo on 11/8/15.
 */
public class du_result  extends Activity {
    private int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.du_result);
        Bundle extras = getIntent().getExtras();
        age = extras.getInt("age",0);
        Utility calc = new Utility();
        int burpeeCount = calc.BurpeeNumber(age);
        int duCount = calc.DU(age);
        TextView burpeeText = (TextView)findViewById(R.id.BurpeeTextView);
        TextView DuText = (TextView)findViewById(R.id.DUtextView);
        burpeeText.setText(burpeeCount + " Burpees");
        DuText.setText(duCount + " DU's");

    }
}
