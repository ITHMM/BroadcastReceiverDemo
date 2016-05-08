package com.zcm.it.ipcall;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_ipnumber;
    Button btn_save;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_ipnumber = (EditText) findViewById(R.id.et_ipnumber);
        btn_save = (Button) findViewById(R.id.btn_save);
        sp = getSharedPreferences("config",0);
        et_ipnumber.setText(sp.getString("ipnumber",""));
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ipnumber = et_ipnumber.getText().toString().trim();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("ipnumber",ipnumber);
                editor.commit();
                Toast.makeText(MainActivity.this,"设置成功",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
