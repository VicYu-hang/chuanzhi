package com.bwie.myapplication.model;

import com.bwie.myapplication.bean.Bean2;
import com.bwie.myapplication.client.RetrofitHelper;
import com.bwie.myapplication.client.ServiceApi;
import com.bwie.myapplication.client.onNetListener;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by VICYU on 2017/12/21.
 */

public class Model2 implements Imodel2{


    @Override
    public void getData(final onNetListener<Bean2> onNetListener, String pscid) {


        ServiceApi serviceApi = RetrofitHelper.getServiceApi();
        Observable<Bean2> bean2 = serviceApi.getBean2("1");
        bean2.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Bean2>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Bean2 bean2) {
                        onNetListener.onSuccess(bean2);
                    }
                });

    }
}
