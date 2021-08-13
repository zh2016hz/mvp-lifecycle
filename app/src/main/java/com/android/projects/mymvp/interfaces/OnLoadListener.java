package com.android.projects.mymvp.interfaces;

import com.android.projects.mymvp.bean.Goods;

import java.util.List;

public interface OnLoadListener {
    void onComplete(List<Goods> goods);

    void onError(String msg);
}