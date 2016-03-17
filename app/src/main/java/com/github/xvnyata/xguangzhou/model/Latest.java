package com.github.xvnyata.xguangzhou.model;

import java.util.List;

/**
 * Created by xvnyata on 16-3-14.
 */
public class Latest {

    /**
     * date : 20160314
     * stories : [{"images":["http://pic4.zhimg.com/6ce13e293fe2d36e6a9575b446f5e557.jpg"],"type":0,"id":7984500,"ga_prefix":"031421","title":"一个优等生，捐掉去哈佛读书的钱，扔掉汽车，还烧了现金"},{"title":"怎么也没想到，我会被一棵树的故事感动","ga_prefix":"031420","images":["http://pic3.zhimg.com/4186d734b1964e2d89c2f807046d7986.jpg"],"multipic":true,"type":0,"id":8000624},{"images":["http://pic2.zhimg.com/a36b3bd921cdecc0d40e283028884c45.jpg"],"type":0,"id":8001119,"ga_prefix":"031419","title":"为什么玉米也能「see you tomorrow」？"},{"images":["http://pic4.zhimg.com/11d74f8ca2cd1bacc5c3e9b5d11a9af3.jpg"],"type":0,"id":8000575,"ga_prefix":"031418","title":"看了这些古代朝会，只想发「冷漠.jpg」「呵呵哒」"},{"images":["http://pic3.zhimg.com/c8320da45b685e6c6f8029a84cfb5332.jpg"],"type":0,"id":8000710,"ga_prefix":"031417","title":"得了抑郁症想自杀的人，本身会害怕自杀吗？"},{"title":"有过这次经历之后，我再也没办法正常看戏剧了","ga_prefix":"031416","images":["http://pic1.zhimg.com/5f33bfbcc9e0016bd671025fb4f54c08.jpg"],"multipic":true,"type":0,"id":7999855},{"images":["http://pic3.zhimg.com/8687bd493d3e5c22d30ff560e8a713b2.jpg"],"type":0,"id":7999419,"ga_prefix":"031415","title":"光记得  3.1415926 不够酷，我教你背 π 的 100 位"},{"images":["http://pic2.zhimg.com/f0ba843f9de27a61e08ce56e6a843df5.jpg"],"type":0,"id":7999402,"ga_prefix":"031414","title":"1 元纸币以后可能要消失了"},{"title":"绵密轻盈的日系蛋糕卷，超多细节教学","ga_prefix":"031413","images":["http://pic2.zhimg.com/54a57a27736d1bbf8205044bc13835a9.jpg"],"multipic":true,"type":0,"id":7999337},{"images":["http://pic3.zhimg.com/5513843427c515f0878afbfe0a138b6e.jpg"],"type":0,"id":7999476,"ga_prefix":"031412","title":"职人介绍所 · 第 8 期：错过了这期，装修房子会走很多弯路"},{"images":["http://pic4.zhimg.com/168da4f1a1f12241162f20233c00195b.jpg"],"type":0,"id":7999250,"ga_prefix":"031412","title":"听说过各种「数理天才」，却少有听说化学天才"},{"title":"人工智能在麻将领域能够战胜人类吗？","ga_prefix":"031411","images":["http://pic3.zhimg.com/16848f9018dc0315d2abbdac5d58bbea.jpg"],"multipic":true,"type":0,"id":7999095},{"images":["http://pic1.zhimg.com/83f20cbf3b7f1e45e79a8460cf7dd660.jpg"],"type":0,"id":7988710,"ga_prefix":"031410","title":"发生在美国小城的一场水危机事件，惊心动魄又引人深思"},{"images":["http://pic3.zhimg.com/ef18d5ceee989dc2bc3f1eec8ae90162.jpg"],"type":0,"id":7997761,"ga_prefix":"031409","title":"曾经地位很高，但因为科技进步被淘汰的职业"},{"images":["http://pic2.zhimg.com/23beccb6c7b6ef1b9825235f80edf4f1.jpg"],"type":0,"id":7998056,"ga_prefix":"031407","title":"校园广播台使用音乐需要付版权费吗？"},{"images":["http://pic4.zhimg.com/bb592b35e999607554c5b16d8dd1887f.jpg"],"type":0,"id":7997571,"ga_prefix":"031407","title":"这位刚刚去世的大师，是人工智能的开拓者"},{"images":["http://pic3.zhimg.com/a53778255b97830958f11013a156607a.jpg"],"type":0,"id":7998095,"ga_prefix":"031407","title":"读读日报 24 小时热门 · 挽救无数好莱坞电影海报"},{"images":["http://pic1.zhimg.com/36868bea344fd0b97c56e00123d05854.jpg"],"type":0,"id":7970234,"ga_prefix":"031406","title":"瞎扯 · 忽然脑残了一下"}]
     * top_stories : [{"image":"http://pic4.zhimg.com/1a8c3c46f7eda37a4e80d0e84c25e3a3.jpg","type":0,"id":7984500,"ga_prefix":"031421","title":"一个优等生，捐掉去哈佛读书的钱，扔掉汽车，还烧了现金"},{"image":"http://pic3.zhimg.com/2d63de3fed768795b5b36b6083d3f8be.jpg","type":0,"id":7999419,"ga_prefix":"031415","title":"光记得  3.1415926 不够酷，我教你背 π 的 100 位"},{"image":"http://pic3.zhimg.com/8937d34f99dde5e6cb5f30b383f919de.jpg","type":0,"id":7999095,"ga_prefix":"031411","title":"人工智能在麻将领域能够战胜人类吗？"},{"image":"http://pic2.zhimg.com/7bf777b923db5fc0efa223ae8855074d.jpg","type":0,"id":7999476,"ga_prefix":"031412","title":"职人介绍所 · 第 8 期：错过了这期，装修房子会走很多弯路"},{"image":"http://pic2.zhimg.com/ff9bcf8d9cde5ce9e4afc47fd75b7ccd.jpg","type":0,"id":7998095,"ga_prefix":"031407","title":"读读日报 24 小时热门 · 挽救无数好莱坞电影海报"}]
     */

    private String date;
    private List<StoriesEntity> stories;
    private List<TopStoriesEntity> top_stories;

    public void setDate(String date) {
        this.date = date;
    }

    public void setStories(List<StoriesEntity> stories) {
        this.stories = stories;
    }

    public void setTop_stories(List<TopStoriesEntity> top_stories) {
        this.top_stories = top_stories;
    }

    public String getDate() {
        return date;
    }

    public List<StoriesEntity> getStories() {
        return stories;
    }

    public List<TopStoriesEntity> getTop_stories() {
        return top_stories;
    }

    public static class StoriesEntity {
        /**
         * images : ["http://pic4.zhimg.com/6ce13e293fe2d36e6a9575b446f5e557.jpg"]
         * type : 0
         * id : 7984500
         * ga_prefix : 031421
         * title : 一个优等生，捐掉去哈佛读书的钱，扔掉汽车，还烧了现金
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public void setType(int type) {
            this.type = type;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public int getType() {
            return type;
        }

        public int getId() {
            return id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public List<String> getImages() {
            return images;
        }
    }

    public static class TopStoriesEntity {
        /**
         * image : http://pic4.zhimg.com/1a8c3c46f7eda37a4e80d0e84c25e3a3.jpg
         * type : 0
         * id : 7984500
         * ga_prefix : 031421
         * title : 一个优等生，捐掉去哈佛读书的钱，扔掉汽车，还烧了现金
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public void setImage(String image) {
            this.image = image;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public int getType() {
            return type;
        }

        public int getId() {
            return id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public String getTitle() {
            return title;
        }
    }
}
