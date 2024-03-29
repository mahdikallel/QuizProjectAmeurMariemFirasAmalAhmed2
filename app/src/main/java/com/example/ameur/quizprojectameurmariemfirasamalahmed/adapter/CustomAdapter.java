package com.example.ameur.quizprojectameurmariemfirasamalahmed.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ameur.quizprojectameurmariemfirasamalahmed.R;
import com.example.ameur.quizprojectameurmariemfirasamalahmed.wrapper.ListItemWrapper;

import java.util.List;

/**
 * Created by makni on 17/05/2016.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>  {

    private List<ListItemWrapper> btmliste;



    public CustomAdapter(List<ListItemWrapper> btmliste) {
        this.btmliste=btmliste;
    }

    @Override
    public int getItemCount() {

        return btmliste.size();
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.v("slim", "Adapter:onCreateViewHolder called");
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.card_item_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        // ... Nothing to do
        ViewHolder viewholder = new ViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListItemWrapper liste = btmliste.get(position);
        holder.mItemTitle.setText(liste.getTitle());
        if(position == position)
            holder.itemView.setBackgroundColor(Color.GRAY);
        else
            holder.itemView.setBackgroundColor(Color.RED);

    }


    // Provide a reference to the views for each data item
    public static class ViewHolder extends RecyclerView.ViewHolder {


        public TextView mItemTitle;


        public ViewHolder(View view) {
            super(view);
            mItemTitle = (TextView) view.findViewById(R.id.label);


        }
    }




}