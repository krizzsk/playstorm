package com.fyber.inneractive.sdk.bidder;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5349k0;

/* renamed from: com.fyber.inneractive.sdk.bidder.b */
public class C4228b extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ C4209a f10437a;

    public C4228b(C4209a aVar) {
        this.f10437a = aVar;
    }

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C5349k0 k0Var = C5349k0.UNKNOWN;
        if (networkCapabilities.hasTransport(3)) {
            k0Var = C5349k0.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            k0Var = C5348k.m16744i() == 13 ? C5349k0.MOBILE_4G : C5349k0.MOBILE_3G;
        } else if (networkCapabilities.hasTransport(1)) {
            k0Var = C5349k0.WIFI;
        }
        if (!TextUtils.equals(this.f10437a.f10392c.f10467r, k0Var.f14215a)) {
            C4209a aVar = this.f10437a;
            aVar.f10392c.f10467r = k0Var.f14215a;
            aVar.mo24091b();
        }
    }
}
