package com.example.goclick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    View screenView ;
    Button button;
    int[] color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color= new int[] {Color.BLACK,Color.RED,Color.YELLOW,Color.MAGENTA};

        screenView = findViewById(R.id.screen);
        button =(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aryLength=color.length;

                Random random = new Random();
                int rNum = random.nextInt(aryLength);

                screenView.setBackgroundColor(color[rNum]);
            }
        });

    }
}