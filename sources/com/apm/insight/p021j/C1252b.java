package com.apm.insight.p021j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.C1240h;
import com.apm.insight.entity.C1218b;
import com.apm.insight.runtime.C1363d;
import com.apm.insight.runtime.C1384p;
import com.apm.insight.runtime.C1389s;
import java.util.Map;

/* renamed from: com.apm.insight.j.b */
public class C1252b extends C1251a {

    /* renamed from: b */
    private static Runnable f1187b = new Runnable() {
        public void run() {
            C1384p.m2264b().mo12524a().removeCallbacks(this);
            C1384p.m2264b().mo12526a((Runnable) new C1252b(C1384p.m2264b().mo12524a(), 0, 30000, C1240h.m1558g()));
        }
    };

    /* renamed from: a */
    private Context f1188a;

    public C1252b(Handler handler, long j, long j2, Context context) {
        super(handler, j, j2);
        this.f1188a = context;
    }

    /* renamed from: d */
    public static void m1604d() {
        C1384p.m2264b().mo12527a(f1187b, 100);
    }

    public void run() {
        Map<String, Object> map;
        try {
            map = C1240h.m1542a().mo12491c().getCommonParams();
        } catch (Throwable unused) {
            map = null;
        }
        if (map != null) {
            try {
                if (C1363d.m2169a(map)) {
                    mo12313a(mo12315c());
                    return;
                }
            } catch (Throwable unused2) {
                return;
            }
        }
        C1389s.m2276a().mo12515a(map, C1218b.m1453b());
    }
}
