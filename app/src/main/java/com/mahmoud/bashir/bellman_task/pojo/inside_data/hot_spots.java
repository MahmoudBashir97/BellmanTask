package com.mahmoud.bashir.bellman_task.pojo.inside_data;

import com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.categories;
import com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.city_id;
import com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.cuisineTypes;
import com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.features;
import com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.neighborhood;

import java.util.List;

public class hot_spots {
    int id;
    String name;
    String description;
    String short_description;
    String price_of_two;
    String arabic_name;
    String arabic_short_description;
    String arabic_description;
    city_id city_id;
    neighborhood neighborhood;
    String address;
    String lat;
    String lng;
    String facebook;
    String twitter;
    String instagram;
    String website;
    int views;
    String facebook_id;
    String facebook_image;
    String phone;
    List<String> photos;
    String profile_photo;
    List<categories> categories;
    List<features> features;
    List<cuisineTypes> cuisineTypes;
    List<String> offers;
    List<String> external_rating;
    String video;
    List<String> menus;

    public hot_spots(int id, String name, String description, String short_description, String price_of_two, String arabic_name, String arabic_short_description, String arabic_description, com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.city_id city_id, com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.neighborhood neighborhood, String address, String lat, String lng, String facebook, String twitter, String instagram, String website, int views, String facebook_id, String facebook_image, String phone, List<String> photos, String profile_photo, List<com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.categories> categories, List<com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.features> features, List<com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.cuisineTypes> cuisineTypes, List<String> offers, List<String> external_rating, String video, List<String> menus) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.short_description = short_description;
        this.price_of_two = price_of_two;
        this.arabic_name = arabic_name;
        this.arabic_short_description = arabic_short_description;
        this.arabic_description = arabic_description;
        this.city_id = city_id;
        this.neighborhood = neighborhood;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
        this.website = website;
        this.views = views;
        this.facebook_id = facebook_id;
        this.facebook_image = facebook_image;
        this.phone = phone;
        this.photos = photos;
        this.profile_photo = profile_photo;
        this.categories = categories;
        this.features = features;
        this.cuisineTypes = cuisineTypes;
        this.offers = offers;
        this.external_rating = external_rating;
        this.video = video;
        this.menus = menus;
    }

    public hot_spots() {
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

    public String getPrice_of_two() {
        return price_of_two;
    }

    public void setPrice_of_two(String price_of_two) {
        this.price_of_two = price_of_two;
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

    public com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.city_id getCity_id() {
        return city_id;
    }

    public void setCity_id(com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.city_id city_id) {
        this.city_id = city_id;
    }

    public com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.neighborhood neighborhood) {
        this.neighborhood = neighborhood;
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

    public String getFacebook_id() {
        return facebook_id;
    }

    public void setFacebook_id(String facebook_id) {
        this.facebook_id = facebook_id;
    }

    public String getFacebook_image() {
        return facebook_image;
    }

    public void setFacebook_image(String facebook_image) {
        this.facebook_image = facebook_image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public String getProfile_photo() {
        return profile_photo;
    }

    public void setProfile_photo(String profile_photo) {
        this.profile_photo = profile_photo;
    }

    public List<com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.categories> getCategories() {
        return categories;
    }

    public void setCategories(List<com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.categories> categories) {
        this.categories = categories;
    }

    public List<com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.features> getFeatures() {
        return features;
    }

    public void setFeatures(List<com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.features> features) {
        this.features = features;
    }

    public List<com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.cuisineTypes> getCuisineTypes() {
        return cuisineTypes;
    }

    public void setCuisineTypes(List<com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.cuisineTypes> cuisineTypes) {
        this.cuisineTypes = cuisineTypes;
    }

    public List<String> getOffers() {
        return offers;
    }

    public void setOffers(List<String> offers) {
        this.offers = offers;
    }

    public List<String> getExternal_rating() {
        return external_rating;
    }

    public void setExternal_rating(List<String> external_rating) {
        this.external_rating = external_rating;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<String> getMenus() {
        return menus;
    }

    public void setMenus(List<String> menus) {
        this.menus = menus;
    }
}
