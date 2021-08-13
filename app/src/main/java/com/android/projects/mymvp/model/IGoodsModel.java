package com.android.projects.mymvp.model;

import com.android.projects.mymvp.interfaces.OnLoadListener;

public interface IGoodsModel {
    void loadGoodsData(OnLoadListener onLoadListener);
}