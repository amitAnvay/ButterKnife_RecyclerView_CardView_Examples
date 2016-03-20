package com.amit.UsingButterKnife.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.amit.UsingButterKnife.R;
import com.amit.UsingButterKnife.adapters.PeopleListAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PeopleListActivity extends AppCompatActivity {

    @Bind(R.id.people_recycler_view)
    RecyclerView peopleListRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.bind(this);

        peopleListRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        peopleListRecyclerView.setAdapter(new PeopleListAdapter(this));

    }

}
