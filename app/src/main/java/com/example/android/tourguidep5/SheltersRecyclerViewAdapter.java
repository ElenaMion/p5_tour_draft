package com.example.android.tourguidep5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SheltersRecyclerViewAdapter extends RecyclerView.Adapter<SheltersRecyclerViewAdapter.ViewHolder> {

    Context mContext;
    List<Shelter> mShelters;

    public SheltersRecyclerViewAdapter(Context mContext, List<Shelter> mShelters) {
        this.mContext = mContext;
        this.mShelters = mShelters;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.shelter_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(mShelters.get(position).getmName());
        holder.address.setText(mShelters.get(position).getmAddress());
        holder.phone.setText(mShelters.get(position).getmPhone());
        holder.url.setText(mShelters.get(position).getmUrl());
        holder.email.setText(mShelters.get(position).getmEmail());

    }

    @Override
    public int getItemCount() {
        return mShelters.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView address;
        private TextView phone;
        private TextView url;
        private TextView email;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.shelter_name);
            address = (TextView) itemView.findViewById(R.id.shelter_address);
            phone = (TextView) itemView.findViewById(R.id.shelter_phone);
            url = (TextView) itemView.findViewById(R.id.shelter_url);
            email = (TextView) itemView.findViewById(R.id.shelter_email);


        }
    }
}
