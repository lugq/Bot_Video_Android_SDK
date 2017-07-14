package com.samplevideo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import ai.botbrain.ttcloud.api.TtCloudManager;
import ai.botbrain.ttcloud.sdk.activity.TsdH5ReaderOnWvActivity;
import ai.botbrain.ttcloud.sdk.fragment.IndexFragment;

/**
 * Description：
 * Creator: Created by peter.
 * Date: 2017/7/14.
 */

public class NewsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        // 获取新闻的Fragment实例
        IndexFragment mNewsIndexFragment = TtCloudManager.getNewsFragment();

        // 网页启动App需要配置的scheme
        initSchema();

        if (!mNewsIndexFragment.isAdded()) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container, mNewsIndexFragment);
            fragmentTransaction.commit();
        }
    }

    private void initSchema() {
        Intent intent = getIntent();
        String action = intent.getAction();
        if (Intent.ACTION_VIEW.equals(action)) {
            Uri uri = intent.getData();
            if (uri != null) {
                String queryString = uri.getQuery();
                String url = "https://bkd.botbrain.ai" + uri.getPath() + "?" + queryString + "&platform=android&type=2";
                intent.setClass(this, TsdH5ReaderOnWvActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        }
    }
}
