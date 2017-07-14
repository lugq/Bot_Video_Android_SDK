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
        setContentView(R.layout.activity_video);
        TtCloudManager.hideActionBar(true);
        openVideoFragment(null);
    }

    public void openVideoFragment(View view) {
        IndexFragment mFragment = new IndexFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, mFragment);
        fragmentTransaction.commit();
    }

}
