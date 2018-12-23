package com.example.zhanghuabin.activitylunchmode;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * author: zhanghuabin
 * date: 2018/12/23 11:56
 * github: https://github.com/zhanghuabin-sh
 * email: 2908882095@qq.com
 * 方便打印的基础Activity
 */
public class BaseActivity extends AppCompatActivity {

    String TAG = "info";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "**********onCreate()方法**********");
        Log.i(TAG, "onCreate: " + getClass().getSimpleName() +
                " TaskId: " + getTaskId() + " hashCode: " + hashCode());
        dumpTaskAffinity();
    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG, "**********onNewIntent()方法**********");
        Log.i(TAG, "onNewIntent: " + getClass().getSimpleName() + " TaskId: " + getTaskId() +
        " hashCode: " + this.hashCode());
        dumpTaskAffinity();
    }

    protected void dumpTaskAffinity() {
        try {
            ActivityInfo info = this.getPackageManager().getActivityInfo(getComponentName(),
                    PackageManager.GET_META_DATA);
            Log.i(TAG, "taskAffinity: " + info.taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }


}
