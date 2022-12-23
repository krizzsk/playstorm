package com.p374my.target;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.my.target.c5 */
public class C9643c5 extends C9736h5 {
    public synchronized void collectData(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            removeAll();
            return;
        }
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        int intExtra3 = registerReceiver.getIntExtra("status", 1);
        if (intExtra >= 0 && intExtra2 > 0) {
            addParam("bl", String.valueOf((intExtra * 100) / intExtra2));
        }
        addParam("bs", String.valueOf(intExtra3));
    }
}
