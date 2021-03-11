package com.example.activity_main;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class ToastMessage extends AppCompatActivity {


    private TextView button2text;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_message);
        button2text=(TextView)findViewById(R.id.button2text);
    }
    public void showToast(View v)  {
        char text;
        Toast.makeText(getApplicationContext(), "HI how are you",Toast.LENGTH_LONG).show();
    }

}