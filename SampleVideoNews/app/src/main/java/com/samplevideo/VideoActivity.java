package com.samplevideo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import ai.botbrain.ttcloud.api.TtCloudManager;
import ai.botbrain.ttcloud.sdk.fragment.IndexFragment;

public class VideoActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TtCloudManager.hideActionBar(true);
        openVideoFragment(null);
    }

    public void openVideoActivity(View view) {
        /*
        Intent intent = new Intent();
        //intent.setClass(MainActivity.this, IndexActivity.class);
        intent.putExtra("title", "头条新闻");
        startActivity(intent);
        */
    }

    public void openVideoFragment(View view) {
        IndexFragment mFragment = TtCloudManager.getVideoFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, mFragment);
        fragmentTransaction.commit();
    }

}
