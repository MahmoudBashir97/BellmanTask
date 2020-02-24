package com.mahmoud.bashir.bellman_task.pojo.inside_data;


import com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.categories;
import com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.city;
import com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.features;

import java.util.List;

public class events {
    int id;
    String name;
    String description;
    String short_description;
    String arabic_name;
    String arabic_short_description;
    String arabic_description;
    int city_id ;
    String address;
    String lat;
    String lng;
    String facebook;
    String twitter;
    String instagram;
    String website;
    int views;
    String start_date;
    String end_date;
    int price_per_day;
    int whole_price;
    int ticket_price;
    String video_preview;
    List<String> photos;
    com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.city city;
    List<categories> categories;
    List<features> features;
    List<String> offers;

    public events(int id, String name, String description, String short_description, String arabic_name, String arabic_short_description, String arabic_description, int city_id, String address, String lat, String lng, String facebook, String twitter, String instagram, String website, int views, String start_date, String end_date, int price_per_day, int whole_price, int ticket_price, String video_preview, List<String> photos, com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.city city, List<com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.categories> categories, List<com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.features> features, List<String> offers) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.short_description = short_description;
        this.arabic_name = arabic_name;
        this.arabic_short_description = arabic_short_description;
        this.arabic_description = arabic_description;
        this.city_id = city_id;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
        this.website = website;
        this.views = views;
        this.start_date = start_date;
        this.end_date = end_date;
        this.price_per_day = price_per_day;
        this.whole_price = whole_price;
        this.ticket_price = ticket_price;
        this.video_preview = video_preview;
        this.photos = photos;
        this.city = city;
        this.categories = categories;
        this.features = features;
        this.offers = offers;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getArabic_name() {
        return arabic_name;
    }

    public void setArabic_name(String arabic_name) {
        this.arabic_name = arabic_name;
    }

    public String getArabic_short_description() {
        return arabic_short_description;
    }

    public void setArabic_short_description(String arabic_short_description) {
        this.arabic_short_description = arabic_short_description;
    }

    public String getArabic_description() {
        return arabic_description;
    }

    public void setArabic_description(String arabic_description) {
        this.arabic_description = arabic_description;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getPrice_per_day() {
        return price_per_day;
    }

    public void setPrice_per_day(int price_per_day) {
        this.price_per_day = price_per_day;
    }

    public int getWhole_price() {
        return whole_price;
    }

    public void setWhole_price(int whole_price) {
        this.whole_price = whole_price;
    }

    public int getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(int ticket_price) {
        this.ticket_price = ticket_price;
    }

    public String getVideo_preview() {
        return video_preview;
    }

    public void setVideo_preview(String video_preview) {
        this.video_preview = video_preview;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.city getCity() {
        return city;
    }

    public void setCity(com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.city city) {
        this.city = city;
    }

    public List<com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.categories> getCategories() {
        return categories;
    }

    public void setCategories(List<com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.categories> categories) {
        this.categories = categories;
    }

    public List<com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.features> getFeatures() {
        return features;
    }

    public void setFeatures(List<com.mahmoud.bashir.bellman_task.pojo.inside_data.inside_events.features> features) {
        this.features = features;
    }

    public List<String> getOffers() {
        return offers;
    }

    public void setOffers(List<String> offers) {
        this.offers = offers;
    }
}
