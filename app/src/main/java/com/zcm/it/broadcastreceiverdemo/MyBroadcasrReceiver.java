package com.zcm.it.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcasrReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
//        Toast.makeText(context,"sd卡被拔出，安装在sd卡上的应用程序将不可用！",Toast.LENGTH_LONG).show();
//        Toast.makeText(context, "系统正在往外拨打电话...", Toast.LENGTH_SHORT).show();
        Toast.makeText(context, "桌面壁纸被改变了...放首歌报个警", Toast.LENGTH_LONG).show();
//        new MainActivity().playAudio("sd/测试SD卡内存/123.mp3");
    }

}
