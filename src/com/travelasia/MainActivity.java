package com.travelasia;

import java.io.IOException;
import java.io.InputStream;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends Activity {


    WebView  wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      
        setContentView(R.layout.activity_main);
        
         wb = new WebView(this);
        wb.loadUrl("file:///android_asset/Home.html");
        
        setContentView(wb);
        
         
       
       
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        if(wb.canGoBack() == true){
            wb.goBack();
        }else{
            super.onBackPressed();
        }
    }
    
}
