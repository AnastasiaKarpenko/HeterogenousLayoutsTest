package com.example.karpena2.heterogenouslayoutstest.Mock;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.karpena2.heterogenouslayoutstest.R;

public class UserHolder extends RecyclerView.ViewHolder {
    private TextView mUserName;
    private TextView mUserOrigin;

    public UserHolder(@NonNull View itemView) {
        super(itemView);

        mUserName = itemView.findViewById(R.id.tv_userName);
        mUserOrigin = itemView.findViewById(R.id.tv_userOrigin);
    }

    public TextView getUserName() {
        return mUserName;
    }

    public void setUserName(TextView userName) {
        mUserName = userName;
    }

    public TextView getUserOrigin() {
        return mUserOrigin;
    }

    public void setUserOrigin(TextView userOrigin) {
        mUserOrigin = userOrigin;
    }
}
