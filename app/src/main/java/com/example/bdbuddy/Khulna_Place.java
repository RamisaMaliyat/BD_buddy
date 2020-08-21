package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Khulna_Place extends AppCompatActivity implements View.OnClickListener{
    Button b1 ,b2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna__place);
        b1 = (Button) findViewById(R.id.kspeplace);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.kfood);
        b2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.kspeplace:

                Intent aintent = new Intent(Khulna_Place.this, Khulna_Spectacular_Place.class);
                startActivity(aintent);

                break;
            case R.id.kfood:

                Intent bintent = new Intent(Khulna_Place.this, Khunlafood.class);
                startActivity(bintent);

                break;
        }

    }
}
