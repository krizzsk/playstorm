package com.mbridge.msdk.video.dynview.p351b;

import android.view.View;
import com.mbridge.msdk.video.dynview.C9252c;
import com.mbridge.msdk.video.dynview.p364j.C9310b;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.b.b */
/* compiled from: UIEnergize */
public class C9251b {

    /* renamed from: a */
    private static volatile C9251b f22407a;

    private C9251b() {
    }

    /* renamed from: a */
    public static C9251b m26481a() {
        C9251b bVar;
        if (f22407a != null) {
            return f22407a;
        }
        synchronized (C9251b.class) {
            if (f22407a == null) {
                f22407a = new C9251b();
            }
            bVar = f22407a;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo62363a(View view, C9252c cVar, Map<String, Object> map) {
        if (cVar != null) {
            int h = cVar.mo62371h();
            if (h == 1) {
                new C9310b().mo62506a(view);
            } else if (h == 102 || h == 202 || h == 302 || h == 802 || h == 904) {
                new C9310b().mo62507a(view, cVar);
            } else if (h == 3) {
                new C9310b().mo62508b(view, cVar);
            } else if (h == 4) {
                new C9310b().mo62509c(view, cVar);
            }
        }
    }
}
