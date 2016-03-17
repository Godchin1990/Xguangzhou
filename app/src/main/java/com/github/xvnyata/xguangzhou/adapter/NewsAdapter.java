package com.github.xvnyata.xguangzhou.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.github.xvnyata.xguangzhou.R;
import com.github.xvnyata.xguangzhou.activity.ScrollingNews;
import com.github.xvnyata.xguangzhou.model.Latest;

import java.util.List;

/**
 * Created by xvnyata on 16-3-14.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {



    private Context context;
    private List<Latest.StoriesEntity> story;
    private LayoutInflater layoutInflater;

    public NewsAdapter(Context context, List<Latest.StoriesEntity> story) {
        this.context = context;
        this.story = story;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        NewsViewHolder nvh=new NewsViewHolder(v);
        return nvh;
    }

    @Override
    public void onBindViewHolder(final NewsAdapter.NewsViewHolder holder, int position) {
       final int j=position;
        holder.new_title.setText(story.get(position).getTitle());
        Glide.with(context).load(story.get(position).getImages().get(0)).into(holder.new_pic);
     //   holder.new_pic.setImageResource(story.get(position).getImages());
         holder.cardView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(context, ScrollingNews.class);
                 intent.putExtra("News_ID",story.get(j).getId());
                context. startActivity(intent);

             }
         });
    }

    @Override
    public int getItemCount() {
        return story.size();
    }

    static class NewsViewHolder extends RecyclerView.ViewHolder{
       CardView cardView;
       ImageView new_pic;
       TextView new_title;
       public NewsViewHolder(final View itemview){
           super(itemview);
           cardView=(CardView) itemview.findViewById(R.id.Story_cardview);
           new_pic=(ImageView)itemview.findViewById(R.id.linear_list_pic);
           new_title=(TextView)itemview.findViewById(R.id.linear_list_title);
           new_title.setBackgroundColor(Color.argb(20, 0, 0, 0));
       }

   }



}

