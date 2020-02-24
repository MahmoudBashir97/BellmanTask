package com.mahmoud.bashir.bellman_task.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.mahmoud.bashir.bellman_task.R;

public class CurveActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curvedlayout);

        CurvedBottomNavigationView c=findViewById(R.id.c);
        c.getMaxItemCount();
        //c.inflateMenu(R.menu.nav_menu);
    }
}
