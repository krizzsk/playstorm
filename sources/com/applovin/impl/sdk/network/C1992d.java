package com.applovin.impl.sdk.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.network.d */
public class C1992d extends BroadcastReceiver {

    /* renamed from: a */
    private final List<C1993a> f3817a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.sdk.network.d$a */
    public interface C1993a {
        /* renamed from: a */
        void mo14378a();

        /* renamed from: b */
        void mo14379b();
    }

    public C1992d(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: a */
    private static boolean m4604a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Object obj = extras.get("networkInfo");
        if (obj instanceof NetworkInfo) {
            return ((NetworkInfo) obj).isConnected();
        }
        return false;
    }

    /* renamed from: a */
    public void mo14514a(C1993a aVar) {
        this.f3817a.add(aVar);
    }

    /* renamed from: b */
    public void mo14515b(C1993a aVar) {
        this.f3817a.remove(aVar);
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && !isInitialStickyBroadcast()) {
            ArrayList arrayList = new ArrayList(this.f3817a);
            boolean a = m4604a(intent);
            Iterator it = arrayList.iterator();
            if (a) {
                while (it.hasNext()) {
                    ((C1993a) it.next()).mo14378a();
                }
                return;
            }
            while (it.hasNext()) {
                ((C1993a) it.next()).mo14379b();
            }
        }
    }
}
