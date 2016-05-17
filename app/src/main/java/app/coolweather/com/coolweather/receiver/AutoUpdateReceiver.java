package app.coolweather.com.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.io.BufferedReader;

import app.coolweather.com.coolweather.service.AutoUpdateService;

/**
 * Created by Ghost on 2016/5/17.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
