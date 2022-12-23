package com.apm.insight.p011b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.C1176b;
import com.apm.insight.C1211e;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1312r;
import com.apm.insight.p023l.C1316v;
import org.json.JSONObject;

/* renamed from: com.apm.insight.b.d */
public class C1183d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f969a = null;

    /* renamed from: b */
    private static long f970b = -1;

    /* renamed from: c */
    private static boolean f971c = false;

    /* renamed from: d */
    private static FileObserver f972d;

    /* renamed from: e */
    private static ActivityManager.ProcessErrorStateInfo f973e;

    /* renamed from: a */
    static String m1287a(Context context, int i) {
        if (C1312r.m1882a(256)) {
            f971c = false;
            return "TEST_ANR_INFO";
        } else if (SystemClock.uptimeMillis() - f970b < 5000) {
            return null;
        } else {
            try {
                ActivityManager.ProcessErrorStateInfo a = C1285a.m1716a(context, i);
                if (a != null && Process.myPid() == a.pid) {
                    if (f973e != null && C1177a.m1252a(f973e, a)) {
                        return null;
                    }
                    f973e = a;
                    f969a = null;
                    f970b = SystemClock.uptimeMillis();
                    f971c = false;
                    return C1177a.m1251a(a);
                }
            } catch (Throwable unused) {
            }
            String str = f969a;
            if (str == null) {
                return null;
            }
            f971c = true;
            f969a = null;
            f970b = SystemClock.uptimeMillis();
            return str;
        }
    }

    /* renamed from: a */
    public static JSONObject m1289a(boolean z) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", C1316v.m1906a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m1290a(final String str, final C1211e eVar) {
        FileObserver fileObserver = f972d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        C11841 r0 = new FileObserver(136, str) {
            public void onEvent(int i, String str) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        String unused = C1183d.f969a = eVar.mo12223a(str, str);
                    } catch (Throwable th) {
                        C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                    }
                }
            }
        };
        f972d = r0;
        r0.startWatching();
    }

    /* renamed from: a */
    public static boolean m1291a() {
        return f971c;
    }

    /* renamed from: b */
    public static void m1292b() {
        f973e = null;
    }
}
