package com.yellfun.www.csgonganju;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

  private WebView webView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);

    this.webView = findViewById(R.id.webview);

    WebSettings webSetting = this.webView.getSettings();

    webSetting.setJavaScriptEnabled(true);

    webSetting.setDomStorageEnabled(true);

    webSetting.setAppCacheEnabled(true);

    this.webView.setWebViewClient(new WebViewClient() {

      @Override
      public boolean shouldOverrideUrlLoading(WebView view, String url) {

        view.loadUrl(url);

        return true;
      }
    });
  }

  @Override
  protected void onStart() {

    super.onStart();

    this.webView.loadUrl("http://192.168.1.111:8080/Login");
  }
}
