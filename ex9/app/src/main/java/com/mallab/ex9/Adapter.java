package com.mallab.ex9;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    List<Modelclass> bars;
    Context context;

    Adapter(Context c, List<Modelclass> list )
    {
        bars=list;
        context = c;
    }

    @NonNull
    @NotNull
    @Override
    @SuppressLint("ResourceType")
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bars,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull @NotNull Adapter.ViewHolder holder, int position) {

        // Getting the color for every position
        String color = bars.get(position).getColor();

        // Set the color to the bar
        if (color.equals("Yellow"))
        {
            holder.linearLayout.setBackgroundTintList(AppCompatResources.getColorStateList(context, com.google.android.material.R.color.design_default_color_primary_dark));
        }
        else
        {
            holder.linearLayout.setBackgroundTintList(AppCompatResources.getColorStateList(context, com.google.android.material.R.color.cardview_dark_background));
        }
    }

    @Override
    public int getItemCount() {
        return bars.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        public ViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            linearLayout=itemView.findViewById(R.id.barlayout);
        }
    }
}

