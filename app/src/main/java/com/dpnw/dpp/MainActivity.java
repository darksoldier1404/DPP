package com.dpnw.dpp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView wv;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = findViewById(R.id.webview);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://dpnw.site/");
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(wv.canGoBack()) {
            wv.goBack();
        }else{
            super.onBackPressed();
        }
    }
}