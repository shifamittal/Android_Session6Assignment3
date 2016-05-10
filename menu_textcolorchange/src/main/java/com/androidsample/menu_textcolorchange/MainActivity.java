package com.androidsample.menu_textcolorchange;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();

        text=(TextView)findViewById(R.id.textView);
        String textcolor =String.valueOf(text);

 }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater M = getMenuInflater();
        M.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

       int id = item.getItemId();
       /*  Resources res=getResources();*/

        if (id == R.id.submenu1) {

            text.setTextColor(Color.parseColor("red"));
            return true;
        }
        if (id == R.id.submenu2) {

            text.setTextColor(Color.parseColor("green"));
            return true;
        }
        if (id == R.id.submenu3) {

            text.setTextColor(Color.parseColor("blue"));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
