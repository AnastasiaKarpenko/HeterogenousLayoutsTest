package com.example.karpena2.heterogenouslayoutstest.Mock;

import android.graphics.drawable.Drawable;

import com.example.karpena2.heterogenouslayoutstest.R;

import java.util.ArrayList;
import java.util.List;

public class MockGenerator {
    private List<Object> mItems = new ArrayList<>();


    public List<Object> generateData() {
        mItems.add(new User("Dany Targaryen", "Valyria"));
        mItems.add(new User("Rob Stark", "Winterfell"));
        mItems.add(R.drawable.sample_image);
        mItems.add(new User("Jon Snow", "Castle Black"));
        mItems.add(R.drawable.sample_image);
        mItems.add(new User("Tyrion Lanister", "King's Landing"));

        return mItems;
    }

    public void addUser(User user) {
        mItems.add(user);

    }

    public void addImage(Drawable image) {
        mItems.add(image);
    }


}
