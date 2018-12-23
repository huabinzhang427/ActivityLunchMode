package com.example.zhanghuabin.activitylunchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zhanghuabin.activitylunchmode.singletask.SingleTaskActivity;
import com.example.zhanghuabin.activitylunchmode.singletop.SingleTopActivity;
import com.example.zhanghuabin.activitylunchmode.standard.StandardActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    private Button standardBtn, singletopBtn, singletaskBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        standardBtn = findViewById(R.id.standard_btn);
        standardBtn.setOnClickListener(this);
        singletopBtn = findViewById(R.id.singletop_btn);
        singletopBtn.setOnClickListener(this);
        singletaskBtn = findViewById(R.id.singletask_btn);
        singletaskBtn.setOnClickListener(this);
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
