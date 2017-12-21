package com.bwie.myapplication.model;

import com.bwie.myapplication.bean.Bean;
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

public class Model implements Imodel{
    @Override
    public void getData(final onNetListener<Bean> onNetListener) {

        ServiceApi serviceApi = RetrofitHelper.getServiceApi();
        Observable<Bean> bean = serviceApi.getBean();
        bean.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Bean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Bean bean) {
                        onNetListener.onSuccess(bean);
                    }
                });
    }
}
