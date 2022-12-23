package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.iu */
/* compiled from: LocationInfo */
public class C6275iu implements LocationListener {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f15885c = C6275iu.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static boolean f15886e = false;

    /* renamed from: a */
    LocationManager f15887a;

    /* renamed from: b */
    GoogleApiClient f15888b;

    /* renamed from: d */
    private HandlerThread f15889d;

    /* renamed from: com.inmobi.media.iu$a */
    /* compiled from: LocationInfo */
    static class C6278a {

        /* renamed from: a */
        static final C6275iu f15892a = new C6275iu((byte) 0);
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    /* synthetic */ C6275iu(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6275iu m18752a() {
        return C6278a.f15892a;
    }

    private C6275iu() {
        HandlerThread handlerThread = new HandlerThread("LThread");
        this.f15889d = handlerThread;
        handlerThread.start();
        Context c = C6227ho.m18551c();
        if (c != null) {
            this.f15887a = (LocationManager) c.getSystemService(FirebaseAnalytics.Param.LOCATION);
        }
    }

    /* renamed from: g */
    private static boolean m18758g() {
        try {
            GoogleApiClient.class.getName();
            FusedLocationProviderClient.class.getName();
            LocationServices.class.getName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo35484b() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = m18756c()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r0 == 0) goto L_0x0072
            boolean r0 = r3.mo35486e()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r0 == 0) goto L_0x0072
            android.location.LocationManager r0 = r3.f15887a     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r0 == 0) goto L_0x0035
            android.location.Criteria r0 = new android.location.Criteria     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r0.<init>()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r1 = 2
            r0.setBearingAccuracy(r1)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r0.setPowerRequirement(r1)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r1 = 0
            r0.setCostAllowed(r1)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            android.location.LocationManager r1 = r3.f15887a     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2 = 1
            java.lang.String r0 = r1.getBestProvider(r0, r2)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r0 == 0) goto L_0x0035
            android.location.LocationManager r1 = r3.f15887a     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            android.os.HandlerThread r2 = r3.f15889d     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            android.os.Looper r2 = r2.getLooper()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r1.requestSingleUpdate(r0, r3, r2)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
        L_0x0035:
            boolean r0 = m18758g()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r0 != 0) goto L_0x0072
            android.content.Context r0 = com.inmobi.media.C6227ho.m18551c()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            com.google.android.gms.common.api.GoogleApiClient r1 = r3.f15888b     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            if (r1 != 0) goto L_0x006b
            com.google.android.gms.common.api.GoogleApiClient$Builder r1 = new com.google.android.gms.common.api.GoogleApiClient$Builder     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.inmobi.media.iu$2 r0 = new com.inmobi.media.iu$2     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            r0.<init>()     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.google.android.gms.common.api.GoogleApiClient$Builder r0 = r1.addConnectionCallbacks(r0)     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.inmobi.media.iu$1 r1 = new com.inmobi.media.iu$1     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            r1.<init>()     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.google.android.gms.common.api.GoogleApiClient$Builder r0 = r0.addOnConnectionFailedListener(r1)     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.google.android.gms.common.api.Api r1 = com.google.android.gms.location.LocationServices.API     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.google.android.gms.common.api.GoogleApiClient$Builder r0 = r0.addApi(r1)     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.google.android.gms.common.api.GoogleApiClient r0 = r0.build()     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            r3.f15888b = r0     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            r0.connect()     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            monitor-exit(r3)
            return
        L_0x006b:
            com.google.android.gms.common.api.GoogleApiClient r0 = r3.f15888b     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            r0.connect()     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            monitor-exit(r3)
            return
        L_0x0072:
            monitor-exit(r3)
            return
        L_0x0074:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0077:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6275iu.mo35484b():void");
    }

    /* renamed from: c */
    public static boolean m18756c() {
        try {
            if (C6240hw.m18620a(C6227ho.m18551c(), "android.permission.ACCESS_FINE_LOCATION") || C6240hw.m18620a(C6227ho.m18551c(), "android.permission.ACCESS_COARSE_LOCATION")) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            try {
                location.getTime();
                location.getLatitude();
                location.getLongitude();
                location.getAccuracy();
            } catch (Exception e) {
                C6181gg.m18398a().mo35357a(new C6217hg(e));
                return;
            }
        }
        if (m18756c() && this.f15887a != null) {
            this.f15887a.removeUpdates(this);
        }
    }

    /* renamed from: d */
    public final synchronized HashMap<String, String> mo35485d() {
        HashMap<String, String> hashMap;
        Location location;
        HashMap<String, Object> hashMap2;
        hashMap = new HashMap<>();
        C6281iw.m18775a();
        Location location2 = null;
        if (C6281iw.m18779g()) {
            location = m18759h();
        } else {
            location = null;
        }
        if (location != null) {
            if (C6240hw.m18620a(C6227ho.m18551c(), "android.permission.ACCESS_FINE_LOCATION")) {
                location2 = m18751a(1, 3);
            }
            hashMap2 = m18754a(location, true, location2);
        } else {
            hashMap2 = m18754a(C6258ig.m18690c(), false, (Location) null);
        }
        for (Map.Entry next : hashMap2.entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }

    /* renamed from: e */
    public final boolean mo35486e() {
        boolean z;
        boolean z2;
        int i;
        Context c = C6227ho.m18551c();
        if (c == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = this.f15887a;
            if (locationManager == null || !locationManager.isLocationEnabled()) {
                return false;
            }
            return true;
        } else if (Build.VERSION.SDK_INT >= 19) {
            try {
                i = Settings.Secure.getInt(c.getContentResolver(), "location_mode");
            } catch (Settings.SettingNotFoundException unused) {
                i = 0;
            }
            if (i != 0) {
                return true;
            }
            return false;
        } else if (this.f15887a == null) {
            return false;
        } else {
            try {
                if (C6240hw.m18620a(c, "android.permission.ACCESS_FINE_LOCATION")) {
                    z = this.f15887a.isProviderEnabled("gps");
                    z2 = false;
                } else {
                    z2 = C6240hw.m18620a(c, "android.permission.ACCESS_COARSE_LOCATION") ? this.f15887a.isProviderEnabled("network") : false;
                    z = false;
                }
            } catch (Exception unused2) {
                z2 = false;
                z = false;
            }
            if (z2 || z) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.location.Location m18759h() {
        /*
            r10 = this;
            r0 = 0
            boolean r1 = r10.mo35486e()     // Catch:{ Exception -> 0x0030 }
            if (r1 == 0) goto L_0x002d
            boolean r1 = m18756c()     // Catch:{ Exception -> 0x0030 }
            if (r1 == 0) goto L_0x002d
            boolean r1 = f15886e     // Catch:{ Exception -> 0x0030 }
            if (r1 == 0) goto L_0x0016
            android.location.Location r1 = m18760i()     // Catch:{ Exception -> 0x0030 }
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            android.location.LocationManager r2 = r10.f15887a     // Catch:{ Exception -> 0x0031 }
            if (r2 == 0) goto L_0x0031
            android.content.Context r2 = com.inmobi.media.C6227ho.m18551c()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r2 = com.inmobi.media.C6240hw.m18620a(r2, r3)     // Catch:{ Exception -> 0x0031 }
            if (r2 == 0) goto L_0x0031
            r2 = 2
            android.location.Location r2 = r10.m18751a(r2, r2)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0032
        L_0x002d:
            r1 = r0
            r2 = r1
            goto L_0x0032
        L_0x0030:
            r1 = r0
        L_0x0031:
            r2 = r0
        L_0x0032:
            if (r1 != 0) goto L_0x0037
            if (r2 != 0) goto L_0x0037
            return r0
        L_0x0037:
            if (r1 != 0) goto L_0x003d
            r2.getTime()
            return r2
        L_0x003d:
            if (r2 != 0) goto L_0x0043
            r1.getTime()
            return r1
        L_0x0043:
            long r3 = r1.getTime()
            long r5 = r2.getTime()
            long r3 = r3 - r5
            r5 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r0 <= 0) goto L_0x0057
            r0 = r5
            goto L_0x0058
        L_0x0057:
            r0 = r6
        L_0x0058:
            r7 = -120000(0xfffffffffffe2b40, double:NaN)
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0061
            r7 = r5
            goto L_0x0062
        L_0x0061:
            r7 = r6
        L_0x0062:
            r8 = 0
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x006a
            r3 = r5
            goto L_0x006b
        L_0x006a:
            r3 = r6
        L_0x006b:
            if (r0 == 0) goto L_0x0071
            r1.getTime()
            return r1
        L_0x0071:
            if (r7 == 0) goto L_0x0077
            r2.getTime()
            return r2
        L_0x0077:
            float r0 = r1.getAccuracy()
            float r4 = r2.getAccuracy()
            float r0 = r0 - r4
            int r0 = (int) r0
            if (r0 <= 0) goto L_0x0085
            r4 = r5
            goto L_0x0086
        L_0x0085:
            r4 = r6
        L_0x0086:
            if (r0 >= 0) goto L_0x008a
            r7 = r5
            goto L_0x008b
        L_0x008a:
            r7 = r6
        L_0x008b:
            r8 = 200(0xc8, float:2.8E-43)
            if (r0 <= r8) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r5 = r6
        L_0x0091:
            if (r7 != 0) goto L_0x009e
            if (r3 == 0) goto L_0x009a
            if (r4 == 0) goto L_0x009e
            if (r5 != 0) goto L_0x009a
            goto L_0x009e
        L_0x009a:
            r2.getTime()
            return r2
        L_0x009e:
            r1.getTime()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6275iu.m18759h():android.location.Location");
    }

    /* renamed from: a */
    private Location m18751a(int i, int i2) {
        String bestProvider;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(i);
        criteria.setPowerRequirement(i2);
        criteria.setCostAllowed(false);
        LocationManager locationManager = this.f15887a;
        Location location = null;
        if (locationManager == null || (bestProvider = locationManager.getBestProvider(criteria, true)) == null) {
            return null;
        }
        try {
            location = this.f15887a.getLastKnownLocation(bestProvider);
        } catch (Exception unused) {
        }
        return (location != null || i == 1) ? location : m18761j();
    }

    /* renamed from: i */
    private static Location m18760i() {
        try {
            return (Location) LocationServices.getFusedLocationProviderClient(C6227ho.m18551c()).getLastLocation().getResult();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: j */
    private Location m18761j() {
        LocationManager locationManager = this.f15887a;
        Location location = null;
        if (locationManager != null) {
            List<String> providers = locationManager.getProviders(true);
            for (int size = providers.size() - 1; size >= 0; size--) {
                String str = providers.get(size);
                try {
                    if (this.f15887a.isProviderEnabled(str)) {
                        try {
                            location = this.f15887a.getLastKnownLocation(str);
                        } catch (SecurityException unused) {
                        }
                        if (location != null) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        return location;
    }

    /* renamed from: a */
    private HashMap<String, Object> m18754a(Location location, boolean z, Location location2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Context c = C6227ho.m18551c();
        if (c == null) {
            return hashMap;
        }
        if (location != null) {
            if (location.getTime() > 0) {
                hashMap.put("u-ll-ts", Long.valueOf(location.getTime()));
            }
            hashMap.put("u-latlong-accu", m18753a(location));
            hashMap.put("sdk-collected", Integer.valueOf(z ? 1 : 0));
        }
        C6281iw.m18775a();
        if (C6281iw.m18779g()) {
            hashMap.put("loc-allowed", Integer.valueOf(mo35486e() ? 1 : 0));
        }
        if (location2 != null) {
            hashMap.put("u-latlong-accu-fine", m18753a(location2));
            hashMap.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
        }
        if (!mo35486e() || !m18756c()) {
            hashMap.put("loc-granularity", "none");
        } else if (C6240hw.m18620a(c, "android.permission.ACCESS_COARSE_LOCATION")) {
            hashMap.put("loc-granularity", "coarse");
        }
        return hashMap;
    }

    /* renamed from: a */
    private static String m18753a(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy());
    }
}
