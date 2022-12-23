package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ironsource.p200d.C6392a;
import org.json.JSONObject;

class BroadcastReceiverStrategy$1 extends BroadcastReceiver {

    /* renamed from: a */
    private /* synthetic */ C8379a f20097a;

    BroadcastReceiverStrategy$1(C8379a aVar) {
        this.f20097a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        String a = C6392a.m19175a(context);
        if (a.equals("none")) {
            this.f20097a.f20098a.mo56634a();
            return;
        }
        C8382d dVar = this.f20097a.f20098a;
        new JSONObject();
        dVar.mo56635a(a);
    }
}
