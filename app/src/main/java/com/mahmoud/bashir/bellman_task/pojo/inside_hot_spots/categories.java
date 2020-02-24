package com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots;

public class categories {
    int id;
    String name;
    int order;
    String ar_name;

    public categories(int id, String name, int order, String ar_name) {
        this.id = id;
        this.name = name;
        this.order = order;
        this.ar_name = ar_name;
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

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getAr_name() {
        return ar_name;
    }

    public void setAr_name(String ar_name) {
        this.ar_name = ar_name;
    }
}
