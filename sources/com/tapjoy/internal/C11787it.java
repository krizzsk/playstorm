package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.Map;

/* renamed from: com.tapjoy.internal.it */
public final class C11787it extends C11786is<C11788a> {

    /* renamed from: c */
    public final String f28760c;

    /* renamed from: d */
    public boolean f28761d = false;

    /* renamed from: e */
    private final C11714hj f28762e;

    /* renamed from: f */
    private final C11606fc f28763f;

    /* renamed from: g */
    private final C11588ew f28764g;

    /* renamed from: h */
    private final C11627fj f28765h;

    /* renamed from: i */
    private Context f28766i;

    /* renamed from: c */
    public final String mo72258c() {
        return "placement";
    }

    public C11787it(C11714hj hjVar, C11606fc fcVar, C11588ew ewVar, C11627fj fjVar, String str, Context context) {
        this.f28762e = hjVar;
        this.f28763f = fcVar;
        this.f28764g = ewVar;
        this.f28765h = fjVar;
        this.f28760c = str;
        this.f28766i = context;
    }

    /* renamed from: e */
    public final Map<String, Object> mo72260e() {
        Map<String, Object> e = super.mo72260e();
        e.put(TJAdUnitConstants.String.VIDEO_INFO, new C11451bg(C11748hz.m34135a(this.f28763f)));
        e.put(TapjoyConstants.TJC_APP_PLACEMENT, new C11451bg(C11748hz.m34131a(this.f28764g)));
        e.put("user", new C11451bg(C11748hz.m34136a(this.f28765h)));
        e.put("placement", this.f28760c);
        return e;
    }

    /* renamed from: com.tapjoy.internal.it$a */
    public static class C11788a {

        /* renamed from: a */
        public C11734hq f28767a;

        /* renamed from: b */
        public final List<String> f28768b;

        public C11788a(C11734hq hqVar, List<String> list) {
            this.f28767a = hqVar;
            this.f28768b = list;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo72253a(C11452bh bhVar) {
        bhVar.mo72223h();
        C11760ie ieVar = null;
        C11752ib ibVar = null;
        List list = null;
        while (bhVar.mo72225j()) {
            String l = bhVar.mo72227l();
            if ("interstitial".equals(l)) {
                ieVar = (C11760ie) bhVar.mo72208a(C11760ie.f28641n);
            } else if ("contextual_button".equals(l)) {
                ibVar = (C11752ib) bhVar.mo72208a(C11752ib.f28617d);
            } else if ("enabled_placements".equals(l)) {
                list = bhVar.mo72214c();
            } else {
                bhVar.mo72234s();
            }
        }
        bhVar.mo72224i();
        if (ieVar != null && (ieVar.mo72693a() || ieVar.mo72694b())) {
            return new C11788a(new C11728ho(this.f28762e, this.f28760c, ieVar, this.f28766i), list);
        }
        if (ibVar != null) {
            return new C11788a(new C11706hf(this.f28762e, this.f28760c, ibVar, this.f28766i), list);
        }
        return new C11788a(new C11733hp(), list);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo72261f() {
        C11788a aVar = (C11788a) super.mo72261f();
        if (!(aVar.f28767a instanceof C11733hp)) {
            aVar.f28767a.mo72592b();
            if (!aVar.f28767a.mo72593c()) {
                Object[] objArr = new Object[1];
                aVar.f28767a = new C11733hp();
            }
        }
        return aVar;
    }
}
