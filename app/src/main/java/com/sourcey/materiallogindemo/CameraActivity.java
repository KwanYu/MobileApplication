package com.sourcey.materiallogindemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class CameraActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* Log.d("run", "here ");*/
        setContentView(R.layout.activity_camera);
        /*Log.d("run", "come here ");*/
        if (null == savedInstanceState) {
            /*Log.d("here", "created");*/
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
        }
    }
}
