package com.hloong.mydemo;

import android.app.Application;

import com.hloong.mydemo.util.ACrash;

/**
 * Created by Administrator on 2016/6/27.
 */
public class App extends Application{


    @Override
    public void onCreate() {
        super.onCreate();
        ACrash.getInstance().setCustomCrashInfo(this);

    }
}
