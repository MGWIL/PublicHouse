package com.android.mw.publichouse;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.mw.publichouse.R;

import java.util.List;

public class ReViewAdapter extends RecyclerView.Adapter<ReViewAdapter.DrinkViewHolder> {

    public static class DrinkViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView drinkName;
        TextView drinkLocation;
        ImageView drinkPhoto;

        DrinkViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            drinkName = (TextView)itemView.findViewById(R.id.drink_name);
            drinkLocation = (TextView)itemView.findViewById(R.id.drink_location);
            drinkPhoto = (ImageView)itemView.findViewById(R.id.drink_photo);
        }
    }

    List<Drink> drinks;

    ReViewAdapter(List<Drink> persons){
        this.drinks = persons;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public DrinkViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        DrinkViewHolder dvh = new DrinkViewHolder(v);
        return dvh;
    }

    @Override
    public void onBindViewHolder(DrinkViewHolder personViewHolder, int i) {
        personViewHolder.drinkName.setText(drinks.get(i).name);
        personViewHolder.drinkLocation.setText(drinks.get(i).location);
        personViewHolder.drinkPhoto.setImageResource(drinks.get(i).photoId);
    }



    @Override
    public int getItemCount() {
        return drinks.size();
    }





}