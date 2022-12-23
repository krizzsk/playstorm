package com.apm.insight.p021j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.C1240h;
import com.apm.insight.p023l.C1311q;

/* renamed from: com.apm.insight.j.c */
public class C1254c extends C1251a {
    C1254c(Handler handler, long j, long j2) {
        super(handler, j, j2);
    }

    public void run() {
        String str;
        if (!C1240h.m1554c().mo12523b()) {
            String d = C1240h.m1542a().mo12492d();
            if (TextUtils.isEmpty(d) || "0".equals(d)) {
                mo12313a(mo12315c());
                str = "[DeviceIdTask] did is null, continue check.";
            } else {
                C1240h.m1554c().mo12522a(d);
                str = "[DeviceIdTask] did is " + d;
            }
            C1311q.m1870a((Object) str);
        }
    }
}
