package com.example.bdbuddy;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;


public class EmergencyChittagong extends AppCompatActivity {
    ArrayList<String>original_data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_chittagong);
        TextView   original_text = (TextView)findViewById(R.id.original_text3);
        //Load from raw folder

        Scanner data_in = new Scanner((getResources().openRawResource(R.raw.chittagong)));
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
