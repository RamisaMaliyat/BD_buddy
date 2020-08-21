package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Date_And_Time extends AppCompatActivity implements View.OnClickListener{

    Button b1 ,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date__and__time);
        b1 = (Button) findViewById(R.id.date);
        b1.setOnClickListener(this);
        b2 = (Button)findViewById(R.id.clock);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.date:

                Intent loginIntent = new Intent(Date_And_Time.this, Date.class);
                startActivity(loginIntent);

                break;
            case R.id.clock:

                Intent newIntent = new Intent(Date_And_Time.this, Time.class);
                startActivity(newIntent);

                break;

        }
    }
}
