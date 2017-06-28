package com.example.kh.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by kh on 6/28/2017.
 */

public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

            Toast.makeText(context, "was triggered ", Toast.LENGTH_SHORT).show();


    }


}
