package com.example.p_recyclerview_gridlayoutmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

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

        for (int i = 0; i <= 100; i++) {
            games.add(new Game("王者榮耀", "10000"));
        }


        BlanceRecyclerViewAdapter blanceRecyclerViewAdapter = new BlanceRecyclerViewAdapter(games, this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                // 显示的列数 = spanCount / spanSize ;
                if (position % 17 == 0 && position != 17 && position != 34 && position != 51
                        && position != 68 && position != 85) {
                    //SpanSize 返回4 代表该行只显示1列    列数 = 4/4 =1
                    Log.v("hank", "position4:" + position + "%:" + position % 1);
                    return 4;
                } else {
                    //SpanSize 返回1代表该行显示4列    列数 = 4/1 =4
                    Log.v("hank", "position:" + position);
                    return 1;
                }
            }
        });
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(blanceRecyclerViewAdapter);

    }
}
