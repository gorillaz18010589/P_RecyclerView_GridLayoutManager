package com.example.p_recyclerview_gridlayoutmanager;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BlanceRecyclerViewAdapter extends RecyclerView.Adapter<BlanceRecyclerViewAdapter.BlanceViewHolder> {
    private List<Game> mData;
    private Context mContext;
    private double sum ;

    public BlanceRecyclerViewAdapter(List<Game> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public BlanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item,parent,false);
        BlanceViewHolder blanceViewHolder = new BlanceViewHolder(view);

        return blanceViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BlanceViewHolder holder, int position) {

        holder.tvGameName.setText(mData.get(position).name);
        holder.tvMoney.setText(String.valueOf(mData.get(position).value));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public  static class BlanceViewHolder extends RecyclerView.ViewHolder{
        private TextView tvGameName, tvMoney;
        public BlanceViewHolder(@NonNull View itemView) {
            super(itemView);

            tvGameName = itemView.findViewById(R.id.tvName);
            tvMoney = itemView.findViewById(R.id.tvMoney);
        }
    }
}
