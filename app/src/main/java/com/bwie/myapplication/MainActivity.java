package com.bwie.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bwie.myapplication.adapter.Adapter;
import com.bwie.myapplication.bean.Bean;
import com.bwie.myapplication.presenter.Presenter;
import com.bwie.myapplication.view.Iview;

public class MainActivity extends AppCompatActivity implements Iview{

    private RecyclerView mRv;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Presenter presenter = new Presenter(this);
        presenter.getData();


    }

    @Override
        public void Show(Bean bean) {
            mRv = (RecyclerView) findViewById(R.id.rv);
            mRv.setLayoutManager(new LinearLayoutManager(this));
            adapter = new Adapter(this,bean.getData());
            mRv.setAdapter(adapter);
            adapter.setOnItemClickListener(new Adapter.onItemClickListener() {
                @Override
                public void onItemClickListener(Bean.DataBean dataBean) {
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("pscid",dataBean.getList().get(0).getPscid()+"");
                    startActivity(intent);
                }
            });
    }
}
