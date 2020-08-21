package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sylhet_Place extends AppCompatActivity implements View.OnClickListener{
    Button b1 ,b2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place);

        b1 = (Button) findViewById(R.id.sspeplace);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.sfood);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.sspeplace:

                Intent aintent = new Intent(Sylhet_Place.this, Sylhet_Spectacular_Place.class);
                startActivity(aintent);

                break;
            case R.id.sfood:

                Intent bintent = new Intent(Sylhet_Place.this, Sylhetfood.class);
                startActivity(bintent);

                break;
        }
    }
}
