package com.example.drunk.cornmazesimulator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class ButtonActions extends MainActivity implements View.OnClickListener {

        private Button fowardButton;
        protected void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);
                setContentView(R.layout.actual_game);
                fowardButton = (Button) findViewById(R.id.FowardButton);
                fowardButton.setOnClickListener(this);
        }



        int counter = 0;
        private ImageView img = (ImageView) findViewById(R.id.corn);
        public void onClick(View v){
                setContentView(R.layout.activity_main);
                if (v.getId() == R.id.FowardButton) {
                        if (counter == 1) {
                                img.setImageResource(R.drawable.closedlegs);
                                counter = 0;
                        } else {
                                img.setImageResource(R.drawable.openlegs);
                                counter = 1;
                        }
                }


        }

}








