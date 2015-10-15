package com.example.simo.cumpleburpees;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by Simo on 11/8/15.
 */
public class burpees_result extends Activity {
    private int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burpees_result);
        Bundle extras = getIntent().getExtras();
        age = extras.getInt("age",0);
        Utility calc = new Utility();
        int burpeeCount = calc.BurpeeNumber(age);
        TextView result = (TextView)findViewById(R.id.BurpeeOnlytextView);
        result.setText(burpeeCount + " Burpees");

    }
}
