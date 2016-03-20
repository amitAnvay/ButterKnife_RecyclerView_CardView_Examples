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
public class MyFoodListAdapter extends RecyclerView.Adapter<MyFoodListAdapter.ViewHolder> {

    private Context mContext;

    public MyFoodListAdapter(Context context){
        mContext = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_view_item, parent, false);
        ViewHolder vH = new ViewHolder(view);
        return vH;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Picasso.with(mContext)
                .load("http://lorempixel.com/200/150/food/" + (position+1))
                .placeholder(R.drawable.placeholder_3)   // optional
                .error(R.drawable.placeholder_3)      // optional
                .resize(200, 150)                        // optional
                //.rotate(90)                             // optional
                .into(holder.listItemImage);

        holder.listItemText.setText("Food Item "+(position+1));
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        @Bind(R.id.list_item_text)
        public TextView listItemText;

        @Bind(R.id.list_item_image)
        public ImageView listItemImage;


        public ViewHolder(View itemView) {
            super(itemView);
            //listItemText = (TextView)itemView.findViewById(R.id.list_item_text);
            //listItemImage = (ImageView)itemView.findViewById(R.id.list_item_image);
            ButterKnife.bind(this, itemView);
        }
    }
}
