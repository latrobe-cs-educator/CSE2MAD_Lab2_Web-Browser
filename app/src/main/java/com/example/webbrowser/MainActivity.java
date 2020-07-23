package com.example.webbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    WebView webView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.goButton);
        webView = findViewById(R.id.webView);
        textView = findViewById(R.id.urlBox);

        //listener for button click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(textView.getText().toString());
            }
        });
    }

    protected void onDestroy() {
        super.onDestroy();
        if (webView != null)
        {
            webView.destroy();
        }
    }
}
