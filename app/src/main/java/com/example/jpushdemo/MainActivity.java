package com.example.jpushdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JpushNotifictionUtil.customPushNotification(this,1,R.layout.custom_push_notification,R.drawable.jpush_notification_icon,R.drawable.jpush_notification_icon);
    }
}
