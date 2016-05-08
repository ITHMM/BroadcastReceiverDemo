package com.zcm.it.ipcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by ZCM on 2016/5/8.
 */
public class IPCallReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String resultData = getResultData();
        System.out.println("往外拨打电话了,号码是：" + resultData);
        SharedPreferences sp = context.getSharedPreferences("config", 0);
        String ipnumber = sp.getString("ipnumber", "");
        if (resultData.startsWith("0")) {
            setResultData(ipnumber + resultData);
            Log.i("ip","设置ip后号码为：" + getResultData());
        }
    }
}
