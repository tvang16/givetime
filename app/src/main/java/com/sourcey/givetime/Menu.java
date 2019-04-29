package com.sourcey.givetime;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.sourcey.materiallogindemo.R;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer mysong;

    private CardView freerice, answer4earth, freekibble, profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mysong = MediaPlayer.create(Menu.this, R.raw.colors);
        mysong.start();
        mysong.release();


        freerice = (CardView) findViewById(R.id.bank_card);
        answer4earth = (CardView) findViewById(R.id.ideas_card);
        freekibble = (CardView) findViewById(R.id.add_card);
        profile= (CardView) findViewById(R.id.links_card);
        freerice.setOnClickListener(this);
        answer4earth.setOnClickListener(this);
        freekibble.setOnClickListener(this);
        profile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()){
            case R.id.bank_card: i = new Intent(this, freerice.class);startActivity(i); break ;
            case R.id.ideas_card: i = new Intent(this, answer4earth.class);startActivity(i); break ;
            case R.id.add_card: i = new Intent(this,freekibble.class);startActivity(i); break ;
            case R.id.links_card: i = new Intent(this, profile.class);startActivity(i); break ;
            default:break ;

        }
    }
}
