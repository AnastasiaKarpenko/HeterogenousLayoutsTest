package com.example.karpena2.heterogenouslayoutstest.Mock;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class ComplexRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Object> mItems;

    private final int USER = 0;
    private final int IMAGE = 1;

    public ComplexRecyclerViewAdapter(List<Object> items) {
        mItems = items;
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


    public int getItemViewType(int position) {
        if (mItems.get(position) instanceof User) {
            return USER;
        } else if (mItems.get(position) instanceof Drawable) {
            return IMAGE;
        }
        return -1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }


}
