package com.ogury.p376ed.internal;

import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.hp */
public final class C10598hp {

    /* renamed from: a */
    private final Map<String, C10660jh> f26741a;

    /* renamed from: b */
    private final Map<String, C10611hx> f26742b;

    public C10598hp(Map<String, C10660jh> map, Map<String, C10611hx> map2) {
        C10765mq.m32773b(map, "webViewsMap");
        C10765mq.m32773b(map2, "webViewStates");
        this.f26741a = map;
        this.f26742b = map2;
    }

    /* renamed from: e */
    private final List<C10660jh> m32262e() {
        List<C10660jh> arrayList = new ArrayList<>();
        for (C10660jh next : this.f26741a.values()) {
            C10611hx hxVar = this.f26742b.get(C10594hn.m32229b(next));
            if (hxVar != null && hxVar.mo67600d()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo67563a() {
        for (C10660jh d : m32262e()) {
            d.mo67691d();
        }
    }

    /* renamed from: a */
    public final void mo67564a(String str, boolean z, boolean z2, String str2, String str3, String str4) {
        C10765mq.m32773b(str, "event");
        C10765mq.m32773b(str2, "webViewId");
        C10765mq.m32773b(str3, "url");
        C10765mq.m32773b(str4, "pageTitle");
        for (C10660jh a : m32262e()) {
            C10582hc hcVar = C10582hc.f26707a;
            C10663jk.m32606a(a, C10582hc.m32185a(str, z, z2, str2, str3, str4));
        }
    }

    /* renamed from: b */
    public final void mo67565b() {
        for (C10660jh a : m32262e()) {
            C10582hc hcVar = C10582hc.f26707a;
            C10663jk.m32606a(a, C10582hc.m32188b());
        }
    }

    /* renamed from: c */
    public final void mo67566c() {
        for (C10660jh e : m32262e()) {
            e.mo67692e();
        }
    }

    /* renamed from: a */
    public static void m32261a(C10660jh jhVar, String str, String str2) {
        C10765mq.m32773b(jhVar, "webView");
        C10765mq.m32773b(str, TJAdUnitConstants.String.CALLBACK_ID);
        C10765mq.m32773b(str2, "webViewId");
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32192b(str, "{webviewId:\"" + str2 + "\"}"));
    }

    /* renamed from: d */
    public final boolean mo67567d() {
        Iterable<C10611hx> values = this.f26742b.values();
        if ((values instanceof Collection) && ((Collection) values).isEmpty()) {
            return true;
        }
        for (C10611hx b : values) {
            if (b.mo67598b()) {
                return false;
            }
        }
        return true;
    }
}
