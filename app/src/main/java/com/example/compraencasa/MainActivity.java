package com.example.compraencasa;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class MainActivity  extends AppCompatActivity {

    private FeatureCoverFlow coverFlow;
    private CoverFlowAdapter adapter;
    private ArrayList<Producto> games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coverFlow = (FeatureCoverFlow) findViewById(R.id.coverflow);

        settingDummyData();
        adapter = new CoverFlowAdapter(this, games);
        coverFlow.setAdapter(adapter);
        coverFlow.setOnScrollPositionListener(onScrollListener());
    }

    private FeatureCoverFlow.OnScrollPositionListener onScrollListener() {
        return new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                Log.v("MainActiivty", "position: " + position);
            }

            @Override
            public void onScrolling() {
                Log.i("MainActivity", "scrolling");
            }
        };
    }

    private void settingDummyData() {
        games = new ArrayList<>();
        games.add(new Producto(R.mipmap.mango, "Mango"));
        games.add(new Producto(R.mipmap.acelga, "Acelga"));
        games.add(new Producto(R.mipmap.manzanas, "Manzana"));
        games.add(new Producto(R.mipmap.pepino, "Pepino"));
        games.add(new Producto(R.mipmap.melon, "Melon"));
       /* games.add(new Producto(R.mipmap.left_4_dead_2, "Left 4 Dead 2"));
        games.add(new Producto(R.mipmap.starcraft, "StarCraft"));
        games.add(new Producto(R.mipmap.the_witcher_3, "The Witcher 3"));
        games.add(new Producto(R.mipmap.tomb_raider, "Tom raider 3"));
        games.add(new Producto(R.mipmap.need_for_speed_most_wanted, "Need for Speed Most Wanted"));*/
    }
}