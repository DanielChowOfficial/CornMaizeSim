package com.example.drunk.cornmazesimulator;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class ButtonActions extends MainActivity implements View.OnClickListener {
        private ImageView img;
        private Button fowardButton;
        protected void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);
                setContentView(R.layout.actual_game);
                fowardButton = (Button) findViewById(R.id.FowardButton);
                fowardButton.setOnClickListener(this);
                img = (ImageView) findViewById(R.id.corn);
        }



        int counter = 0;
        public void onClick(View v){

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








