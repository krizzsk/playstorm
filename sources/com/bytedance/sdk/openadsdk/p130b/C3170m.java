package com.bytedance.sdk.openadsdk.p130b;

import android.content.Context;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.bytedance.sdk.openadsdk.b.m */
/* compiled from: HighPriorityEventRepertoryImpl */
public class C3170m extends C3160g {
    /* renamed from: d */
    public String mo18761d() {
        return "loghighpriority";
    }

    public C3170m(Context context) {
        super(context);
    }

    /* renamed from: f */
    public static String m9273f() {
        return "CREATE TABLE IF NOT EXISTS " + "loghighpriority" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + "value" + " TEXT ," + "gen_time" + " TEXT , " + TapjoyConstants.TJC_RETRY + " INTEGER default 0" + ")";
    }
}
