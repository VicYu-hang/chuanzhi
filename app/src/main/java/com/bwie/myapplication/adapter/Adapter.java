package com.bwie.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bwie.myapplication.R;
import com.bwie.myapplication.bean.Bean;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

            private Context context;
            private List<Bean.DataBean> list;
            private onItemClickListener itemClickListener;

            public Adapter(Context context, List<Bean.DataBean> list) {
                this.context = context;
                this.list = list;
    }

    public void setOnItemClickListener(onItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public interface onItemClickListener{
        void onItemClickListener(Bean.DataBean dataBean);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = View.inflate(context, R.layout.item, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.mTv.setText(list.get(position).getList().get(position).getName());
        final Bean.DataBean dataBean = list.get(position);
        viewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemClickListener.onItemClickListener(dataBean);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView mTv;
        View view;
        ViewHolder(View view) {
            super(view);
            this.view = view;
            mTv = (TextView) view.findViewById(R.id.tv);
        }
    }
}