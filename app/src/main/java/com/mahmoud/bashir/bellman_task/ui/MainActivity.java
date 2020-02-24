package com.mahmoud.bashir.bellman_task.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationMenu;
import com.mahmoud.bashir.bellman_task.Fragments.Achievements_Fragment;
import com.mahmoud.bashir.bellman_task.Fragments.Home_Fragment;
import com.mahmoud.bashir.bellman_task.Fragments.Profile_Fragment;
import com.mahmoud.bashir.bellman_task.Fragments.Search_Fragment;
import com.mahmoud.bashir.bellman_task.R;
import com.mahmoud.bashir.bellman_task.Retrofit.ApiInterface;
import com.mahmoud.bashir.bellman_task.Retrofit.RetrofitClient;
import com.mahmoud.bashir.bellman_task.pojo.data;
import com.mahmoud.bashir.bellman_task.pojo.model;
import com.sdsmdg.harjot.vectormaster.VectorMasterView;
import com.sdsmdg.harjot.vectormaster.models.PathModel;

import io.github.yavski.fabspeeddial.FabSpeedDial;
import io.github.yavski.fabspeeddial.SimpleMenuListenerAdapter;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    private Fragment frag;
    private BottomNavigationView mainnav;
    FrameLayout mainframe;

    RecyclerView recyclerView;
    ApiInterface apiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curvedlayout);

        //init view
        mainframe=(FrameLayout) findViewById(R.id.frame);
        CurvedBottomNavigationView c=findViewById(R.id.c);
        c.getMaxItemCount();

        c.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){

                    case R.id.home:
                        frag=new Home_Fragment();
                        setFragment(frag);
                        return true;
                    case R.id.search:
                        frag=new Search_Fragment();
                        setFragment(frag);
                        return true;
                    case R.id.achievement:
                        frag=new Achievements_Fragment();
                        setFragment(frag);
                        return true;
                    case R.id.acc_ount:
                        frag=new Profile_Fragment();
                        setFragment(frag);

                }

                return false;
            }
        });
        c.setSelectedItemId(R.id.home);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.home:
                Toast.makeText(this, "home as u here!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                Toast.makeText(this, "search as u here!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.achievement:
                Toast.makeText(this, "achievement as u here!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.acc_ount:
                Toast.makeText(this, "account as u here!", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }


    private void setFragment(Fragment frag) {
        FragmentManager Fragmang=getSupportFragmentManager();
        FragmentTransaction Fragtr=Fragmang.beginTransaction();
        Fragtr.replace(R.id.frame,frag);
        Fragtr.commit();


    }


}
