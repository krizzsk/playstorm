package com.ogury.sdk.internal;

import android.content.SharedPreferences;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ogury.sdk.internal.i */
/* compiled from: MonitoringInfoStorage.kt */
public final class C10860i {

    /* renamed from: a */
    private final SharedPreferences f27089a;

    /* renamed from: b */
    private final C10857g f27090b;

    static {
        new C10861a((byte) 0);
    }

    public C10860i(C10863k kVar, C10857g gVar) {
        C10865m.m32951b(kVar, "sharedPreferencesCreator");
        C10865m.m32951b(gVar, "monitoringInfoJsonSerializer");
        this.f27090b = gVar;
        this.f27089a = kVar.mo67931a("ogury_monitoring_info_file");
    }

    /* renamed from: a */
    public final C10850b mo67928a() {
        String str = "";
        try {
            String string = this.f27089a.getString("mInfo", str);
            if (string != null) {
                str = string;
            }
            C10865m.m32949a((Object) str, "sharedPreferences.getString(SP_KEY, \"\") ?: \"\"");
            C10865m.m32951b(str, "jsonString");
            C10850b bVar = new C10850b();
            if (!(str.length() == 0)) {
                C10865m.m32951b(str, "jsonString");
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bVar.mo67909a(next, jSONObject.getString(next));
                }
            }
            return bVar;
        } catch (Exception unused) {
            return new C10850b();
        }
    }

    /* renamed from: a */
    public final void mo67929a(C10850b bVar) {
        if (bVar != null) {
            try {
                this.f27089a.edit().putString("mInfo", this.f27090b.mo67926a(bVar)).apply();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo67930b() {
        this.f27089a.edit().clear().apply();
    }

    /* renamed from: com.ogury.sdk.internal.i$a */
    /* compiled from: MonitoringInfoStorage.kt */
    public static final class C10861a {
        private C10861a() {
        }

        public /* synthetic */ C10861a(byte b) {
            this();
        }
    }
}
