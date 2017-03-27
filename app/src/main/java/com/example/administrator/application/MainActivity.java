package com.example.administrator.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
class  ApplicationTest extends Activity {
    private final static String TAG = "ApplicationTest";
    private EditText etContent;
    private Button btnNext;
    private TextView tvTitle;
    private MyApplication myApplication;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myApplication = (MyApplication) getApplication();
        myApplication.setFirstAct(this);
        etContent = (EditText) findViewById(R.id.content);
        btnNext = (Button) findViewById(R.id.next);
        tvTitle = (TextView) findViewById(R.id.title);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myApplication.setParam1(etContent.getText().toString());
                Intent intent = new Intent(ApplicationTest.this,Activity1.class);
                startActivity(intent);
            }
        });
        Log.v(TAG, "onCreate");}
public  void setTitle(String title){
tvTitle.setText(title);}
}






