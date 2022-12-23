package com.applovin.impl.sdk;

import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.C2039g;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.u */
public class C2028u {

    /* renamed from: a */
    private final C1959m f3945a;

    /* renamed from: b */
    private final LocationManager f3946b;

    /* renamed from: c */
    private C2027t f3947c;

    C2028u(C1959m mVar) {
        this.f3945a = mVar;
        this.f3946b = (LocationManager) mVar.mo14297L().getSystemService(FirebaseAnalytics.Param.LOCATION);
    }

    /* renamed from: a */
    private Location m4850a(String str, String str2) {
        C2092v A;
        StringBuilder sb;
        String str3;
        if (!C2039g.m4882a(str2, this.f3945a.mo14297L())) {
            return null;
        }
        try {
            return this.f3946b.getLastKnownLocation(str);
        } catch (SecurityException e) {
            th = e;
            if (C2092v.m5047a()) {
                A = this.f3945a.mo14286A();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ": access denied.";
                sb.append(str3);
                A.mo14790b("LocationManager", sb.toString(), th);
            }
            return null;
        } catch (IllegalArgumentException e2) {
            th = e2;
            if (C2092v.m5047a()) {
                A = this.f3945a.mo14286A();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ": device does not support this location provider.";
                sb.append(str3);
                A.mo14790b("LocationManager", sb.toString(), th);
            }
            return null;
        } catch (NullPointerException e3) {
            th = e3;
            if (C2092v.m5047a()) {
                A = this.f3945a.mo14286A();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ": location provider is not available.";
                sb.append(str3);
                A.mo14790b("LocationManager", sb.toString(), th);
            }
            return null;
        } catch (Throwable th) {
            th = th;
            if (C2092v.m5047a()) {
                A = this.f3945a.mo14286A();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ".";
                sb.append(str3);
                A.mo14790b("LocationManager", sb.toString(), th);
            }
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo14654a() {
        return C2039g.m4882a("android.permission.ACCESS_COARSE_LOCATION", this.f3945a.mo14297L());
    }

    /* renamed from: b */
    public boolean mo14655b() {
        return C2039g.m4889h() ? this.f3946b.isLocationEnabled() : !C2039g.m4884c() || Settings.Secure.getInt(this.f3945a.mo14297L().getContentResolver(), "location_mode", 0) != 0;
    }

    /* renamed from: c */
    public C2027t mo14656c() {
        if (!this.f3945a.mo14363p().isLocationCollectionEnabled() || !((Boolean) this.f3945a.mo14311a(C1857b.f3250dW)).booleanValue()) {
            return null;
        }
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f3945a.mo14311a(C1857b.f3251dX)).longValue());
        if (this.f3947c != null && System.currentTimeMillis() - this.f3947c.mo14653c() < millis) {
            return this.f3947c;
        }
        Location a = m4850a("gps", "android.permission.ACCESS_FINE_LOCATION");
        if (a == null) {
            a = m4850a("network", "android.permission.ACCESS_COARSE_LOCATION");
        }
        if (a != null) {
            this.f3947c = new C2027t(a.getLatitude(), a.getLongitude(), System.currentTimeMillis());
        }
        return this.f3947c;
    }
}
