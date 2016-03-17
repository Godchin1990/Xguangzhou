package com.github.xvnyata.xguangzhou.model;

import java.util.List;

/**
 * Created by xvnyata on 16-3-15.
 */
public class SingleNews {

    /**
     * body : 哈哈哈哈哈
     * image_source : 《荒野生存》
     * title : 一个优等生，捐掉去哈佛读书的钱，扔掉汽车，还烧了现金
     * image : http://pic4.zhimg.com/1a8c3c46f7eda37a4e80d0e84c25e3a3.jpg
     * share_url : http://daily.zhihu.com/story/7984500
     * ga_prefix : 031421
     * section : {"thumbnail":"http://pic4.zhimg.com/6ce13e293fe2d36e6a9575b446f5e557.jpg","id":28,"name":"放映机"}
     * type : 0
     * id : 7984500
     * css : ["http://news-at.zhihu.com/css/news_qa.auto.css?v=77778"]
     */

    private String body;
    private String image_source;
    private String title;
    private String image;
    private String share_url;
    private List<String> js;

    public List<String> getJs() {
        return js;
    }

    public void setJs(List<String> js) {
        this.js = js;
    }

    private String ga_prefix;
    private SectionEntity section;
    private int type;
    private int id;
    private List<String> css;

    public void setBody(String body) {
        this.body = body;
    }

    public void setImage_source(String image_source) {
        this.image_source = image_source;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public void setSection(SectionEntity section) {
        this.section = section;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCss(List<String> css) {
        this.css = css;
    }

    public String getBody() {
        return body;
    }

    public String getImage_source() {
        return image_source;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getShare_url() {
        return share_url;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public SectionEntity getSection() {
        return section;
    }

    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public List<String> getCss() {
        return css;
    }

    public static class SectionEntity {
        /**
         * thumbnail : http://pic4.zhimg.com/6ce13e293fe2d36e6a9575b446f5e557.jpg
         * id : 28
         * name : 放映机
         */

        private String thumbnail;
        private int id;
        private String name;

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
