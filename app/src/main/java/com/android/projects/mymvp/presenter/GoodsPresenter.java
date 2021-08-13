package com.android.projects.mymvp.presenter;

import android.util.Log;

import androidx.lifecycle.LifecycleOwner;

import com.android.projects.mymvp.bean.Goods;
import com.android.projects.mymvp.interfaces.OnLoadListener;
import com.android.projects.mymvp.model.GoodsModel;
import com.android.projects.mymvp.model.IGoodsModel;
import com.android.projects.mymvp.view.IGoodsView;

import java.util.List;

public class GoodsPresenter<T extends IGoodsView> extends BasePresenter{

    IGoodsModel iGoodsModel=new GoodsModel();

    /**
     * 执行业务逻辑
     */
    public void fetch(){
        if(IBaseView !=null && iGoodsModel!=null){
            iGoodsModel.loadGoodsData(new OnLoadListener() {
                @Override
                public void onComplete(List<Goods> goods) {
                    ((IGoodsView)IBaseView.get()).showGoodsView(goods);
                }

                @Override
                public void onError(String msg) {

                }
            });
        }
    }

    @Override
    void onCreateX(LifecycleOwner owner) {
        super.onCreateX(owner);
        Log.i("xxx","create");
    }

    @Override
    void onDestory(LifecycleOwner owner) {
        super.onDestory(owner);
        Log.i("xxx","destroy");
    }
}