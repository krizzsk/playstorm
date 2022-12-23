package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.a */
public final class C8379a implements C8381c {

    /* renamed from: a */
    final C8382d f20098a;

    /* renamed from: b */
    private BroadcastReceiver f20099b = new BroadcastReceiverStrategy$1(this);

    public C8379a(C8382d dVar) {
        this.f20098a = dVar;
    }

    /* renamed from: a */
    public final void mo56887a() {
        this.f20099b = null;
    }

    /* renamed from: a */
    public final void mo56888a(Context context) {
        try {
            context.registerReceiver(this.f20099b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo56889b(Context context) {
        try {
            context.unregisterReceiver(this.f20099b);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e) {
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e);
        }
    }

    /* renamed from: c */
    public final JSONObject mo56890c(Context context) {
        return new JSONObject();
    }
}
