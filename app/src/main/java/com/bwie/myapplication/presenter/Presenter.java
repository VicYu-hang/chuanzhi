package com.bwie.myapplication.presenter;

import com.bwie.myapplication.bean.Bean;
import com.bwie.myapplication.client.onNetListener;
import com.bwie.myapplication.model.Imodel;
import com.bwie.myapplication.model.Model;
import com.bwie.myapplication.view.Iview;

/**
 * Created by VICYU on 2017/12/21.
 */

public class Presenter {

    private Imodel imodel;
    private Iview iview;

    public Presenter(Iview iview) {
        this.iview = iview;
        imodel=new Model();
    }
    public void getData(){
        imodel.getData(new onNetListener<Bean>() {
            @Override
            public void onSuccess(Bean bean) {
                iview.Show(bean);
            }

            @Override
            public void onFailuer(Exception e) {

            }
        });
    }

}
