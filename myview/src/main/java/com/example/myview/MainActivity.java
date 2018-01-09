package com.example.myview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取布局文件中的Linearlayout容器
        LinearLayout root = (LinearLayout) findViewById(R.id.linear);
        //创建DrawView组件
        DrawView drawView = new DrawView(this);
        //设置自定义组件的最小宽度，高度
        drawView.setMinimumWidth(300);
        drawView.setMinimumHeight(500);
        root.addView(drawView);
    }
}
