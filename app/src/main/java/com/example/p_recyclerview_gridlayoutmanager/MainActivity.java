package com.example.p_recyclerview_gridlayoutmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Game> games;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        games = new ArrayList<>();
        games.add(new Game("王者榮耀","10000"));
        games.add(new Game("王者榮耀","10000"));
        games.add(new Game("王者榮耀","10000"));
        games.add(new Game("王者榮耀","10000"));
        games.add(new Game("王者榮耀","10000"));
        games.add(new Game("王者榮耀","10000"));
        games.add(new Game("王者榮耀","10000"));
        games.add(new Game("王者榮耀","10000"));
        games.add(new Game("王者榮耀","10000"));
        games.add(new Game("王者榮耀","10000"));

        BlanceRecyclerViewAdapter blanceRecyclerViewAdapter = new BlanceRecyclerViewAdapter(games,this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,4));
        recyclerView.setAdapter(blanceRecyclerViewAdapter);

    }
}
