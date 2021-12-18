package com.example.android.courtcounter;



import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.courtcounter.R;

import java.text.NumberFormat;



/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int scorea=0;
    int scoreb=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void score3a(View view)
    {
        scorea=scorea +3;
        see1(scorea);
    }
    public void score2a(View view)
    {
        scorea=scorea +2;
        see1(scorea);
    }
    public void score1a(View view)
    {
        scorea=scorea +1;
        see1(scorea);
    }
    public void score3b(View view)
    {
        scoreb=scoreb +3;
        see2(scoreb);
    }
    public void score2b(View view)
    {
        scoreb=scoreb +2;
        see2(scoreb);
    }
    public void score1b(View view)
    {
        scoreb=scoreb +1;
        see2(scoreb);
    }
    public void reset(View view)
    {
        scorea=0;
        scoreb=0;
        see1(scorea);
        see2(scoreb);
    }
    /**
     * This method is called when the order button is clicked.
     */

    private void see1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score1_text);
        quantityTextView.setText("" + number);
    }
    private void see2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score2_text);
        quantityTextView.setText("" + number);
    }



}