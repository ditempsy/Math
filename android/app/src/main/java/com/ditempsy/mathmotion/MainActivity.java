package com.ditempsy.mathmotion;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;

public class MainActivity extends Activity {
  private WebView web;
  @Override public void onCreate(Bundle saved) {
    super.onCreate(saved);
    getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
    web = new WebView(this);
    web.setWebViewClient(new WebViewClient());
    web.setWebChromeClient(new WebChromeClient());
    web.getSettings().setJavaScriptEnabled(true);
    web.getSettings().setDomStorageEnabled(true);
    web.getSettings().setAllowFileAccess(true);
    web.getSettings().setMediaPlaybackRequiresUserGesture(false);
    setContentView(web);
    web.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed() {
    web.evaluateJavascript("(function(){if(document.querySelector('.main.full')){document.getElementById('backFS').click();return 'handled'} if(document.getElementById('drawSec') && !document.getElementById('drawSec').hidden){document.querySelector('#mode [data-v=eq]').click();return 'handled'} return 'back'})()", value -> { if (!"\"handled\"".equals(value)) finish(); });
  }
}
