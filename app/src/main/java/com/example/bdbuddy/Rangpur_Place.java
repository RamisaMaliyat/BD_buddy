package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rangpur_Place extends AppCompatActivity implements View.OnClickListener {
    Button b1 ,b2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur__place);

        b1 = (Button) findViewById(R.id.rangspeplace);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.rangfood);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.rangspeplace:

                Intent aintent = new Intent(Rangpur_Place.this, Rangpur_Spectacular_Places.class);
                startActivity(aintent);

                break;
            case R.id.rangfood:

                Intent bintent = new Intent(Rangpur_Place.this, Rangpurfood.class);
                startActivity(bintent);

                break;
        }

    }
}
