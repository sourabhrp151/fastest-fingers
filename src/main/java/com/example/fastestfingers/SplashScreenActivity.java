package com.example.fastestfingers;

//import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.os.Handler;
import android.view.Menu;


public class SplashScreenActivity extends Activity {

        //time duration for spllash
        private final int SPLASH_DISPLAY_LENGTH = 1000;

        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle icicle) {
            super.onCreate(icicle);
            setContentView(R.layout.splash_activity_layout_screen);

          //a new handller
            new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                    //creating an intent to go to main activity.
                    Intent mainIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
                    SplashScreenActivity.this.startActivity(mainIntent);
                    SplashScreenActivity.this.finish();
                }
                //length is 1000ms
            }, SPLASH_DISPLAY_LENGTH);
        }

}