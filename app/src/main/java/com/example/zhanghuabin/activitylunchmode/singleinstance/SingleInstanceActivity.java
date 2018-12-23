package com.example.zhanghuabin.activitylunchmode.singleinstance;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.zhanghuabin.activitylunchmode.BaseActivity;
import com.example.zhanghuabin.activitylunchmode.MainActivity;
import com.example.zhanghuabin.activitylunchmode.R;

/**
 * author: zhanghuabin
 * date: 2018/12/23 15:56
 * github: https://github.com/zhanghuabin-sh
 * email: 2908882095@qq.com
 */
public class SingleInstanceActivity extends BaseActivity implements View.OnClickListener{

    private Button backMain;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleins);
        backMain = findViewById(R.id.backmain_btn);
        backMain.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
