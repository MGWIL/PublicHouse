package com.android.mw.publichouse;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    /**
     * This app displays an order form for drinks.
     */
    private List<Drink> drinks;
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
        drinks.add(new Drink("Guiness", "Dublin, Ireland", R.drawable.guinness));
        drinks.add(new Drink("Amstel", "Amsterdam, Netherlands", R.drawable.amstel));
        drinks.add(new Drink("Thatchers", "Somerset, England", R.drawable.cider));
        drinks.add(new Drink("Heineken", "Zoeterwoude, Netherlands", R.drawable.heineken));
        drinks.add(new Drink("Old Speckled Hen", "Oxfordshire, England", R.drawable.speckled_hen));
    }

    private void initializeAdapter(){
        ReViewAdapter adapter = new ReViewAdapter(drinks);
        rv.setAdapter(adapter);

    }

    int quantity = (0);
    double pintPrice = (1.9);


    /**
     * this method increases the drinks by one
     */


    public void increment(View view) {
        quantity = (quantity + 1);
        submitOrder(quantity);

    }

    /**
     * this method decreases the drinks by one
     */


    public void decrement(View view) {
        if (quantity > 0)
        {
            quantity = (quantity - 1);
            submitOrder(quantity);
        }
        else
        {
            submitOrder(quantity);
        }
    }

    /**
     * This method is called to display updated total.
     */
    public void submitOrder(int quantity) {
        display(quantity);
        displayPrice(quantity * pintPrice);
    }

    /**
     * This method displays the given quantity value on the screen.
     */

    /*
    changes
     */
    private void display(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This Method Displayes the Total Cost of Order
     */
    private void displayPrice(double number)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }


}



