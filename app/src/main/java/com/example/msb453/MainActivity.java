package com.example.msb453;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button myBicycle;
    private Button sharedBicycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBicycle = (Button) findViewById(R.id.myBicycle);
        myBicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyBicycle();
            }
        });

        sharedBicycle = (Button) findViewById(R.id.sharedBicycle);
        sharedBicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSharedBicycle();
            }
        });
    }
    public void openMyBicycle() {
        Intent intent = new Intent(this, MyBicycle.class);
        startActivity(intent);
    }
    public void openSharedBicycle() {
        Intent intent = new Intent(this, SharedBicycle.class);
        startActivity(intent);
    }
}