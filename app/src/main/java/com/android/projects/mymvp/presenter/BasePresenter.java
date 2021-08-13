package com.android.projects.mymvp.presenter;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

import com.android.projects.mymvp.view.IBaseView;

import java.lang.ref.WeakReference;

public class BasePresenter<T extends IBaseView> implements LifecycleObserver {
    WeakReference<T> IBaseView;
    /**
     * 绑定view
     */
    public void attachView(T view){
        IBaseView=new WeakReference<>(view);
    }
    /**
     * 解绑
     */
    public void detachView(){
        if(IBaseView!=null){
            IBaseView.clear();
            IBaseView=null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreateX(LifecycleOwner owner) {

    }


    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStartX(LifecycleOwner owner) {
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop(LifecycleOwner owner) {
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume(LifecycleOwner owner) {
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause(LifecycleOwner owner) {
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestory(LifecycleOwner owner) {
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    void onAny(LifecycleOwner owner) {
    }
}