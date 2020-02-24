package com.mahmoud.bashir.bellman_task.pojo;

import com.mahmoud.bashir.bellman_task.pojo.inside_data.attractions;
import com.mahmoud.bashir.bellman_task.pojo.inside_data.events;
import com.mahmoud.bashir.bellman_task.pojo.inside_data.hot_spots;

import java.util.List;

public class data {
    List<attractions> attractions;
    List<events> events;
    List<hot_spots> hot_spots;

    public data(List<com.mahmoud.bashir.bellman_task.pojo.inside_data.attractions> attractions, List<com.mahmoud.bashir.bellman_task.pojo.inside_data.events> events, List<com.mahmoud.bashir.bellman_task.pojo.inside_data.hot_spots> hot_spots) {
        this.attractions = attractions;
        this.events = events;
        this.hot_spots = hot_spots;
    }

    public data() {
    }

    public List<com.mahmoud.bashir.bellman_task.pojo.inside_data.attractions> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<com.mahmoud.bashir.bellman_task.pojo.inside_data.attractions> attractions) {
        this.attractions = attractions;
    }

    public List<com.mahmoud.bashir.bellman_task.pojo.inside_data.events> getEvents() {
        return events;
    }

    public void setEvents(List<com.mahmoud.bashir.bellman_task.pojo.inside_data.events> events) {
        this.events = events;
    }

    public List<com.mahmoud.bashir.bellman_task.pojo.inside_data.hot_spots> getHot_spots() {
        return hot_spots;
    }

    public void setHot_spots(List<com.mahmoud.bashir.bellman_task.pojo.inside_data.hot_spots> hot_spots) {
        this.hot_spots = hot_spots;
    }
}
