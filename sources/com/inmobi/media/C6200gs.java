package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* renamed from: com.inmobi.media.gs */
/* compiled from: DebugBroadcastManager */
public class C6200gs {

    /* renamed from: a */
    private static final String f15687a = C6200gs.class.getName();

    /* renamed from: com.inmobi.media.gs$a */
    /* compiled from: DebugBroadcastManager */
    public enum C6201a {
        NETWORK_REQUEST_RESPONSE,
        PRE_INIT_INSERTED,
        APP_FOCUS_CHANGE,
        JAVASCRIPT_CALL
    }

    /* renamed from: a */
    public static void m18446a(Intent intent) {
        intent.getAction();
        Context c = C6227ho.m18551c();
        if (c != null) {
            LocalBroadcastManager.getInstance(c).sendBroadcast(intent);
        }
    }
}
