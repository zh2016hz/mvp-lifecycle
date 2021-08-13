package com.android.projects.mymvp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.projects.mymvp.adapter.GoodAdapter;
import com.android.projects.mymvp.bean.Goods;
import com.android.projects.mymvp.presenter.GoodsPresenter;
import com.android.projects.mymvp.view.BaseActivity;
import com.android.projects.mymvp.view.IBaseView;
import com.android.projects.mymvp.view.IGoodsView;

import java.util.List;

public class MainActivity extends BaseActivity<GoodsPresenter, IGoodsView>  implements IGoodsView {

    private RecyclerView listView;
    private GoodAdapter goodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        listView.setLayoutManager(new LinearLayoutManager(this));
        goodAdapter = new GoodAdapter(this);
        listView.setAdapter(goodAdapter);
        presenter.fetch();
    }

    @Override
    protected GoodsPresenter createPresenter() {
        return new GoodsPresenter();
    }

    @Override
    public void showErrorMessage(String msg) {

    }

    @Override
    public void showGoodsView(List<Goods> goods) {
        goodAdapter.setData(goods);
    }

    @Override
    protected void init() {
        super.init();
        getLifecycle().addObserver(presenter);
    }
}