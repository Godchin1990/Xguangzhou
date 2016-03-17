package com.github.xvnyata.xguangzhou.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GlideBitmapDrawable;
import com.bumptech.glide.request.FutureTarget;
import com.github.xvnyata.xguangzhou.R;
import com.github.xvnyata.xguangzhou.httpclient.ApiClent;
import com.github.xvnyata.xguangzhou.model.SingleNews;

import java.io.File;
import java.util.concurrent.ExecutionException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ScrollingNews extends AppCompatActivity {
    WebView singleWeb;
    private Intent i;
    private Bundle b;
    private int s;
    // private String n;
    private SingleNews news;
    Context context;

    //http://www.easydone.cn/2015/10/26/
    //https://github.com/izzyleung/ZhihuDailyPurify/wiki/%E7%9F%A5%E4%B9%8E%E6%97%A5%E6%8A%A5-API-%E5%88%86%E6%9E%90
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_news);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        i = getIntent();
        b = i.getExtras();
        s = b.getInt("News_ID");

        singleWeb = (WebView) findViewById(R.id.News_details);
        System.out.println("------News_ID--------" + s);
        ApiClent.weaApiservice().getNewsDetail(String.valueOf(s)).enqueue(new Callback<SingleNews>() {
            @Override
            public void onResponse(Call<SingleNews> call, Response<SingleNews> response) {
                news = response.body();
                System.out.println(news.getTitle());

                singleWeb.loadData("</head><body>" + "<style>img{max-width:340px !important;}</style>" + news.getBody() + "</body></html>", "text/html; charset=UTF-8", null);
                WebSettings webSettings = singleWeb.getSettings(); // webView: 类WebView的实例
                singleWeb.getSettings().setDomStorageEnabled(true);
                webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);  //就是这句
                webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);

                // webSettings.setUseWideViewPort(true);
                //  webSettings.setLoadWithOverviewMode(true);
                // 设置支持缩放
                webSettings.setSupportZoom(true);
                // 设置缩放工具的显示
                webSettings.setBuiltInZoomControls(true);

                toolbar.setTitle(news.getTitle());
                setSupportActionBar(toolbar);

            }

            @Override
            public void onFailure(Call<SingleNews> call, Throwable t) {

            }
        });


    }
}
