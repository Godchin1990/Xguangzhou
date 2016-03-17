package com.github.xvnyata.xguangzhou.httpclient;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xvnyata on 16-3-13.
 */
public class ApiClent {

    public static final String WEA_BASE_URL = "http://news-at.zhihu.com/api/4/news/";


    //2016  0314 15 12 09
    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    private static ApiClent instance=new ApiClent();
    private static Apiservice apiservice;

    private ApiClent(){
        OkHttpClient okHttpClient=new OkHttpClient();
         Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WEA_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        apiservice=retrofit.create(Apiservice.class);
    }

    public static Apiservice weaApiservice(){
        return apiservice;
    }



}
