package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dhaka_Place extends AppCompatActivity implements View.OnClickListener {


    Button b1 ,b2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place);

        b1 = (Button) findViewById(R.id.dspeplace);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.dfood);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.dspeplace:

                Intent aintent = new Intent(Dhaka_Place.this, Dhaka_Spectacular_place.class);
                startActivity(aintent);

                break;
            case R.id.dfood:

                Intent bintent = new Intent(Dhaka_Place.this, Dhakafood.class);
                startActivity(bintent);

                break;
        }
    }
}
