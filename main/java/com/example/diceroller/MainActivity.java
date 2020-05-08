package com.example.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                Toast.makeText(MainActivity.this,"You Will Get Everything You Want",Toast.LENGTH_SHORT).show();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                Toast.makeText(MainActivity.this,"You Have Great Day Today",Toast.LENGTH_SHORT).show();
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                Toast.makeText(MainActivity.this,"Be Humble Always",Toast.LENGTH_SHORT).show();
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                Toast.makeText(MainActivity.this,"Think Twice Act Wise",Toast.LENGTH_SHORT).show();
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                Toast.makeText(MainActivity.this,"Always Work Smarter",Toast.LENGTH_SHORT).show();
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                Toast.makeText(MainActivity.this,"You Should Self Introspects",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}