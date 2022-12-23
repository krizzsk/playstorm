package com.bytedance.sdk.openadsdk.p130b;

import android.content.Context;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.bytedance.sdk.openadsdk.b.q */
/* compiled from: StatsBatchEventRepertoryImpl */
public class C3181q extends C3183s {
    /* renamed from: c */
    public String mo18803c() {
        return "logstatsbatch";
    }

    public C3181q(Context context) {
        super(context);
    }

    /* renamed from: b */
    public int mo18758b() {
        return this.f7543a.mo19459b("stats_serverbusy_retrycount", 0);
    }

    /* renamed from: a */
    public void mo18751a(int i) {
        this.f7543a.mo19455a("stats_serverbusy_retrycount", i);
    }

    /* renamed from: d */
    public static String m9312d() {
        return "CREATE TABLE IF NOT EXISTS " + "logstatsbatch" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + "value" + " TEXT ," + "gen_time" + " TEXT , " + TapjoyConstants.TJC_RETRY + " INTEGER default 0" + ")";
    }
}
