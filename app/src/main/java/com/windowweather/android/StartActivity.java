package com.windowweather.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);   //隐藏状态栏
        //getSupportActionBar().hide();   //隐藏标题栏
        setContentView(R.layout.activity_start);
        Thread myThread=new Thread() {      //创建子线程
            @Override
            public void run() {
                try {
                    sleep(2000);    //程序休眠2秒
                    Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}