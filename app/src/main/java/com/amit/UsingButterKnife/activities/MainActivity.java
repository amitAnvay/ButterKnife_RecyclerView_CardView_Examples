package com.amit.UsingButterKnife.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.amit.UsingButterKnife.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.text1)
    TextView title;

    @Bind(R.id.button1)
    Button showFoodList;

    @Bind(R.id.button2)
    Button showPeopleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button1)
    void loadList() {
        Intent i = new Intent(this, FoodsListActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.button2)
    void loadPeopleLost(){
        Intent i = new Intent(this, PeopleListActivity.class);
        startActivity(i);
    }


}
