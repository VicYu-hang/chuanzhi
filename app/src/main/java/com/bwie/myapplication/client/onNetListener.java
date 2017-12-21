package com.bwie.myapplication.client;

/**
 * Created by VICYU on 2017/12/21.
 */

public interface onNetListener<T> {

    public void onSuccess(T t);

    public void onFailuer(Exception e);

}
