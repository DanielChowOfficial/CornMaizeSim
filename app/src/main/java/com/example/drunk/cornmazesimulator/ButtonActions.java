package com.example.drunk.cornmazesimulator;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class ButtonActions extends MainActivity implements View.OnClickListener {
        private ImageView img;
        private Button fowardButton;
        private Button leftButton;
        private Button rightButton;
        private Button turnAroundButton;
        protected void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);
                setContentView(R.layout.actual_game);
                fowardButton = (Button) findViewById(R.id.FowardButton);
                fowardButton.setOnClickListener(this);
                leftButton = (Button) findViewById(R.id.LeftButton);
                leftButton.setOnClickListener(this);
                rightButton = (Button) findViewById(R.id.RightButton);
                rightButton.setOnClickListener(this);
                turnAroundButton = (Button) findViewById(R.id.TurnAroundButton);
                turnAroundButton.setOnClickListener(this);
                img = (ImageView) findViewById(R.id.corn);
        }



        int counter = 1;
        public void onClick(View v){
                counter = imageChange(counter);
                if (v.getId() == R.id.FowardButton) {
                       fowardMove();
                }
                if (v.getId() == R.id.RightButton) {
                        rightMove();
                }
                if (v.getId() == R.id.LeftButton) {
                        leftMove();
                }
                if (v.getId() == R.id.TurnAroundButton) {
                        turnAroundMove();
                }


        }
        public int imageChange(int counter){
                if (counter == 1) {
                        img.setImageResource(R.drawable.closedlegs);
                        counter = 0;
                } else {
                        img.setImageResource(R.drawable.openlegs);
                        counter = 1;
                }

              return counter;
        }

        public void fowardMove(){
                //Implement movement on grid and change in graphic.
        }
        public void leftMove(){
                //Implement movement on grid and change in graphic.
        }
        public void rightMove(){
                //Implement movement on grid and change in graphic.
        }
        public void turnAroundMove(){
                //Implement movement on grid and change in graphic.
        }

}








