package com.example.android.tourguidep5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CemeteriesRecyclerViewAdapter extends RecyclerView.Adapter<CemeteriesRecyclerViewAdapter.ViewHolder> {

    Context mContext;
    List<Cemetery> mCemeteries;

    public CemeteriesRecyclerViewAdapter(Context mContext, List<Cemetery> mCemeteries) {
        this.mContext = mContext;
        this.mCemeteries = mCemeteries;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.cemetery_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(mCemeteries.get(position).getmName());
        holder.address.setText(mCemeteries.get(position).getmAddress());
        holder.description.setText(mCemeteries.get(position).getDescription());
        holder.burials.setText(mCemeteries.get(position).getBurials());
    }

    @Override
    public int getItemCount() {
        return mCemeteries.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView address;
        private TextView description;
        private TextView burials;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.cemetery_name);
            address = (TextView) itemView.findViewById(R.id.cemetery_address);
            description = (TextView) itemView.findViewById(R.id.cemetery_description);
            burials = (TextView) itemView.findViewById(R.id.cemetery_burials);
        }
    }
}
