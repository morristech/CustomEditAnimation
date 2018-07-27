package com.play.customAnimation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

import com.play.custom.edittext.CustomEditTextAnimation;

public class MainActivity extends AppCompatActivity {

    CustomEditTextAnimation customEditTextAnimation1 , customEditTextAnimation2 , customEditTextAnimation3;
    ViewGroup transitionsContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        transitionsContainer = findViewById(R.id.transitions_container);
        customEditTextAnimation1 = findViewById(R.id.edt_rounded);
        customEditTextAnimation2 = findViewById(R.id.edt_rectangle);
        customEditTextAnimation3 = findViewById(R.id.edt_bottomLine);

        customEditTextAnimation1.init(customEditTextAnimation1,transitionsContainer,100,20,250,40);
        customEditTextAnimation2.init(customEditTextAnimation2,transitionsContainer,100,10,150,20);
        customEditTextAnimation3.init(customEditTextAnimation3,transitionsContainer,100,30,200,40);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
