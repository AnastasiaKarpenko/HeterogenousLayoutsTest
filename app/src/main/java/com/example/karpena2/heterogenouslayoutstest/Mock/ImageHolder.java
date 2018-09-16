package com.example.karpena2.heterogenouslayoutstest.Mock;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.karpena2.heterogenouslayoutstest.R;

public class ImageHolder extends RecyclerView.ViewHolder {
    private ImageView mSampleImage;

    public ImageHolder(@NonNull View itemView) {
        super(itemView);
        mSampleImage = itemView.findViewById(R.id.sample_image);
    }

    public ImageView getSampleImage() {
        return mSampleImage;
    }

    public void setSampleImage(ImageView sampleImage) {
        mSampleImage = sampleImage;
    }
}
