package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mymensing_Place extends AppCompatActivity implements View.OnClickListener {
    Button b1 ,b2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensing__place);
        b1 = (Button) findViewById(R.id.mspeplace);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.mfood);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.mspeplace:

                Intent aintent = new Intent(Mymensing_Place.this, Mymensing_Spectacular_Place.class);
                startActivity(aintent);

                break;
            case R.id.mfood:

                Intent bintent = new Intent(Mymensing_Place.this, Mymensingfood.class);
                startActivity(bintent);

                break;
        }

    }
}
