package com.example.fastestfingers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import believe.cht.fadeintextview.TextViewListener;

public class MainActivity extends AppCompatActivity {
    
    Button tryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //check typing speed
        tryButton = (findViewById(R.id.wannatrybutton));
        
        //animation of texts one by one
        believe.cht.fadeintextview.TextView animetextView1 = findViewById(R.id.textView);

        //setting listener for anime
        animetextView1.setListener(new TextViewListener() {
            @Override
            public void onTextStart() {
            }

            @Override
            public void onTextFinish() {
            }
        });

        //duration is set 200(ms) for quick and fast typer text
        animetextView1.setLetterDuration(200);
        animetextView1.setText("Quick typer?? \nFast typer??");
        animetextView1.isAnimating(); 
        
        

    }
}