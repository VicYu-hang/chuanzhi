package com.bwie.myapplication.model;


import com.bwie.myapplication.bean.Bean2;
import com.bwie.myapplication.client.onNetListener;

/**
 * Created by VICYU on 2017/12/21.
 */

public interface Imodel2 {

    public void getData(onNetListener<Bean2> onNetListener,String pscid);

}
