package com.amit.UsingButterKnife.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amit.UsingButterKnife.R;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Amit_Gupta on 3/20/16.
 */
public class PeopleListAdapter extends RecyclerView.Adapter<PeopleListAdapter.ViewHolder> {

    Context mContext;

    public PeopleListAdapter(Context context){
        mContext = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.person_photo)
        ImageView photo;

        @Bind(R.id.person_name)
        TextView name;

        @Bind(R.id.person_age)
        TextView age;

        @Bind(R.id.person_details)
        TextView details;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }


    @Override
    public PeopleListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.people_list_card_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(PeopleListAdapter.ViewHolder holder, int position) {
        Picasso.with(mContext)
                .load("http://lorempixel.com/200/150/people/" + (position+1))
                .placeholder(R.drawable.placeholder_3)   // optional
                .error(R.drawable.placeholder_3)      // optional
                .resize(200, 150)                        // optional
                        //.rotate(90)                             // optional
                .into(holder.photo);

        holder.name.setText("NAME : " + "Some Name" );
        holder.age.setText("AGE : "+(position+25));
        holder.details.setText("DETAILS : "+"This is detail section of the person. This includes his job, favourite movie, actor, favourite sport and his hobbies");

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
