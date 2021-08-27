package com.qingteng.component;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.qingteng.qtlibs.utils.LogUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.d("TAG","111");

    }
}