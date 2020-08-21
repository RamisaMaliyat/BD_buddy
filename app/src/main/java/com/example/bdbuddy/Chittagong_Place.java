package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chittagong_Place extends AppCompatActivity implements View.OnClickListener {
    Button b1 ,b2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place);
        b1 = (Button) findViewById(R.id.cspeplace);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.cfood);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cspeplace:

                Intent aintent = new Intent(Chittagong_Place.this, Chittagong_Spectacular_places.class);
                startActivity(aintent);

                break;
            case R.id.cfood:

                Intent bintent = new Intent(Chittagong_Place.this, Chittagongfood.class);
                startActivity(bintent);

                break;
        }

    }
}
