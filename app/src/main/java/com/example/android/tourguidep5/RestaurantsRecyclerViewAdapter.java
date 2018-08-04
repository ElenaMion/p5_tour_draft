package com.example.android.tourguidep5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RestaurantsRecyclerViewAdapter extends RecyclerView.Adapter<RestaurantsRecyclerViewAdapter.ViewHolder> {

    Context mContext;
    List<Restaurant> mRestaurants;

    public RestaurantsRecyclerViewAdapter(Context mContext, List<Restaurant> mRestaurants) {
        this.mContext = mContext;
        this.mRestaurants = mRestaurants;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.restaurant_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(mRestaurants.get(position).getmName());
        holder.address.setText(mRestaurants.get(position).getmAddress());
        holder.phone.setText(mRestaurants.get(position).getmPhone());
        holder.openingHours.setText(mRestaurants.get(position).getmOpeningHours());

        //sets appropriate number of dollar signs for the price range
        switch (mRestaurants.get(position).getmPriceRange()) {
            case 1:
                holder.priceRange.setImageResource(R.drawable.ic_money_yellow1);
                break;
            case 2:
                holder.priceRange.setImageResource(R.drawable.ic_money_yellow2);
                break;
            case 3:
                holder.priceRange.setImageResource(R.drawable.ic_money_yellow3);
                break;
            default:
                holder.priceRange.setImageResource(R.drawable.ic_money_yellow3);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mRestaurants.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView address;
        private TextView phone;
        private ImageView priceRange;
        private TextView openingHours;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.restaurant_name);
            address = (TextView) itemView.findViewById(R.id.restaurant_address);
            phone = (TextView) itemView.findViewById(R.id.restaurant_phone);
            priceRange = (ImageView) itemView.findViewById(R.id.price_range_image);
            openingHours = (TextView) itemView.findViewById(R.id.restaurant_hours);
        }
    }
}
