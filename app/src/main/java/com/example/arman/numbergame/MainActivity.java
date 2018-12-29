package com.example.arman.numbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //variable scope--outside of the method; avalaible outside of the method.
    int randomNumber;

    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void guessBtnClicked(View view) {
        EditText guessEditText = (EditText) findViewById(R.id.guessNumber);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if (guessInt > randomNumber) {
            makeToast("Lower!");
        }else if (guessInt < randomNumber){
            makeToast("Higher");
        }else {
            makeToast("That's right! Try again!");

            Random rand = new Random();

            randomNumber = rand.nextInt(20)+1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;
    }




}
