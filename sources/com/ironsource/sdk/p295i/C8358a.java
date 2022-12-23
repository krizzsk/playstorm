package com.ironsource.sdk.p295i;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.controller.C8252x;
import com.ironsource.sdk.p289d.C8315b;
import com.ironsource.sdk.p293g.C8343d;
import com.ironsource.sdk.utils.C8392b;

/* renamed from: com.ironsource.sdk.i.a */
public final class C8358a {

    /* renamed from: com.ironsource.sdk.i.a$1 */
    static /* synthetic */ class C83591 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20076a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                int[] r0 = com.ironsource.sdk.p293g.C8343d.C8344a.m23923a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20076a = r0
                r1 = 1
                int r2 = com.ironsource.sdk.p293g.C8343d.C8344a.f20038a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f20076a     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.sdk.p293g.C8343d.C8344a.f20039b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r1 = f20076a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = com.ironsource.sdk.p293g.C8343d.C8344a.f20040c     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p295i.C8358a.C83591.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static boolean m23945a(Activity activity) {
        int parseInt = Integer.parseInt(C8392b.m24037a().f20136a.getString("back_button_state", "2"));
        if (C83591.f20076a[(parseInt == 0 ? C8343d.C8344a.f20038a : parseInt == 1 ? C8343d.C8344a.f20039b : C8343d.C8344a.f20040c) - 1] != 3) {
            return false;
        }
        try {
            C8252x xVar = (C8252x) C8315b.m23813a((Context) activity).f19914a.f19576a;
            if (xVar != null) {
                xVar.mo56622b(C8252x.m23704b("nativeNavigationPressed", C8252x.m23688a("action", "back", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
