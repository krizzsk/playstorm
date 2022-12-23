package com.bytedance.mobsec.metasec.p089ov;

import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import p398ms.p399bd.p400o.Pgl.C12410r0;
import p398ms.p399bd.p400o.Pgl.C12414t0;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: com.bytedance.mobsec.metasec.ov.pgla */
public class pgla {

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pblb */
    static class pblb extends pblb.pgla {
        pblb() {
        }

        /* renamed from: a */
        public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
            return "";
        }
    }

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pblc */
    static class pblc extends pblb.pgla {
        pblc() {
        }

        /* renamed from: a */
        public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
            return C12414t0.m34786c();
        }
    }

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pbld */
    static class pbld extends pblb.pgla {
        pbld() {
        }

        /* renamed from: a */
        public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
            return "";
        }
    }

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pgla  reason: collision with other inner class name */
    static class C12473pgla extends pblb.pgla {
        C12473pgla() {
        }

        /* renamed from: a */
        public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
            int i2;
            try {
                Display defaultDisplay = ((WindowManager) p398ms.p399bd.p400o.Pgl.pgla.m34772a().mo76482b().getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                if (Build.VERSION.SDK_INT >= 17) {
                    defaultDisplay.getRealSize(point);
                } else if (Build.VERSION.SDK_INT >= 13) {
                    defaultDisplay.getSize(point);
                } else {
                    C12410r0.f29428a = defaultDisplay.getWidth();
                    i2 = defaultDisplay.getHeight();
                    C12410r0.f29429b = i2;
                    return C12410r0.f29428a + "*" + C12410r0.f29429b;
                }
                C12410r0.f29428a = point.x;
                i2 = point.y;
                C12410r0.f29429b = i2;
            } catch (Throwable unused) {
            }
            return C12410r0.f29428a + "*" + C12410r0.f29429b;
        }
    }

    /* renamed from: a */
    public static void m6460a() {
        p398ms.p399bd.p400o.Pgl.pblb.m34700a(268435457, (pblb.pgla) new C12473pgla());
        p398ms.p399bd.p400o.Pgl.pblb.m34700a(268435463, (pblb.pgla) new pblb());
        p398ms.p399bd.p400o.Pgl.pblb.m34700a(268435462, (pblb.pgla) new pblc());
        p398ms.p399bd.p400o.Pgl.pblb.m34700a(268435464, (pblb.pgla) new pbld());
    }
}
