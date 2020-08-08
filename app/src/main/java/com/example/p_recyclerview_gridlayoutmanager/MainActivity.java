package com.example.p_recyclerview_gridlayoutmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Game> games;
    private Button btnAdd;
    private double a ;
    private double b ;
    private double sum ;
    private double sumValue;
    private boolean isAdd = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        games = new ArrayList<>();
        games.add(new Game("王者榮耀", 12));
        games.add(new Game("王者榮耀", 11));
        games.add(new Game("王者榮耀", 15));
        games.add(new Game("王者榮耀", 10));
        games.add(new Game("王者榮耀", 6));
        games.add(new Game("王者榮耀", 15));
        games.add(new Game("王者榮耀", 11));
        games.add(new Game("王者榮耀", 25));

//        for (int i = 0; i <= 6; i++) {
//            games.add(new Game("王者榮耀", 10));
//        }

        for(int i=0; i<games.size(); i++){

//            sum  +=   Arith.add(games.get(i).value,games.get(i+1).value);
//            sumValue = sum /2;

            sum = sum + games.get(i).value;

            Log.v("hank","sum:"  +sum );
//            if(isAdd){
//                a = games.get(i).value;
//                b = games.get(i+1).value;
//                sum += a + b;
//                Log.v("hank","sum:"  +sum );
//                isAdd = false;
//            }else{
//                isAdd = true;
//            }
//
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
                    return 2;
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

    private void init() {
        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum =  Arith.add(a,b);
              Log.v("hank","sum:" + sum);
            }
        });
    }
}
