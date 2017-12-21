package com.bwie.myapplication.client;

import com.bwie.myapplication.bean.Bean;
import com.bwie.myapplication.bean.Bean2;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ServiceApi {

    @GET("getProductCatagory?cid=2")
    Observable<Bean> getBean();

    @GET("product/getProducts")
    Observable<Bean2> getBean2(@Query("pscid") String pscid);
}