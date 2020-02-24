package com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events;

public class categories {
    int id;
    String name;
    String ar_name;
    String icon_image_url;
    String cover_image_url;

    public categories(int id, String name, String ar_name, String icon_image_url, String cover_image_url) {
        this.id = id;
        this.name = name;
        this.ar_name = ar_name;
        this.icon_image_url = icon_image_url;
        this.cover_image_url = cover_image_url;
    }

    public categories() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAr_name() {
        return ar_name;
    }

    public void setAr_name(String ar_name) {
        this.ar_name = ar_name;
    }

    public String getIcon_image_url() {
        return icon_image_url;
    }

    public void setIcon_image_url(String icon_image_url) {
        this.icon_image_url = icon_image_url;
    }

    public String getCover_image_url() {
        return cover_image_url;
    }

    public void setCover_image_url(String cover_image_url) {
        this.cover_image_url = cover_image_url;
    }
}
