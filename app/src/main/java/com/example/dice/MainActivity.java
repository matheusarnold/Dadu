package com.example.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDadu;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDadu = findViewById(R.id.dadu);
        imageViewDadu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                rollDice();
            }
        });
    }

    private void rollDice() {
        int rndNumb = rng.nextInt(6) + 1;

        switch (rndNumb) {
            case 1:
                imageViewDadu.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDadu.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDadu.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDadu.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDadu.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDadu.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
