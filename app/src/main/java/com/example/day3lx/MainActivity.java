package com.example.day3lx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView photoRv;
    List<String> mDatas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        photoRv = (RecyclerView) findViewById(R.id.photo_rv);
//        设置布局管理者   LinearLayoutManger   GridLayoutManger   StaggerGridLayoutManger
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        photoRv.setLayoutManager(manager);
        //将数组变成集合对象
        mDatas = Arrays.asList(ImageUrls.imageurls);
//        数据源
        PhotoAdapter adapter = new PhotoAdapter(this, mDatas);
        photoRv.setAdapter(adapter);
    }
}
