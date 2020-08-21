package com.example.bdbuddy;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;


public class EmergencyKhulna extends AppCompatActivity {
    ArrayList<String>original_data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_khulna);
        TextView   original_text = (TextView)findViewById(R.id.original_text4);
        //Load from raw folder

        Scanner data_in = new Scanner((getResources().openRawResource(R.raw.khulna)));
        while(data_in.hasNext())
        {
            original_data.add(data_in.nextLine());
        }
        original_text.setText(("  "));
        for(int i=0;i<original_data.size();i++)
        {
            original_text.append(original_data.get(i)+ "\n");
        }
    }
}
