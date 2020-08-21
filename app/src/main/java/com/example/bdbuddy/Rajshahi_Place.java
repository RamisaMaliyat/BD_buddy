package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rajshahi_Place extends AppCompatActivity implements View.OnClickListener {
    Button b1 ,b2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place);

        b1 = (Button) findViewById(R.id.rajspeplace);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.rajfood);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rajspeplace:

                Intent aintent = new Intent(Rajshahi_Place.this, Rajshahi_Spectacular_place.class);
                startActivity(aintent);

                break;
            case R.id.rajfood:

                Intent bintent = new Intent(Rajshahi_Place.this, Rajshahifood.class);
                startActivity(bintent);

                break;
        }
    }
}
