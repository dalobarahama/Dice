package com.example.dice;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView diceImages;
    private Random randomClick = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diceImages = findViewById(R.id.dice_image);
        diceImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = randomClick.nextInt(6) + 1;
        Intent intentNumber = new Intent();
        intentNumber.putExtra("diceNumber", randomNumber);
        switch (randomNumber) {
            case 1:
                diceImages.setImageResource(R.drawable.dice1);
                break;
            case 2:
                diceImages.setImageResource(R.drawable.dice2);
                break;
            case 3:
                diceImages.setImageResource(R.drawable.dice3);
                break;
            case 4:
                diceImages.setImageResource(R.drawable.dice4);
                break;
            case 5:
                diceImages.setImageResource(R.drawable.dice5);
                break;
            case 6:
                diceImages.setImageResource(R.drawable.dice6);
                break;
        }
    }

}
