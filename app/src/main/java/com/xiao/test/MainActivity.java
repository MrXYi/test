package com.xiao.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试提交版本1
        //测试提交版本2
        //测试提交版本3
    }

    private void test() {
        Log.i("daying", "打印方法1");
    }

    private void test2() {

    }
}
