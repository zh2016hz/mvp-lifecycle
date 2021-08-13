package com.android.projects.mymvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.projects.mymvp.R;
import com.android.projects.mymvp.bean.Goods;

import java.util.ArrayList;
import java.util.List;

public class GoodAdapter extends RecyclerView.Adapter<GoodAdapter.GoodsHolder> {
    private Context mContext;
    private List<Goods> mData = new ArrayList<>();

    public GoodAdapter(Context context) {
        this.mContext = context;
    }


    @NonNull
    @Override
    public GoodsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
        return new GoodsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GoodsHolder holders, int position) {
        Goods g = mData.get(position);
        holders.iv_icon.setImageResource(g.icon);
        holders.tv_like.setText("喜欢程度:" + g.like);
        holders.tv_style.setText(g.style);
    }


    public void setData(List<Goods> data) {
        this.mData = data;

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class GoodsHolder extends RecyclerView.ViewHolder {
        ImageView iv_icon;
        TextView tv_like;
        TextView tv_style;

        public GoodsHolder(@NonNull View itemView) {
            super(itemView);

             iv_icon= itemView.findViewById(R.id.iv_icon);
             tv_like= itemView.findViewById(R.id.tv_like);
             tv_style= itemView.findViewById(R.id.tv_style);
        }
    }

}
