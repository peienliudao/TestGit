package com.example.administrator.testgit;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //修改文件之后的提交
        Log.i("SunChunYue--->", "AAA");
        ((TextView) findViewById(R.id.text)).setText("SunChunYue");
        //版本 2.0
        //版本 2.1
    }
}
