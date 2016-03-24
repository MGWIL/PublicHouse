package com.android.mw.publichouse;

import android.os.Bundle;
import android.app.Activity;



public class aboutDrinks extends Activity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_drinks);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }



}
