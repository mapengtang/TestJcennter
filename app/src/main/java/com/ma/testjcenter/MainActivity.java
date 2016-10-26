package com.ma.testjcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ma.localrepo.TestClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        //本地没有仓库的内容则会报错
        TextView tv = (TextView) findViewById(R.id.show_msg);
        tv.setText(TestClass.returnStr());
    }
}
