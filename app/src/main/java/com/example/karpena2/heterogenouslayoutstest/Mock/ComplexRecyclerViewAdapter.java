package com.example.karpena2.heterogenouslayoutstest.Mock;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.karpena2.heterogenouslayoutstest.R;

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
        } else if (mItems.get(position) instanceof Integer) {
            return IMAGE;
        }
        return -1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        RecyclerView.ViewHolder mViewHolder;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {
            case USER:
                View v1 = inflater.inflate(R.layout.layout_userholder, viewGroup, false);
                mViewHolder = new UserHolder(v1);
                break;
            case IMAGE:
                View v2 = inflater.inflate(R.layout.layout_imageholder, viewGroup, false);
                mViewHolder = new ImageHolder(v2);
                break;
            default:
                View v = inflater.inflate(R.layout.layout_userholder, viewGroup, false);
                mViewHolder = new UserHolder(v);
                break;
        }

        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {
            case USER:
                UserHolder userHolder = (UserHolder) viewHolder;
                configureUserHolder(userHolder, position);
                break;
            case IMAGE:
                ImageHolder imageHolder = (ImageHolder) viewHolder;
                configureImageHolder(imageHolder);
                break;
        }
    }


    private void configureImageHolder(ImageHolder imageHolder) {
        imageHolder.getSampleImage().setImageResource(R.drawable.sample_image);
    }

    private void configureUserHolder(UserHolder userHolder, int position) {
        Object u = mItems.get(position);
        User user = (User) u;
        if (user != null) {
            userHolder.getUserName().setText(String.format("Name: %s", user.getName()));
            userHolder.getUserOrigin().setText(String.format("From: %s", user.getWhereFrom()));
        }
    }
}
