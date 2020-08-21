package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Barisal_Place extends AppCompatActivity implements View.OnClickListener {

    Button b1 ,b2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal__place);

        b1 = (Button) findViewById(R.id.bspeplace);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.bfood);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bspeplace:

                Intent aintent = new Intent(Barisal_Place.this, Barisal_Spectacular_Place.class);
                startActivity(aintent);

                break;
            case R.id.bfood:

                Intent bintent = new Intent(Barisal_Place.this, Barisalfood.class);
                startActivity(bintent);

                break;
        }
    }
}
