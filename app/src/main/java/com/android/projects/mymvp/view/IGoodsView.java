package com.android.projects.mymvp.view;


import com.android.projects.mymvp.bean.Goods;

import java.util.List;

/**
 * UI逻辑
 */
public interface IGoodsView extends IBaseView {
    //显示图片
    void showGoodsView(List<Goods> goods);

    //加载进度条
    //加载动画
}









