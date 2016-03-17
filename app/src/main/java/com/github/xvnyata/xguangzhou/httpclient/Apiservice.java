package com.github.xvnyata.xguangzhou.httpclient;

import com.github.xvnyata.xguangzhou.model.Latest;
import com.github.xvnyata.xguangzhou.model.SingleNews;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by xvnyata on 16-3-13.
 */
public interface Apiservice {




  //http://news-at.zhihu.com/api/4/news/lates
   @GET("{latest}")
     Call<Latest> getNews(@Path("latest") String latest);

    @GET("{news_id}")
    Call<SingleNews> getNewsDetail(@Path("news_id") String news_id);
}
