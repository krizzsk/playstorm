package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.my.tracker.obfuscated.y */
public final class C10182y {

    /* renamed from: a */
    Location f25509a;

    /* renamed from: b */
    int f25510b = -1;

    /* renamed from: c */
    private volatile boolean f25511c = true;

    C10182y() {
    }

    /* renamed from: a */
    public void mo66436a(Context context) {
        LocationManager locationManager;
        int i;
        Location location = null;
        this.f25509a = null;
        char c = 65535;
        this.f25510b = -1;
        if (this.f25511c && C10113h0.m30081a("android.permission.ACCESS_FINE_LOCATION", context) && C10113h0.m30081a("android.permission.ACCESS_COARSE_LOCATION", context) && !C10113h0.m30080a() && (locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION)) != null) {
            long j = 0;
            float f = Float.MAX_VALUE;
            String str = null;
            for (String next : locationManager.getAllProviders()) {
                try {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(next);
                    if (lastKnownLocation != null) {
                        float accuracy = lastKnownLocation.getAccuracy();
                        long time = lastKnownLocation.getTime();
                        if (location == null || (time > j && accuracy < f)) {
                            str = next;
                            location = lastKnownLocation;
                            f = accuracy;
                            j = time;
                        }
                    }
                } catch (SecurityException unused) {
                    C10175u0.m30440a("Permission android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION check was positive, but still got security exception on the location provider");
                }
            }
            if (location != null) {
                this.f25509a = location;
                str.hashCode();
                int hashCode = str.hashCode();
                if (hashCode != -792039641) {
                    if (hashCode != 102570) {
                        if (hashCode == 1843485230 && str.equals("network")) {
                            c = 2;
                        }
                    } else if (str.equals("gps")) {
                        c = 1;
                    }
                } else if (str.equals("passive")) {
                    c = 0;
                }
                if (c == 0) {
                    i = 4;
                } else if (c == 1) {
                    this.f25510b = 2;
                    return;
                } else if (c != 2) {
                    this.f25510b = 1;
                    return;
                } else {
                    i = 3;
                }
                this.f25510b = i;
            }
        }
    }

    /* renamed from: a */
    public void mo66437a(C10129m0 m0Var, Context context) {
        Location location = this.f25509a;
        if (location != null) {
            m0Var.mo66263a(location, this.f25510b);
        }
    }

    /* renamed from: a */
    public void mo66438a(boolean z) {
        this.f25511c = z;
    }

    /* renamed from: b */
    public void mo66439b(Context context) {
    }
}
