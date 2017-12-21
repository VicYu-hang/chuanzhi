package com.bwie.myapplication.model;

import com.bwie.myapplication.bean.Bean;
import com.bwie.myapplication.client.onNetListener;

/**
 * Created by VICYU on 2017/12/21.
 */

public interface Imodel {

    public void getData(onNetListener<Bean>onNetListener);

}
