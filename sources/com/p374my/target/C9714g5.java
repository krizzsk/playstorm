package com.p374my.target;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.g5 */
public final class C9714g5 extends C9736h5 {

    /* renamed from: a */
    public volatile boolean f23916a = true;

    /* renamed from: b */
    public volatile boolean f23917b = true;

    /* renamed from: com.my.target.g5$a */
    public static class C9715a implements C9716b {

        /* renamed from: a */
        public final String f23918a = "cdma";

        /* renamed from: b */
        public final int f23919b;

        /* renamed from: c */
        public final int f23920c;

        /* renamed from: d */
        public final int f23921d;

        /* renamed from: e */
        public final int f23922e;

        /* renamed from: f */
        public final int f23923f;

        /* renamed from: g */
        public final int f23924g;

        /* renamed from: h */
        public final int f23925h;

        /* renamed from: i */
        public final int f23926i;

        /* renamed from: j */
        public final int f23927j;

        /* renamed from: k */
        public final int f23928k;

        /* renamed from: l */
        public final int f23929l;

        /* renamed from: m */
        public final int f23930m;

        /* renamed from: n */
        public final int f23931n;

        /* renamed from: o */
        public final int f23932o;

        /* renamed from: p */
        public final int f23933p;

        public C9715a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f23919b = i;
            this.f23920c = i2;
            this.f23921d = i3;
            this.f23922e = i4;
            this.f23923f = i5;
            this.f23924g = i6;
            this.f23925h = i7;
            this.f23926i = i8;
            this.f23927j = i9;
            this.f23928k = i10;
            this.f23929l = i11;
            this.f23930m = i12;
            this.f23931n = i13;
            this.f23932o = i14;
            this.f23933p = i15;
        }

