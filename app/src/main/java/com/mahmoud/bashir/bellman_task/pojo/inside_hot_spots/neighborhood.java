package com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots;

public class neighborhood {
    int id;
    String name;
    String arabic_name;
    String lat;
    String lng;
    String zoom;
    int city_id;
    String created_at;
    String updated_at;

    public neighborhood(int id, String name, String arabic_name, String lat, String lng, String zoom, int city_id, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.arabic_name = arabic_name;
        this.lat = lat;
        this.lng = lng;
        this.zoom = zoom;
        this.city_id = city_id;
        this.created_at = created_at;
        this.updated_at = updated_at;

    }

    public neighborhood() {
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

    public String getArabic_name() {
        return arabic_name;
    }

    public void setArabic_name(String arabic_name) {
        this.arabic_name = arabic_name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getZoom() {
        return zoom;
    }

    public void setZoom(String zoom) {
        this.zoom = zoom;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
