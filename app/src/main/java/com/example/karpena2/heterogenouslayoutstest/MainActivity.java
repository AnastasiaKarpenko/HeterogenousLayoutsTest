package com.example.karpena2.heterogenouslayoutstest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.karpena2.heterogenouslayoutstest.Mock.ComplexRecyclerViewAdapter;
import com.example.karpena2.heterogenouslayoutstest.Mock.MockGenerator;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView mRecyclerView;
    private MockGenerator mMockGenerator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMockGenerator = new MockGenerator();

        mRecyclerView = findViewById(R.id.recycler_view);

        bindDataToAdapter();

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    private void bindDataToAdapter() {
        mRecyclerView.setAdapter(new ComplexRecyclerViewAdapter(mMockGenerator.generateData()));
    }
}