        /* renamed from: a */
        public String mo64101a() {
            return this.f23918a + "," + this.f23919b + "," + this.f23920c + "," + this.f23921d + "," + this.f23922e + "," + this.f23923f + "," + this.f23924g + "," + this.f23925h + "," + this.f23926i + "," + this.f23927j + "," + this.f23928k + "," + this.f23929l + "," + this.f23930m + "," + this.f23931n + "," + this.f23932o + "," + this.f23933p;
        }
    }

    /* renamed from: com.my.target.g5$b */
    public interface C9716b {
        /* renamed from: a */
        String mo64101a();
    }

    /* renamed from: com.my.target.g5$c */
    public static final class C9717c {

        /* renamed from: a */
        public List<C9716b> f23934a = null;

        public C9717c(Context context) {
            C9716b b;
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    boolean z = true;
                    boolean z2 = i < 29 && C9736h5.checkPermission("android.permission.ACCESS_COARSE_LOCATION", context);
                    boolean checkPermission = C9736h5.checkPermission("android.permission.ACCESS_FINE_LOCATION", context);
                    if (z2 || checkPermission) {
                        if (i < 17) {
                            z = false;
                        }
                        if (z) {
                            this.f23934a = m28081a(telephonyManager);
                        }
                        List<C9716b> list = this.f23934a;
                        if ((list == null || list.isEmpty()) && (b = m28082b(telephonyManager)) != null) {
                            ArrayList arrayList = new ArrayList();
                            this.f23934a = arrayList;
                            arrayList.add(b);
                        }
                    }
                } catch (Throwable th) {
                    C9672e0.m27882a("Environment provider error " + th.getMessage());
                }
            }
        }

        /* JADX WARNING: type inference failed for: r22v0 */
        /* JADX WARNING: type inference failed for: r4v9, types: [com.my.target.g5$d] */
        /* JADX WARNING: type inference failed for: r4v10, types: [com.my.target.g5$d] */
        /* JADX WARNING: type inference failed for: r4v11, types: [com.my.target.g5$a] */
        /* JADX WARNING: type inference failed for: r7v10, types: [com.my.target.g5$d] */
        /* JADX WARNING: type inference failed for: r7v11, types: [com.my.target.g5$d] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List<com.p374my.target.C9714g5.C9716b> m28081a(android.telephony.TelephonyManager r24) {
            /*
                java.util.List r0 = r24.getAllCellInfo()
                if (r0 != 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0011:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x025d
                java.lang.Object r2 = r0.next()
                android.telephony.CellInfo r2 = (android.telephony.CellInfo) r2
                boolean r3 = r2.isRegistered()
                if (r3 != 0) goto L_0x0024
                goto L_0x0011
            L_0x0024:
                boolean r3 = r2 instanceof android.telephony.CellInfoLte
                r4 = 24
                r5 = 2147483647(0x7fffffff, float:NaN)
                r6 = 28
                if (r3 == 0) goto L_0x0090
                android.telephony.CellInfoLte r2 = (android.telephony.CellInfoLte) r2
                android.telephony.CellIdentityLte r3 = r2.getCellIdentity()
                android.telephony.CellSignalStrengthLte r2 = r2.getCellSignalStrength()
                com.my.target.g5$d r22 = new com.my.target.g5$d
                int r7 = r3.getCi()
                long r9 = (long) r7
                r11 = 2147483647(0x7fffffff, float:NaN)
                int r7 = android.os.Build.VERSION.SDK_INT
                if (r7 < r6) goto L_0x004c
                java.lang.String r8 = r3.getMccString()
                goto L_0x0054
            L_0x004c:
                int r8 = r3.getMcc()
                java.lang.String r8 = java.lang.String.valueOf(r8)
            L_0x0054:
                r12 = r8
                if (r7 < r6) goto L_0x005c
                java.lang.String r6 = r3.getMncString()
                goto L_0x0064
            L_0x005c:
                int r6 = r3.getMnc()
                java.lang.String r6 = java.lang.String.valueOf(r6)
            L_0x0064:
                r13 = r6
                int r14 = r2.getLevel()
                int r15 = r2.getDbm()
                int r16 = r2.getAsuLevel()
                int r17 = r2.getTimingAdvance()
                if (r7 < r4) goto L_0x007b
                int r5 = r3.getEarfcn()
            L_0x007b:
                r18 = r5
                int r21 = r3.getTac()
                r19 = 2147483647(0x7fffffff, float:NaN)
                r20 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r8 = "lte"
                r7 = r22
                r7.<init>(r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                goto L_0x01bb
            L_0x0090:
                boolean r3 = r2 instanceof android.telephony.CellInfoGsm
                if (r3 == 0) goto L_0x00ff
                android.telephony.CellInfoGsm r2 = (android.telephony.CellInfoGsm) r2
                android.telephony.CellIdentityGsm r3 = r2.getCellIdentity()
                android.telephony.CellSignalStrengthGsm r2 = r2.getCellSignalStrength()
                com.my.target.g5$d r22 = new com.my.target.g5$d
                int r7 = r3.getCid()
                long r9 = (long) r7
                int r11 = r3.getLac()
                int r7 = android.os.Build.VERSION.SDK_INT
                if (r7 < r6) goto L_0x00b2
                java.lang.String r8 = r3.getMccString()
                goto L_0x00ba
            L_0x00b2:
                int r8 = r3.getMcc()
                java.lang.String r8 = java.lang.String.valueOf(r8)
            L_0x00ba:
                r12 = r8
                if (r7 < r6) goto L_0x00c2
                java.lang.String r6 = r3.getMncString()
                goto L_0x00ca
            L_0x00c2:
                int r6 = r3.getMnc()
                java.lang.String r6 = java.lang.String.valueOf(r6)
            L_0x00ca:
                r13 = r6
                int r14 = r2.getLevel()
                int r15 = r2.getDbm()
                int r16 = r2.getAsuLevel()
                r6 = 26
                if (r7 < r6) goto L_0x00e2
                int r2 = r2.getTimingAdvance()
                r17 = r2
                goto L_0x00e4
            L_0x00e2:
                r17 = r5
            L_0x00e4:
                r18 = 2147483647(0x7fffffff, float:NaN)
                if (r7 < r4) goto L_0x00ed
                int r5 = r3.getBsic()
            L_0x00ed:
                r19 = r5
                int r20 = r3.getPsc()
                r21 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r8 = "gsm"
                r7 = r22
                r7.<init>(r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                goto L_0x01bb
            L_0x00ff:
                int r3 = android.os.Build.VERSION.SDK_INT
                r7 = 18
                if (r3 < r7) goto L_0x016a
                boolean r7 = r2 instanceof android.telephony.CellInfoWcdma
                if (r7 == 0) goto L_0x016a
                android.telephony.CellInfoWcdma r2 = (android.telephony.CellInfoWcdma) r2
                android.telephony.CellIdentityWcdma r7 = r2.getCellIdentity()
                android.telephony.CellSignalStrengthWcdma r2 = r2.getCellSignalStrength()
                com.my.target.g5$d r23 = new com.my.target.g5$d
                int r8 = r7.getCid()
                long r10 = (long) r8
                int r12 = r7.getLac()
                if (r3 < r6) goto L_0x0125
                java.lang.String r8 = r7.getMccString()
                goto L_0x012d
            L_0x0125:
                int r8 = r7.getMcc()
                java.lang.String r8 = java.lang.String.valueOf(r8)
            L_0x012d:
                r13 = r8
                if (r3 < r6) goto L_0x0135
                java.lang.String r6 = r7.getMncString()
                goto L_0x013d
            L_0x0135:
                int r6 = r7.getMnc()
                java.lang.String r6 = java.lang.String.valueOf(r6)
            L_0x013d:
                r14 = r6
                int r15 = r2.getLevel()
                int r16 = r2.getDbm()
                int r17 = r2.getAsuLevel()
                r18 = 2147483647(0x7fffffff, float:NaN)
                if (r3 < r4) goto L_0x0153
                int r5 = r7.getUarfcn()
            L_0x0153:
                r19 = r5
                int r21 = r7.getPsc()
                r20 = 2147483647(0x7fffffff, float:NaN)
                r22 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r9 = "wcdma"
                r8 = r23
                r8.<init>(r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r2 = r23
                goto L_0x0258
            L_0x016a:
                boolean r4 = r2 instanceof android.telephony.CellInfoCdma
                if (r4 == 0) goto L_0x01bf
                android.telephony.CellInfoCdma r2 = (android.telephony.CellInfoCdma) r2
                android.telephony.CellIdentityCdma r3 = r2.getCellIdentity()
                android.telephony.CellSignalStrengthCdma r2 = r2.getCellSignalStrength()
                com.my.target.g5$a r22 = new com.my.target.g5$a
                int r5 = r3.getNetworkId()
                int r6 = r3.getSystemId()
                int r7 = r3.getBasestationId()
                int r8 = r3.getLatitude()
                int r9 = r3.getLongitude()
                int r10 = r2.getCdmaLevel()
                int r11 = r2.getLevel()
                int r12 = r2.getEvdoLevel()
                int r13 = r2.getAsuLevel()
                int r14 = r2.getCdmaDbm()
                int r15 = r2.getDbm()
                int r16 = r2.getEvdoDbm()
                int r17 = r2.getEvdoEcio()
                int r18 = r2.getCdmaEcio()
                int r19 = r2.getEvdoSnr()
                r4 = r22
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            L_0x01bb:
                r2 = r22
                goto L_0x0258
            L_0x01bf:
                r4 = 29
                if (r3 < r4) goto L_0x020b
                boolean r4 = r2 instanceof android.telephony.CellInfoNr
                if (r4 == 0) goto L_0x020b
                android.telephony.CellInfoNr r2 = (android.telephony.CellInfoNr) r2
                android.telephony.CellIdentity r3 = r2.getCellIdentity()
                android.telephony.CellIdentityNr r3 = (android.telephony.CellIdentityNr) r3
                android.telephony.CellSignalStrength r2 = r2.getCellSignalStrength()
                android.telephony.CellSignalStrengthNr r2 = (android.telephony.CellSignalStrengthNr) r2
                com.my.target.g5$d r22 = new com.my.target.g5$d
                long r6 = r3.getNci()
                java.lang.String r9 = r3.getMccString()
                java.lang.String r10 = r3.getMncString()
                int r11 = r2.getLevel()
                int r12 = r2.getDbm()
                int r13 = r2.getAsuLevel()
                int r15 = r3.getNrarfcn()
                int r18 = r3.getTac()
                r8 = 2147483647(0x7fffffff, float:NaN)
                r14 = 2147483647(0x7fffffff, float:NaN)
                r16 = 2147483647(0x7fffffff, float:NaN)
                r17 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r5 = "nr"
                r4 = r22
                r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                goto L_0x01bb
            L_0x020b:
                r4 = 30
                if (r3 < r4) goto L_0x0011
                boolean r3 = r2 instanceof android.telephony.CellInfoTdscdma
                if (r3 == 0) goto L_0x0011
                r3 = r2
                android.telephony.CellInfoTdscdma r3 = (android.telephony.CellInfoTdscdma) r3
                android.telephony.CellIdentityTdscdma r3 = r3.getCellIdentity()
                android.telephony.CellSignalStrength r2 = r2.getCellSignalStrength()
                android.telephony.CellSignalStrengthTdscdma r2 = (android.telephony.CellSignalStrengthTdscdma) r2
                com.my.target.g5$d r22 = new com.my.target.g5$d
                int r4 = r3.getCid()
                long r6 = (long) r4
                int r8 = r3.getLac()
                java.lang.String r9 = r3.getMccString()
                java.lang.String r10 = r3.getMncString()
                int r11 = r2.getLevel()
                int r12 = r2.getDbm()
                int r13 = r2.getAsuLevel()
                int r15 = r3.getUarfcn()
                r14 = 2147483647(0x7fffffff, float:NaN)
                r16 = 2147483647(0x7fffffff, float:NaN)
                r17 = 2147483647(0x7fffffff, float:NaN)
                r18 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r5 = "tdscdma"
                r4 = r22
                r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                goto L_0x01bb
            L_0x0258:
                r1.add(r2)
                goto L_0x0011
            L_0x025d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9714g5.C9717c.m28081a(android.telephony.TelephonyManager):java.util.List");
        }

        /* renamed from: b */
        public static C9716b m28082b(TelephonyManager telephonyManager) {
            String str;
            String str2;
            String str3;
            CellLocation cellLocation = telephonyManager.getCellLocation();
            String str4 = null;
            if (!(cellLocation instanceof GsmCellLocation)) {
                return null;
            }
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            String networkOperator = telephonyManager.getNetworkOperator();
            if (networkOperator == null || networkOperator.length() == 0) {
                str2 = null;
                str = null;
            } else {
                try {
                    str3 = networkOperator.substring(0, 3);
                    try {
                        str4 = networkOperator.substring(3);
                    } catch (Throwable unused) {
                        C9672e0.m27882a("unable to substring network operator " + networkOperator);
                        str = str4;
                        str2 = str3;
                        return new C9718d("gsm", (long) gsmCellLocation.getCid(), gsmCellLocation.getLac(), str2, str, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    }
                } catch (Throwable unused2) {
                    str3 = null;
                    C9672e0.m27882a("unable to substring network operator " + networkOperator);
                    str = str4;
                    str2 = str3;
                    return new C9718d("gsm", (long) gsmCellLocation.getCid(), gsmCellLocation.getLac(), str2, str, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                }
                str = str4;
                str2 = str3;
            }
            return new C9718d("gsm", (long) gsmCellLocation.getCid(), gsmCellLocation.getLac(), str2, str, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    /* renamed from: com.my.target.g5$d */
    public static class C9718d implements C9716b {

        /* renamed from: a */
        public final String f23935a;

        /* renamed from: b */
        public final String f23936b;

        /* renamed from: c */
        public final String f23937c;

        /* renamed from: d */
        public final long f23938d;

        /* renamed from: e */
        public final int f23939e;

        /* renamed from: f */
        public final int f23940f;

        /* renamed from: g */
        public final int f23941g;

        /* renamed from: h */
        public final int f23942h;

        /* renamed from: i */
        public final int f23943i;

        /* renamed from: j */
        public final int f23944j;

        /* renamed from: k */
        public final int f23945k;

        /* renamed from: l */
        public final int f23946l;

        /* renamed from: m */
        public final int f23947m;

        public C9718d(String str, long j, int i, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f23935a = str;
            this.f23938d = j;
            this.f23939e = i;
            this.f23936b = str2 == null ? String.valueOf(Integer.MAX_VALUE) : str2;
            this.f23937c = str3 == null ? String.valueOf(Integer.MAX_VALUE) : str3;
            this.f23940f = i2;
            this.f23941g = i3;
            this.f23942h = i4;
            this.f23943i = i5;
            this.f23944j = i6;
            this.f23945k = i7;
            this.f23946l = i8;
            this.f23947m = i9;
        }

        /* renamed from: a */
        public String mo64101a() {
            return this.f23935a + "," + this.f23938d + "," + this.f23939e + "," + this.f23936b + "," + this.f23937c + "," + this.f23940f + "," + this.f23941g + "," + this.f23942h + "," + this.f23943i + "," + this.f23944j + "," + this.f23945k + "," + this.f23946l + "," + this.f23947m;
        }
    }

    /* renamed from: com.my.target.g5$e */
    public static final class C9719e {

        /* renamed from: a */
        public WifiInfo f23948a;

        /* renamed from: b */
        public List<ScanResult> f23949b;

        public C9719e(Context context) {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
                if (wifiManager == null) {
                    return;
                }
                if (wifiManager.isWifiEnabled()) {
                    this.f23948a = wifiManager.getConnectionInfo();
                    if (Build.VERSION.SDK_INT < 24 || C9714g5.m28071a(context)) {
                        this.f23949b = wifiManager.getScanResults();
                    }
                    List<ScanResult> list = this.f23949b;
                    if (list != null) {
                        Collections.sort(list, $$Lambda$zeRthRYdRcsQHFgQxLsrmCvhmZM.INSTANCE);
                    }
                }
            } catch (Throwable unused) {
                C9672e0.m27882a("No permissions for access to wifi state");
            }
        }

        /* renamed from: a */
        public static /* synthetic */ int m28084a(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult2.level - scanResult.level;
        }
    }

    /* renamed from: a */
    public static boolean m28071a(Context context) {
        return C9736h5.checkPermission("android.permission.ACCESS_FINE_LOCATION", context) || C9736h5.checkPermission("android.permission.ACCESS_COARSE_LOCATION", context);
    }

    /* renamed from: b */
    public static void m28072b(Context context, Map<String, String> map) {
        LocationManager locationManager;
        if (m28071a(context) && (locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION)) != null) {
            float f = Float.MAX_VALUE;
            long j = 0;
            Location location = null;
            String str = null;
            for (String next : locationManager.getAllProviders()) {
                try {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(next);
                    if (lastKnownLocation != null) {
                        C9672e0.m27882a("locationProvider: " + next);
                        float accuracy = lastKnownLocation.getAccuracy();
                        long time = lastKnownLocation.getTime();
                        if (location == null || (time > j && accuracy < f)) {
                            str = next;
                            location = lastKnownLocation;
                            f = accuracy;
                            j = time;
                        }
                    }
                } catch (Throwable unused) {
                    C9672e0.m27882a("No permissions for get geo data");
                }
            }
            if (location != null) {
                String str2 = location.getLatitude() + "," + location.getLongitude() + "," + location.getAccuracy() + "," + location.getSpeed() + "," + (j / 1000);
                map.put(FirebaseAnalytics.Param.LOCATION, str2);
                C9672e0.m27882a("location: " + str2);
                map.put("location_provider", str);
            }
        }
    }

    /* renamed from: a */
    public final void mo64096a(Context context, Map<String, String> map) {
        List<C9716b> list;
        if (this.f23917b && C9736h5.checkPermission("android.permission.ACCESS_COARSE_LOCATION", context) && (list = new C9717c(context).f23934a) != null) {
            int i = 0;
            while (i < list.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("cell");
                sb.append(i != 0 ? Integer.valueOf(i) : "");
                map.put(sb.toString(), list.get(i).mo64101a());
                i++;
            }
        }
    }

    /* renamed from: a */
    public void mo64097a(boolean z) {
        this.f23917b = z;
    }

    /* renamed from: b */
    public void m28073c(Context context) {
        if (!this.f23916a) {
            removeAll();
            return;
        }
        HashMap hashMap = new HashMap();
        m28072b(context, hashMap);
        mo64100c(context, hashMap);
        mo64096a(context, hashMap);
        synchronized (this) {
            removeAll();
            addParams(hashMap);
        }
    }

    /* renamed from: b */
    public void mo64099b(boolean z) {
        this.f23916a = z;
    }

    /* renamed from: c */
    public final void mo64100c(Context context, Map<String, String> map) {
        if (this.f23917b && C9736h5.checkPermission("android.permission.ACCESS_WIFI_STATE", context)) {
            C9719e eVar = new C9719e(context);
            WifiInfo wifiInfo = eVar.f23948a;
            if (wifiInfo != null) {
                String bssid = wifiInfo.getBSSID();
                if (bssid == null) {
                    bssid = "";
                }
                int linkSpeed = wifiInfo.getLinkSpeed();
                int networkId = wifiInfo.getNetworkId();
                int rssi = wifiInfo.getRssi();
                String ssid = wifiInfo.getSSID();
                if (ssid == null) {
                    ssid = "";
                }
                String str = bssid + "," + ssid + "," + rssi + "," + networkId + "," + linkSpeed;
                map.put(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI, str);
                C9672e0.m27882a("ip: " + wifiInfo.getIpAddress());
                C9672e0.m27882a("wifi: " + str);
            }
            List<ScanResult> list = eVar.f23949b;
            if (list != null) {
                int i = 0;
                int min = Math.min(list.size(), 5);
                while (i < min) {
                    ScanResult scanResult = list.get(i);
                    C9672e0.m27882a(scanResult.level + "");
                    String str2 = scanResult.BSSID;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = scanResult.SSID;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = str2 + "," + str3 + "," + scanResult.level;
                    StringBuilder sb = new StringBuilder();
                    sb.append(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
                    i++;
                    sb.append(i);
                    map.put(sb.toString(), str4);
                    C9672e0.m27882a(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI + i + ": " + str4);
                }
            }
        }
    }

    public void collectData(Context context) {
        C9693f0.m27981b(new Runnable(context) {
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9714g5.this.m28073c(this.f$1);
            }
        });
    }
}
