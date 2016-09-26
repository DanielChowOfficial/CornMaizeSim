package com.example.drunk.cornmazesimulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button startButton;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        setContentView(R.layout.actual_game);
        startActivity(new Intent(MainActivity.this, ButtonActions.class));

    }


}

