package com.ogury.p376ed.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smaato.sdk.video.vast.model.Creative;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.hg */
public final class C10586hg {

    /* renamed from: a */
    public static final C10586hg f26712a = new C10586hg();

    /* renamed from: b */
    private static final Map<String, C10730lk<C10585hf, C10684ke>> f26713b = Collections.synchronizedMap(new LinkedHashMap());

    private C10586hg() {
    }

    /* renamed from: a */
    public static void m32205a(String str, C10730lk<? super C10585hf, C10684ke> lkVar) {
        C10765mq.m32773b(str, Creative.AD_ID);
        C10765mq.m32773b(lkVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Map<String, C10730lk<C10585hf, C10684ke>> map = f26713b;
        C10765mq.m32770a((Object) map, "listeners");
        map.put(str, lkVar);
    }

    /* renamed from: a */
    public static void m32203a(C10585hf hfVar) {
        C10765mq.m32773b(hfVar, "event");
        C10730lk lkVar = f26713b.get(hfVar.mo67538b());
        if (lkVar != null) {
            lkVar.mo66961a(hfVar);
        }
    }

    /* renamed from: a */
    public static void m32204a(String str) {
        C10765mq.m32773b(str, Creative.AD_ID);
        f26713b.remove(str);
    }
}
