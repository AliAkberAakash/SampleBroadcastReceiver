package com.example.aliakber.samplebroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastreceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        //show a toast when connected to charger
        Toast.makeText(context, "Charger Connected", Toast.LENGTH_SHORT).show();

    }

}

