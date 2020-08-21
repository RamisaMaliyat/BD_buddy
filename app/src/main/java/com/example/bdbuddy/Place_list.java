package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Place_list extends AppCompatActivity implements View.OnClickListener {
private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_list);
        b=findViewById(R.id.Dhaka);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(Place_list.this,MainActivity.class);
        startActivity(i);
    }
}
