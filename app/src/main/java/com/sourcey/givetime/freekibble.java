package com.sourcey.givetime;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sourcey.materiallogindemo.R;


public class freekibble extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freekibble);

    }
    public void open(View view){
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.freekibble.com"));
        startActivity(browserIntent);
    }
}