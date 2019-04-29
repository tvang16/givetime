package com.sourcey.givetime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import com.sourcey.materiallogindemo.R;

public class freerice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freerice);
    }

    public void loadWebPage(View v){

        Intent intent = new Intent(this, WebActivity.class);
        startActivity(intent);
    }
}