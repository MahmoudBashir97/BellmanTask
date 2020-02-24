package com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots;

public class features {
    int id;
    String name;
    String arabic_name;

    public features(int id, String name, String arabic_name) {
        this.id = id;
        this.name = name;
        this.arabic_name = arabic_name;
    }

    public features() {
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
}
