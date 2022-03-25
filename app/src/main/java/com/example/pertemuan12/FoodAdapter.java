package com.example.pertemuan12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<Food> foodArrayList;
    Context context;

    public FoodAdapter(ArrayList<Food> foodArrayList, Context context) {
        this.foodArrayList = foodArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.food_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Food tempFood = foodArrayList.get(position);
        holder.foodName.setText(tempFood.getName());
        holder.foodPrice.setText(tempFood.getPrice());
        holder.foodDesc.setText(tempFood.getFoodInformation());
        holder.foodThumbnail.setImageResource(tempFood.getFoodThumbnail());
    }

    @Override
    public int getItemCount() {
        return foodArrayList.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {
    ImageView foodThumbnail;
    TextView foodName;
    TextView foodDesc;
    TextView foodPrice;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        foodThumbnail = itemView.findViewById(R.id.food_thumbnail_iv);
        foodName = itemView.findViewById(R.id.food_title_tv);
        foodDesc = itemView.findViewById(R.id.food_desc_tv);
        foodPrice = itemView.findViewById(R.id.food_price_tv);

    }
}