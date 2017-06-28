package com.example.kh.myapplication;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private BroadcastReceiver broadcastReceiver;
    private Intent intentBroadcastReceiver, intentBroadcastReceiver2;
    private static final int RECEIVED_SMS =20 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        broadcastReceiver = new MyBroadCastReceiver();
        checkPermission();
        intentBroadcastReceiver = new Intent();
        intentBroadcastReceiver.setAction("com.br1");
        intentBroadcastReceiver.addCategory(Intent.CATEGORY_DEFAULT);
        intentBroadcastReceiver2 = new Intent();
        intentBroadcastReceiver2.setAction("com.br2");
        intentBroadcastReceiver2.addCategory(Intent.CATEGORY_DEFAULT);
    }

    @OnClick(R.id.btnBr1)
    public void btnBr1(){
        sendBroadcast(intentBroadcastReceiver);
        sendBroadcast(intentBroadcastReceiver2);

    }
    public void checkPermission(){
        int permissionCheck = ActivityCompat.checkSelfPermission(getApplicationContext(),
                Manifest.permission.RECEIVE_SMS);
        if(permissionCheck!= PackageManager.PERMISSION_GRANTED){

        }else{
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.RECEIVE_MMS},RECEIVED_SMS);
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case RECEIVED_SMS:
                if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){

                }else{

                }
                return;
        }
    }
}
