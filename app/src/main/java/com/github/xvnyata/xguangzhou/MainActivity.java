package com.github.xvnyata.xguangzhou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.github.xvnyata.xguangzhou.adapter.NewsAdapter;
import com.github.xvnyata.xguangzhou.httpclient.ApiClent;
import com.github.xvnyata.xguangzhou.httpclient.Apiservice;
import com.github.xvnyata.xguangzhou.model.Latest;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

   // public String now_long_time = ApiClent.getStringDate();
    private Apiservice apiservicree;
    private Latest latestStory;
    private NewsAdapter newsAdapter;
    private RecyclerView recyclerView;
    private List<Latest.StoriesEntity> storiesBody;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiClent.weaApiservice().getNews("latest").enqueue(
                new Callback<Latest>() {
                    @Override
                    public void onResponse(Call<Latest> call, Response<Latest> response) {
                        storiesBody = response.body().getStories();
                        newsAdapter=new NewsAdapter(MainActivity.this,storiesBody);
                        recyclerView.setAdapter(newsAdapter);
                        newsAdapter.notifyDataSetChanged();

                    }

                    @Override
                    public void onFailure(Call<Latest> call, Throwable t) {

                    }
                }
        );
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);

        recyclerView= (RecyclerView) findViewById(R.id.all_story);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);


        //("guangzhou",101291401,now_long_time,ApiClent.SHOWAPI_SIGN)




    }
}
