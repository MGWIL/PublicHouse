package com.android.mw.publichouse;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    /**
     * This app displays an order form for drinks.
     */
    private List<Drinks> drinks;
    private RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        drinks = new ArrayList<>();
        drinks.add(new Drinks("Emma Wilson", "23 years old", R.drawable.emma));
        drinks.add(new Drinks("Lavery Maiss", "25 years old", R.drawable.lavery));
        drinks.add(new Drinks("Lillie Watts", "35 years old", R.drawable.lillie));
    }

    private void initializeAdapter(){
        ReViewAdaptor adapter = new ReViewAdaptor(drinks);
        rv.setAdapter(adapter);
    }
}

