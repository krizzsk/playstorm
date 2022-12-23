package com.ironsource.sdk.p286a;

import android.util.Log;
import com.ironsource.p197a.C6375a;
import com.ironsource.p197a.C6377b;
import com.ironsource.sdk.p286a.C8156f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.a.d */
public final class C8154d {

    /* renamed from: a */
    private static C8154d f19416a;

    /* renamed from: b */
    private C6377b f19417b;

    private C8154d() {
    }

    /* renamed from: a */
    private static C8154d m23439a() {
        if (f19416a == null) {
            f19416a = new C8154d();
        }
        return f19416a;
    }

    /* renamed from: a */
    public static void m23440a(C6375a aVar, C8151b bVar) {
        if (aVar != null) {
            try {
                m23439a().f19417b = new C6377b(aVar, bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m23441a(C8156f.C8157a aVar) {
        m23442a(aVar, (Map<String, Object>) new HashMap());
    }

    /* renamed from: a */
    public static void m23442a(C8156f.C8157a aVar, Map<String, Object> map) {
        C6377b bVar = m23439a().f19417b;
        if (bVar == null) {
            Log.d("sdk5Events", "logEvent failed eventsTracker doesn't exist");
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f19441b));
        }
        bVar.mo35770a(aVar.f19440a, map);
    }
}
