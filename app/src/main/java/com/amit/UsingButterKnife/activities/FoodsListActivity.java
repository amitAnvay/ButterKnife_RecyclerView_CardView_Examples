package com.amit.UsingButterKnife.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.amit.UsingButterKnife.R;
import com.amit.UsingButterKnife.adapters.MyFoodListAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FoodsListActivity extends AppCompatActivity {

    @Bind(R.id.my_recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods_list);
        ButterKnife.bind(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyFoodListAdapter(this));

    }
}
