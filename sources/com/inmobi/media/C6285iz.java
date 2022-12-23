package com.inmobi.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.inmobi.media.iz */
/* compiled from: CellularInfoUtil */
public class C6285iz {

    /* renamed from: a */
    private static final String f15914a = C6285iz.class.getSimpleName();

    /* renamed from: a */
    private static boolean m18790a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: a */
    public static Map<String, String> m18789a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        Context c = C6227ho.m18551c();
        if (c == null) {
            return hashMap;
        }
        C6281iw.m18775a();
        String m = C6227ho.m18568m();
        C6293jd c2 = C6295jf.m18826c();
        String str3 = null;
        String e = c2 != null ? c2.mo35519e() : null;
        if (!((m == null || C6281iw.m18774a(m).f15621c.f15620oe) && (e == null || c2.mo35517c()) && (!(c2 != null && c2.mo35518d()) || C6281iw.m18774a(e).f15621c.f15620oe))) {
            return hashMap;
        }
        String g = "InMobi".equals(str) ? C6227ho.m18561g() : C6227ho.m18563h();
        C6281iw.m18775a();
        int i = C6281iw.m18774a(g).f15621c.cof;
        boolean a = m18790a(i, 2);
        boolean a2 = m18790a(i, 1);
        C6283ix ixVar = new C6283ix();
        TelephonyManager telephonyManager = (TelephonyManager) c.getSystemService("phone");
        if (!a) {
            int[] b = m18792b(telephonyManager.getNetworkOperator());
            ixVar.f15905a = b[0];
            ixVar.f15906b = b[1];
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                ixVar.f15909e = networkCountryIso.toLowerCase(Locale.ENGLISH);
            }
        }
        if (!a2) {
            int[] b2 = m18792b(telephonyManager.getSimOperator());
            ixVar.f15907c = b2[0];
            ixVar.f15908d = b2[1];
        }
        if (ixVar.f15907c == -1 && ixVar.f15908d == -1) {
            str2 = null;
        } else {
            str2 = ixVar.f15907c + "_" + ixVar.f15908d;
        }
        hashMap.put("s-ho", str2);
        if (!(ixVar.f15905a == -1 && ixVar.f15906b == -1)) {
            str3 = ixVar.f15905a + "_" + ixVar.f15906b;
        }
        hashMap.put("s-co", str3);
        hashMap.put("s-iso", ixVar.f15909e);
        hashMap.put("s-cn", C6251ib.m18649a(c));
        return hashMap;
    }

    /* renamed from: b */
    private static int[] m18792b(String str) {
        int[] iArr = {-1, -1};
        if (str != null && !"".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str.substring(0, 3));
                int parseInt2 = Integer.parseInt(str.substring(3));
                iArr[0] = parseInt;
                iArr[1] = parseInt2;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }

    /* renamed from: c */
    private static boolean m18793c() {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        LocationManager locationManager = (LocationManager) C6227ho.m18551c().getSystemService(FirebaseAnalytics.Param.LOCATION);
        if (locationManager == null || !locationManager.isLocationEnabled()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m18794d() {
        if (!C6227ho.m18545a()) {
            return false;
        }
        boolean a = C6240hw.m18620a(C6227ho.m18551c(), "android.permission.READ_PHONE_STATE");
        boolean a2 = C6240hw.m18620a(C6227ho.m18551c(), "android.permission.ACCESS_FINE_LOCATION");
        if (Build.VERSION.SDK_INT == 29) {
            return a2;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (!a2 || !a) {
                return false;
            }
            return true;
        } else if (C6240hw.m18620a(C6227ho.m18551c(), "android.permission.ACCESS_COARSE_LOCATION") || a2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static int m18787a(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return telephonyManager.getDataNetworkType();
        }
        return telephonyManager.getNetworkType();
    }

    /* renamed from: a */
    public static Map<String, String> m18788a() {
        Context c;
        List<CellInfo> allCellInfo;
        C6281iw.m18775a();
        String m = C6227ho.m18568m();
        C6293jd c2 = C6295jf.m18826c();
        C6284iy iyVar = null;
        String e = c2 != null ? c2.mo35519e() : null;
        if (((m == null || C6281iw.m18774a(m).f15621c.cce) && (e == null || c2.mo35517c()) && (!(c2 != null && c2.mo35518d()) || C6281iw.m18774a(e).f15621c.cce)) && m18794d() && m18793c() && (c = C6227ho.m18551c()) != null) {
            TelephonyManager telephonyManager = (TelephonyManager) c.getSystemService("phone");
            int[] b = m18792b(telephonyManager.getNetworkOperator());
            String valueOf = String.valueOf(b[0]);
            String valueOf2 = String.valueOf(b[1]);
            if (Build.VERSION.SDK_INT >= 17 && (allCellInfo = telephonyManager.getAllCellInfo()) != null) {
                CellInfo cellInfo = null;
                for (int i = 0; i < allCellInfo.size(); i++) {
                    cellInfo = allCellInfo.get(i);
                    if (cellInfo.isRegistered()) {
                        break;
                    }
                }
                if (cellInfo != null) {
                    iyVar = new C6284iy(cellInfo, valueOf, valueOf2, m18787a(telephonyManager));
                }
            }
            CellLocation cellLocation = telephonyManager.getCellLocation();
            if (!(cellLocation == null || b[0] == -1)) {
                iyVar = new C6284iy();
                if (cellLocation instanceof CdmaCellLocation) {
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                    iyVar.f15912b = Integer.MAX_VALUE;
                    iyVar.f15913c = m18787a(telephonyManager);
                    iyVar.f15911a = C6284iy.m18784a(valueOf, cdmaCellLocation.getSystemId(), cdmaCellLocation.getNetworkId(), cdmaCellLocation.getBaseStationId());
                } else {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    iyVar.f15912b = Integer.MAX_VALUE;
                    iyVar.f15913c = m18787a(telephonyManager);
                    iyVar.f15911a = C6284iy.m18785a(valueOf, valueOf2, gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc(), Integer.MAX_VALUE);
                }
            }
        }
        HashMap hashMap = new HashMap();
        if (iyVar != null) {
            hashMap.put("c-sc", iyVar.mo35496a().toString());
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> m18791b() {
        /*
            boolean r0 = com.inmobi.media.C6227ho.m18545a()
            r1 = 1
            if (r0 == 0) goto L_0x00c8
            boolean r0 = m18794d()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = m18793c()
            if (r0 == 0) goto L_0x00c8
            com.inmobi.media.C6281iw.m18775a()
            java.lang.String r0 = com.inmobi.media.C6227ho.m18568m()
            com.inmobi.media.jd r2 = com.inmobi.media.C6295jf.m18826c()
            if (r2 == 0) goto L_0x0025
            java.lang.String r3 = r2.mo35519e()
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            r4 = 0
            if (r2 == 0) goto L_0x0031
            boolean r5 = r2.mo35518d()
            if (r5 == 0) goto L_0x0031
            r5 = r1
            goto L_0x0032
        L_0x0031:
            r5 = r4
        L_0x0032:
            if (r0 == 0) goto L_0x0041
            com.inmobi.media.ge$b r0 = com.inmobi.media.C6281iw.m18774a(r0)
            com.inmobi.media.ge$a r0 = r0.f15621c
            boolean r0 = r0.vce
            if (r0 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r0 = r4
            goto L_0x0042
        L_0x0041:
            r0 = r1
        L_0x0042:
            if (r3 == 0) goto L_0x004d
            boolean r2 = r2.mo35517c()
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r4
            goto L_0x004e
        L_0x004d:
            r2 = r1
        L_0x004e:
            if (r5 == 0) goto L_0x005d
            com.inmobi.media.ge$b r3 = com.inmobi.media.C6281iw.m18774a(r3)
            com.inmobi.media.ge$a r3 = r3.f15621c
            boolean r3 = r3.vce
            if (r3 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r3 = r4
            goto L_0x005e
        L_0x005d:
            r3 = r1
        L_0x005e:
            if (r0 == 0) goto L_0x0066
            if (r2 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0066
            r0 = r1
            goto L_0x0067
        L_0x0066:
            r0 = r4
        L_0x0067:
            if (r0 != 0) goto L_0x006a
            goto L_0x00c8
        L_0x006a:
            android.content.Context r0 = com.inmobi.media.C6227ho.m18551c()
            if (r0 != 0) goto L_0x0076
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x00cd
        L_0x0076:
            java.lang.String r2 = "phone"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = r0.getNetworkOperator()
            int[] r3 = m18792b(r3)
            r4 = r3[r4]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3 = r3[r1]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 17
            if (r5 < r6) goto L_0x00c6
            java.util.List r5 = r0.getAllCellInfo()
            if (r5 == 0) goto L_0x00c6
            java.util.Iterator r5 = r5.iterator()
        L_0x00a7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c6
            java.lang.Object r6 = r5.next()
            android.telephony.CellInfo r6 = (android.telephony.CellInfo) r6
            boolean r7 = r6.isRegistered()
            if (r7 != 0) goto L_0x00a7
            com.inmobi.media.iy r7 = new com.inmobi.media.iy
            int r8 = m18787a((android.telephony.TelephonyManager) r0)
            r7.<init>(r6, r4, r3, r8)
            r2.add(r7)
            goto L_0x00a7
        L_0x00c6:
            r0 = r2
            goto L_0x00cd
        L_0x00c8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x00cd:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x00f8
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            int r4 = r0.size()
            int r4 = r4 - r1
            java.lang.Object r0 = r0.get(r4)
            com.inmobi.media.iy r0 = (com.inmobi.media.C6284iy) r0
            org.json.JSONObject r0 = r0.mo35496a()
            r3.put(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "v-sc"
            r2.put(r1, r0)
        L_0x00f8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6285iz.m18791b():java.util.Map");
    }
}
