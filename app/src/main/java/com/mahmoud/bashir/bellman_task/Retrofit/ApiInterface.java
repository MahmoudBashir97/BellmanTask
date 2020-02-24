package com.mahmoud.bashir.bellman_task.Retrofit;

import com.mahmoud.bashir.bellman_task.pojo.model;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiInterface {

     @GET("api/home/")
     Observable<model> getModel();

}
