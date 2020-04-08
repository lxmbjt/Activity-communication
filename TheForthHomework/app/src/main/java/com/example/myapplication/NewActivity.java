package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        final EditText name=findViewById(R.id.editText);
        final EditText password=findViewById((R.id.editText2));
        Button bt=findViewById((R.id.button));
        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String uriString="用户名："+name.getText()+"\n"+"密码："+password.getText();
                Uri data=Uri.parse(uriString);
                Intent result=new Intent(null,data);
                //result.putExtra("密码",password.getText());
                setResult(RESULT_OK,result);
                finish();
            }
        });



    }

}
