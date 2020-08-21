package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Division extends AppCompatActivity implements View.OnClickListener  {


    Button Dhaka , Rajshahi,Chittagong,Sylhet,Barisal,Khulna,Rangpur,Mymensing ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        Dhaka = (Button) findViewById(R.id.Dhaka);
        Rajshahi =(Button) findViewById(R.id.Rajshahi);
        Chittagong =(Button) findViewById(R.id.Chittagong);
        Sylhet =(Button) findViewById(R.id.Sylhet);
        Barisal =(Button) findViewById(R.id.Borishal);
        Khulna =(Button) findViewById(R.id.Khulna);
        Mymensing =(Button) findViewById(R.id.Mymensing);
        Rangpur =(Button) findViewById(R.id.Rangpur);


        Dhaka.setOnClickListener(this);
        Rajshahi.setOnClickListener(this);
        Chittagong.setOnClickListener(this);
        Sylhet.setOnClickListener(this);
        Barisal.setOnClickListener(this);
        Khulna.setOnClickListener(this);
        Mymensing.setOnClickListener(this);
        Rangpur.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.Dhaka:

                Intent Intent = new Intent(Division.this, EmergecyDhaka.class);
                startActivity(Intent);

                break;

            case R.id.Rajshahi:

                Intent aIntent = new Intent(Division.this, EmergecyRajshahi.class);
                startActivity(aIntent);

                break;


            case R.id.Sylhet:

                Intent bIntent = new Intent(Division.this, EmergencySylhet.class);
                startActivity(bIntent);

                break;

            case R.id.Borishal:

                Intent cIntent = new Intent(Division.this, EmergencyBarisal.class);
                startActivity(cIntent);

                break;
            case R.id.Chittagong:

                Intent dIntent = new Intent(Division.this, EmergencyChittagong.class);
                startActivity(dIntent);

                break;

            case R.id.Khulna:

                Intent eIntent = new Intent(Division.this, EmergencyKhulna.class);
                startActivity(eIntent);

                break;
            case R.id.Rangpur:

                Intent fIntent = new Intent(Division.this, EmergencyRangpur.class);
                startActivity(fIntent);

                break;

            case R.id.Mymensing:

                Intent gIntent = new Intent(Division.this, EmergencyMymensing.class);
                startActivity(gIntent);

                break;



        }

    }
}
