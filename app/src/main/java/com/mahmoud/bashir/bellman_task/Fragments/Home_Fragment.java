package com.mahmoud.bashir.bellman_task.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mahmoud.bashir.bellman_task.Adapters.Ev_ents_adpt;
import com.mahmoud.bashir.bellman_task.Adapters.hot_spot_adpt;
import com.mahmoud.bashir.bellman_task.R;
import com.mahmoud.bashir.bellman_task.Retrofit.ApiInterface;
import com.mahmoud.bashir.bellman_task.Retrofit.RetrofitClient;
import com.mahmoud.bashir.bellman_task.pojo.data;
import com.mahmoud.bashir.bellman_task.pojo.inside_data.events;
import com.mahmoud.bashir.bellman_task.pojo.inside_hot_spots.categories;
import com.mahmoud.bashir.bellman_task.pojo.model;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class Home_Fragment extends Fragment {

    private RecyclerView Rec_hot_spots,Rec_Events;
    ApiInterface apiInterface;
    hot_spot_adpt adpt;
    Ev_ents_adpt ev_ents_adpt;
    categories hotspots_cat;
    List<categories> list;

    public Home_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home_, container, false);

        Rec_hot_spots=v.findViewById(R.id.Rec_hot_spots);
        Rec_Events=v.findViewById(R.id.Rec_events);


        Rec_hot_spots.setHasFixedSize(true);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        Rec_hot_spots.setLayoutManager(horizontalLayoutManager);

        Rec_Events.setHasFixedSize(true);
        LinearLayoutManager horizontalLayoutManagerEvents
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        Rec_Events.setLayoutManager(horizontalLayoutManagerEvents);

        list=new ArrayList<>();

        Retrofit retrofit= RetrofitClient.getInstance();
        apiInterface=retrofit.create(ApiInterface.class);

        Observable<model> getModel=apiInterface.getModel()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        Observer<model> observer=new Observer<model>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(model model) {
                data d=new data(model.getData().getAttractions(),model.getData().getEvents(),model.getData().getHot_spots());

              /*  for (int i=0;i<d.getHot_spots().size();i++){
                    hotspots_cat=new categories(d.getHot_spots().get(i).getCategories().get(i).getId(),
                            d.getHot_spots().get(i).getCategories().get(i).getName(),
                            d.getHot_spots().get(i).getCategories().get(i).getOrder(),
                            d.getHot_spots().get(i).getCategories().get(i).getAr_name());
                    list.add(hotspots_cat);
                }*/

                //Toast.makeText(getContext(), ""+d.getHot_spots(), Toast.LENGTH_SHORT).show();

                List<events> liste=model.getData().getEvents();
                adpt=new hot_spot_adpt(getContext(),model.getData().getHot_spots().get(4).getPhotos());
                ev_ents_adpt=new Ev_ents_adpt(getContext(),model.getData().getEvents().get(3).getPhotos());
                Rec_hot_spots.setAdapter(adpt);
                Rec_Events.setAdapter(ev_ents_adpt);

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };

        getModel.subscribe(observer);

        return v;
    }

}
