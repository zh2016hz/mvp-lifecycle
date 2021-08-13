package com.android.projects.mymvp.model;

import com.android.projects.mymvp.R;
import com.android.projects.mymvp.bean.Goods;
import com.android.projects.mymvp.interfaces.OnLoadListener;

import java.util.ArrayList;
import java.util.List;

public class GoodsModel implements  IGoodsModel {
    @Override
    public void loadGoodsData(OnLoadListener onLoadListener) {
        onLoadListener.onComplete(getData());
    }
    private List<Goods> getData() {
        ArrayList data = new ArrayList<>();
        //这里的数据来源于网络或数据库或其它地方
        data.add(new Goods(R.drawable.s1, "一星", "****"));
        data.add(new Goods(R.drawable.s2, "一星", "****"));
        data.add(new Goods(R.drawable.s3, "一星", "****"));
        data.add(new Goods(R.drawable.s4, "一星", "****"));
        data.add(new Goods(R.drawable.s5, "一星", "****"));
        data.add(new Goods(R.drawable.s6, "一星", "****"));
        data.add(new Goods(R.drawable.s7, "一星", "****"));
        data.add(new Goods(R.drawable.s8, "一星", "****"));
        data.add(new Goods(R.drawable.s9, "一星", "****"));

        return data;
    }
}
