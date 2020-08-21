package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Selected_Divisions extends AppCompatActivity {
    Spinner spinnerexample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected__divisions);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner_example);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.division, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        // this will be called when you select any item in this spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View arg1, int position, long arg3) {
                // get the text at that position
                String Text = spinner.getSelectedItem().toString();
                if (Text.equals("Barisal")) {
                    Intent NewPost = new Intent(Selected_Divisions.this, Barisal_Place.class);
                    startActivity(NewPost);
                }
                if (Text.equals("Dhaka")) {
                    Intent NewPost = new Intent(Selected_Divisions.this, Dhaka_Place.class);
                    startActivity(NewPost);
                }
                if (Text.equals("Rajshahi")) {
                      Intent NewPost = new Intent(Selected_Divisions.this, Rajshahi_Place.class);
                       startActivity(NewPost);
                }
                if (Text.equals("Khulna")) {
                      Intent NewPost = new Intent(Selected_Divisions.this, Khulna_Place.class);
                      startActivity(NewPost);
                }
                if (Text.equals("Chittagong")) {
                      Intent NewPost = new Intent(Selected_Divisions.this, Chittagong_Place.class);
                      startActivity(NewPost);
                }
                if (Text.equals("Sylhet")) {
                     Intent NewPost = new Intent(Selected_Divisions.this, Sylhet_Place.class);
                     startActivity(NewPost);
                }
                if (Text.equals("Rangpur")) {
                     Intent NewPost = new Intent(Selected_Divisions.this, Rangpur_Place.class);
                     startActivity(NewPost);
                }
                if (Text.equals("Mymensing")) {
                     Intent NewPost = new Intent(Selected_Divisions.this, Mymensing_Place.class);
                     startActivity(NewPost);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
    }
}
