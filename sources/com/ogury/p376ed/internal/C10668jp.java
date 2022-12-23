package com.ogury.p376ed.internal;

import android.content.Context;
import com.iab.omid.library.oguryco.Omid;

/* renamed from: com.ogury.ed.internal.jp */
public final class C10668jp {

    /* renamed from: a */
    public static final C10668jp f26926a = new C10668jp();

    private C10668jp() {
    }

    /* renamed from: a */
    public static void m32617a(Context context) {
        C10765mq.m32773b(context, "context");
        try {
            Omid.activate(context.getApplicationContext());
        } catch (IllegalArgumentException e) {
            C10667jo joVar = C10667jo.f26924a;
            C10667jo.m32616a(e);
        }
    }

    /* renamed from: a */
    public static boolean m32618a() {
        return Omid.isActive();
    }

    /* renamed from: b */
    public static C10669jq m32619b() {
        return new C10669jq();
    }
}
