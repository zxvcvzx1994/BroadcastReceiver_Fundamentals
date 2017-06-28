package com.example.kh.myapplication.BroadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by kh on 6/28/2017.
 */

public class MyBroadcastReceiver1 extends BroadcastReceiver {
    private static final String TAG = MyBroadcastReceiver1.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive: 1");
    }
}
