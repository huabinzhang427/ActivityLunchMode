package com.example.zhanghuabin.activitylunchmode.standard;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.zhanghuabin.activitylunchmode.BaseActivity;
import com.example.zhanghuabin.activitylunchmode.R;
import com.example.zhanghuabin.activitylunchmode.singletask.SingleTaskActivity;
import com.example.zhanghuabin.activitylunchmode.singletop.SingleTopActivity;

/**
 * author: zhanghuabin
 * date: 2018/12/23 12:11
 * github: https://github.com/zhanghuabin-sh
 * email: 2908882095@qq.com
 */
public class StandardActivity extends BaseActivity implements View.OnClickListener{

    private Button standardBtn, singletopBtn, singleTaskBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        standardBtn = findViewById(R.id.standard_btn);
        standardBtn.setOnClickListener(this);
        singletopBtn = findViewById(R.id.singletop_btn);
        singletopBtn.setOnClickListener(this);
        singleTaskBtn = findViewById(R.id.singletask_btn);
        singleTaskBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.standard_btn:
                startActivity(new Intent(this, StandardActivity.class));
                break;
            case R.id.singletop_btn:
                startActivity(new Intent(this, SingleTopActivity.class));
                break;
            case R.id.singletask_btn:
                startActivity(new Intent(this, SingleTaskActivity.class));
                break;
        }
    }
}
