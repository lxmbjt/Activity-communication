package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private static final int SUBJECTIVITY1 =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.bt1);
        /*点击登录按钮跳转至NewActivity*/
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,NewActivity.class);
//                startActivity(intent);
                //获取Activity返回值
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivityForResult(intent, SUBJECTIVITY1);
            }
        });

    }
    //在父Activity中获取返回值
    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SUBJECTIVITY1) {
            if (resultCode == Activity.RESULT_OK) {
                Uri uriData = data.getData();
                TextView show=findViewById(R.id.showInfo);
                show.setText(null);
                if(uriData != null){
                    show.setText(uriData.toString());
                }

            }
            }
        }
    }

