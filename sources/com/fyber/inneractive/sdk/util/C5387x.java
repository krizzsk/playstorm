package com.fyber.inneractive.sdk.util;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.fyber.inneractive.sdk.util.x */
public class C5387x implements LocationListener {

    /* renamed from: a */
    public final /* synthetic */ C5390z f14269a;

    public C5387x(C5390z zVar) {
        this.f14269a = zVar;
    }

    public void onLocationChanged(Location location) {
        Runnable runnable;
        if (location != null) {
            long abs = Math.abs(System.currentTimeMillis() - location.getTime());
            this.f14269a.getClass();
            IAlog.m16699a("%sgps location changed: %s tss = %d tssM = %d", "Location Manager: ", location, Long.valueOf(abs), Long.valueOf(abs / 60000));
            this.f14269a.getClass();
            IAlog.m16699a("%sgps location sampling took: %d msec", "Location Manager: ", Long.valueOf(System.currentTimeMillis() - this.f14269a.f14277g));
            C5390z zVar = this.f14269a;
            zVar.mo26495a(zVar.f14276f);
            C5390z zVar2 = this.f14269a;
            zVar2.f14276f = null;
            if (zVar2.f14275e == null && (runnable = zVar2.f14274d) != null) {
                C5357n.f14225b.removeCallbacks(runnable);
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        this.f14269a.getClass();
        IAlog.m16699a("%sgps location listener - onStatusChanged: %dextras = %s", "Location Manager: ", Integer.valueOf(i), bundle);
    }
}
