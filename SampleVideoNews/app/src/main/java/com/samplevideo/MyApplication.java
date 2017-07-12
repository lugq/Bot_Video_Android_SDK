package com.samplevideo;

import android.app.Application;

import ai.botbrain.ttcloud.api.TtCloudManager;
import ai.botbrain.ttcloud.api.TtcClient;

/**
 * Description：
 * Creator: Created by peter.
 * Date: 17/4/28.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        TtcClient client = new TtcClient.Builder()
                .setDebug()
                .build();

        TtCloudManager.init(this, client);
    }
}
