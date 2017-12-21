package com.bwie.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import com.bwie.myapplication.adapter.Adapter2;
import com.bwie.myapplication.bean.Bean2;
import com.bwie.myapplication.presenter.presenter2;
import com.bwie.myapplication.view.Iview2;

public class Main2Activity extends AppCompatActivity implements Iview2 {

    private String pscid;
    private RecyclerView mRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        pscid = intent.getStringExtra("pscid");
        Log.i("Main2Activity++++", pscid);

        presenter2 presenter2 = new presenter2(this);
        presenter2.getData();

    }

    @Override
    public void Show(Bean2 bean2) {
        mRv = (RecyclerView) findViewById(R.id.rv);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        Adapter2 adapter2 = new Adapter2(this, bean2.getData());
        mRv.setAdapter(adapter2);
    }

    @Override
    public String pscid() {
        return pscid;
    }

}
