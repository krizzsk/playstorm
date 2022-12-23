package com.mbridge.msdk.video.dynview;

import com.mbridge.msdk.video.dynview.p353d.C9260d;
import com.mbridge.msdk.video.dynview.p359h.C9286a;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.b */
/* compiled from: MBUIController */
public class C9249b {

    /* renamed from: a */
    private static volatile C9249b f22405a;

    private C9249b() {
    }

    /* renamed from: a */
    public static C9249b m26477a() {
        C9249b bVar;
        if (f22405a != null) {
            return f22405a;
        }
        synchronized (C9249b.class) {
            if (f22405a == null) {
                f22405a = new C9249b();
            }
            bVar = f22405a;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo62361a(C9252c cVar, C9260d dVar) {
        new C9286a(cVar, dVar, (Map<String, Object>) null);
    }
}
