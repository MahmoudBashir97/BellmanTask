package com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots;

public class city {
    int id;
    String name;
    String lat;
    String lng;
    String zoom;

    public city(int id, String name, String lat, String lng, String zoom) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.zoom = zoom;
    }

    public city() {
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
}
