package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){

        Button pressed = (Button) view;

        switch (pressed.getText().toString()){

            case "Do you\nspeak english?":
                convert = MediaPlayer.create(this,R.raw.doyouspeakenglish);
                convert.start();
                break;
            case "Good evening":
                convert = MediaPlayer.create(this,R.raw.goodevening);
                convert.start();
                break;
            case "Hello":
                convert = MediaPlayer.create(this,R.raw.hello);
                convert.start();
                break;
            case "How are you?":
                convert = MediaPlayer.create(this,R.raw.howareyou);
                convert.start();
                break;
            case "I live in...":
                convert = MediaPlayer.create(this,R.raw.ilivein);
                convert.start();
                break;
            case "My name is...":
                convert = MediaPlayer.create(this,R.raw.mynameis);
                convert.start();
                break;
            case "Please":
                convert = MediaPlayer.create(this,R.raw.please);
                convert.start();
                break;
            case "Welcome":
                convert = MediaPlayer.create(this,R.raw.welcome);
                convert.start();
                break;

        }

    }

}