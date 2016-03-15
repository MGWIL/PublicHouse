package com.android.mw.publichouse;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This app displays an order form to order coffee.
     */

    int quantity = (0);
    double pintPrice = (1.9);




    public void increment(View view) {
        quantity = (quantity + 1);
        submitOrder(quantity);

    }

    public void decrement(View view) {
        if (quantity > 0) {
            quantity = (quantity - 1);
            submitOrder(quantity);
        } else {
            submitOrder(quantity);
        }
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(int quantity) {
        display(quantity);
        displayPrice(quantity * pintPrice);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This Method Displayes the Total Cost of Order
     */
    private void displayPrice(double number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }

}
