package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView placeCardView,findCardView,workCardView , fourthCardView , datetimeview ,placeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        placeCardView=findViewById(R.id.placeview);
        findCardView=findViewById(R.id.findView);
        workCardView=findViewById(R.id.workView);
        //placeCardView=findViewById(R.id.placeview);

        fourthCardView = findViewById(R.id.fourthview);
        datetimeview = findViewById(R.id.fourthview1);
        placeView = findViewById(R.id.SpectacularPlaces);


        placeCardView.setOnClickListener(this);
        findCardView.setOnClickListener(this);
        workCardView.setOnClickListener(this);
        //placeCardView.setOnClickListener(this);

        fourthCardView.setOnClickListener(this);
        datetimeview.setOnClickListener(this);
        placeView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.placeview)
        {
            Intent i=new Intent(MainActivity.this,Place_list.class);
            startActivity(i);
        }
         else if(v.getId()==R.id.findView)
        {
            Intent i=new Intent(MainActivity.this,guide_list.class);
            startActivity(i);

        }
        else if(v.getId()==R.id.fourthview)
        { Intent i=new Intent(MainActivity.this,Division.class);
            startActivity(i);


        }

        else if(v.getId()==R.id.workView)
        { Intent i=new Intent(MainActivity.this,I_want_to_work.class);
            startActivity(i);


        }

        else if(v.getId()==R.id.SpectacularPlaces)
        { Intent i=new Intent(MainActivity.this,Selected_Divisions.class);
            startActivity(i);


        }



        else if(v.getId()==R.id.fourthview1)
        { Intent i=new Intent(MainActivity.this,Date_And_Time.class);
            startActivity(i);


        }


    }
}
