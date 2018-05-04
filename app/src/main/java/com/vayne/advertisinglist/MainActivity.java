package com.vayne.advertisinglist;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.vayne.advertisinglist.adapter.RecyclerListViewAdapter;
import com.vayne.advertisinglist.adapter.decoration.ItemDecoration;
import com.vayne.advertisinglist.view.ScrollingImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个有创意的广告效果
 */
public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public RecyclerListViewAdapter adapter;
    public List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.activity_main_recycleview);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerListViewAdapter(MainActivity.this);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new ItemDecoration(MainActivity.this, LinearLayoutManager.VERTICAL, 2, Color.GRAY));
        recyclerView.addOnScrollListener(new ScrollingImageView.ScrollListener(layoutManager, R.id.layout_recycleview_item_scrollimageview, 7));
        adapter.setData(setData());

    }

    /**
     * 设置数据源
     *
     * @return
     */
    private List<String> setData() {

        if (list == null) {
            list = new ArrayList<String>();
        }

        for (int i = 0; i < 20; i++) {
            list.add("Title" + (i + 1));
        }

        return list;
    }


}
