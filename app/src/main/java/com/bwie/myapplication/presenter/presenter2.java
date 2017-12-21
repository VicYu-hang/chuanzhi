package com.bwie.myapplication.presenter;

import com.bwie.myapplication.bean.Bean2;
import com.bwie.myapplication.client.onNetListener;
import com.bwie.myapplication.model.Imodel2;
import com.bwie.myapplication.model.Model2;
import com.bwie.myapplication.view.Iview2;

/**
 * Created by VICYU on 2017/12/21.
 */

public class presenter2 {

    private Imodel2 imodel2;
    private Iview2 iview2;

    public presenter2(Iview2 iview2) {
        this.iview2 = iview2;
        imodel2=new Model2();
    }
    public void getData(){
        imodel2.getData(new onNetListener<Bean2>() {
            @Override
            public void onSuccess(Bean2 bean2) {
                iview2.Show(bean2);
            }

            @Override
            public void onFailuer(Exception e) {

            }
        },iview2.pscid());
    }
}
