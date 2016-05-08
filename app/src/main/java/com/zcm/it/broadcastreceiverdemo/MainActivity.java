package com.zcm.it.broadcastreceiverdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.EditText;

/**
 * Created by ZCM on 2016/5/8.
 */
public class MainActivity extends Activity {
    /**
     * 声明输入框控件
     */
    EditText et_path;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_path = (EditText) findViewById(R.id.path);
        String path = Environment.getExternalStorageDirectory() + "/测试SD卡内存/123.mp3";
        et_path.setText(path);
        playAudio(path);
    }

    /**
     * 调用系统音乐播放器
     * @param audioPath 音乐文件的路径
     */
    void playAudio(String audioPath){
        Intent intent = new Intent();
        intent.setAction(android.content.Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse(audioPath), "audio/mp3");
//        intent.setComponent(new ComponentName("com.android.music","com.android.music.MediaPlaybackActivity"));
        startActivity(intent);
    }

}
