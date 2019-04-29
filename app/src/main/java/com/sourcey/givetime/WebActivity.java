package com.sourcey.givetime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.sourcey.materiallogindemo.R;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        String url = "http://www.freerice.com";
        WebView web = (WebView) findViewById(R.id.webView);
        web.loadUrl(url);


    }

}
