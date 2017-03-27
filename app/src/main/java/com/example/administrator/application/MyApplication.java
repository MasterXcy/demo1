package com.example.administrator.application;

import android.app.Application;
import android.util.Log;

/**
 * Created by Administrator on 2017/3/10.
 */
public class MyApplication extends Application{
    private  static final String TAG= "MyApplication";
    private String param1;
    private ApplicationTest firstAct;public  String getParam1(){
        return  param1;
    }
    public void setParam1(String param1){
        this.param1 = param1;
    }
    public ApplicationTest getFirstAct(){
        return  firstAct;
    }
    public void  setFirstAct(ApplicationTest firstAct){
        this.firstAct = firstAct;
    }
    @Override
    public  void  onCreate(){
        super.onCreate();
        Log.v(TAG,"onCreate");
    }}
