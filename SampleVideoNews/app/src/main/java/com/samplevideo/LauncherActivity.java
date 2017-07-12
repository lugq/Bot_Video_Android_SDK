package com.samplevideo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import ai.botbrain.ttcloud.api.TtCloudManager;

/**
 * Description：
 * Creator: Created by peter.
 * Date: 17/6/29.
 */

public class LauncherActivity extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Button btn_ttc = (Button) findViewById(R.id.btn_ttc);
        Button btn_video = (Button) findViewById(R.id.btn_video);
        Button btn_search = (Button) findViewById(R.id.btn_search);

        btn_ttc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LauncherActivity.this, NewsActivity.class));
            }
        });

        btn_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LauncherActivity.this, VideoActivity.class));
            }
        });

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TtCloudManager.openSearchActivity(LauncherActivity.this);
            }
        });


    }

}
