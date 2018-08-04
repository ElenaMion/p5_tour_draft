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

public class ChurchesRecyclerViewAdapter extends RecyclerView.Adapter<ChurchesRecyclerViewAdapter.ViewHolder> {

    Context mContext;
    List<Church> mChurches;

    public ChurchesRecyclerViewAdapter(Context mContext, List<Church> mChurches) {
        this.mContext = mContext;
        this.mChurches = mChurches;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.church_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(mChurches.get(position).getmName());
        holder.address.setText(mChurches.get(position).getmAddress());
        holder.phone.setText(mChurches.get(position).getmPhone());
        holder.description.setText(mChurches.get(position).getmDescription());
        holder.year.setText("Built in " + mChurches.get(position).getmYearBuilt());
        holder.imgChurch.setImageResource(mChurches.get(position).getmImageResourceId());

    }

    @Override
    public int getItemCount() {
        return mChurches.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView address;
        private TextView phone;
        private TextView description;
        private TextView year;
        private ImageView imgChurch;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.church_name);
            address = (TextView) itemView.findViewById(R.id.church_address);
            phone = (TextView) itemView.findViewById(R.id.church_phone);
            description = (TextView) itemView.findViewById(R.id.church_description);
            year = (TextView) itemView.findViewById(R.id.church_year);
            imgChurch = (ImageView) itemView.findViewById(R.id.church_image);

        }
    }
}
