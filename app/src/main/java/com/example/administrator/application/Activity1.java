package com.example.administrator.application;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Activity1 extends Activity {
    private TextView tvContent;
    private EditText etContent;
    private Button btnNext;
    private TextView tvTitle;
    private MyApplication myApplication;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        myApplication = (MyApplication)getApplication();
        etContent = (EditText)findViewById(R.id.content);
        btnNext = (Button)findViewById(R.id.next);
        tvTitle = (TextView)findViewById(R.id.title);
        tvContent = (TextView)findViewById(R.id.content);
    MyApplication myApplication = (MyApplication)getApplication();
    tvContent.setText(myApplication.getParam1());
        myApplication.getFirstAct().setTitle("在其他Activity中设置");
    }
}


