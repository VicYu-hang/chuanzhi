package com.bwie.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bwie.myapplication.R;
import com.bwie.myapplication.bean.Bean2;

import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

            private Context context;
            private List<Bean2.DataBean> list;

            public Adapter2(Context context, List<Bean2.DataBean> list) {
                this.context = context;
                this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = View.inflate(context, R.layout.item2, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.mTv.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView mTv;
        ViewHolder(View view) {
            super(view);
            mTv = (TextView) view.findViewById(R.id.tv);
        }
    }
}