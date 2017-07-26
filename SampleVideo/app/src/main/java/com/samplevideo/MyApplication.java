package com.samplevideo;

import android.app.Application;

import ai.botbrain.ttcloud.api.TtCloudManager;

/**
 * Description：
 * Creator: Created by peter.
 * Date: 17/4/28.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TtCloudManager.init(this);
    }
}
