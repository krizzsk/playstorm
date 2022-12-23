package com.ogury.p376ed.internal;

import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.bp */
public final class C10369bp {

    /* renamed from: a */
    public static final C10369bp f26259a = new C10369bp();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C10354bc f26260b = new C10354bc();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<String, Rect> f26261c = new LinkedHashMap();

    private C10369bp() {
    }

    /* renamed from: a */
    public static Rect m31378a(String str) {
        C10765mq.m32773b(str, "adUnitId");
        return f26261c.get(str);
    }

    /* renamed from: com.ogury.ed.internal.bp$a */
    static final class C10370a extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10546g f26262a;

        /* renamed from: b */
        final /* synthetic */ String f26263b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10370a(C10546g gVar, String str) {
            super(0);
            this.f26262a = gVar;
            this.f26263b = str;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31383b();
            return C10684ke.f26938a;
        }

        /* renamed from: b */
        private void m31383b() {
            C10354bc unused = C10369bp.f26260b;
            C10369bp.f26261c.put(this.f26263b, C10354bc.m31330a(this.f26262a));
        }
    }

    /* renamed from: a */
    public static void m31381a(C10546g gVar, String str) {
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(str, "adUnitId");
        gVar.setOnOverlayPositionChanged(new C10370a(gVar, str));
    }

    /* renamed from: a */
    public static Rect m31379a(String str, C10546g gVar) {
        C10765mq.m32773b(str, "adUnitId");
        C10765mq.m32773b(gVar, "adLayout");
        Rect a = m31378a(str);
        if (a == null) {
            return null;
        }
        Rect rect = new Rect(a);
        ViewGroup parentAsViewGroup = gVar.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            rect.top -= C10354bc.m31332c(parentAsViewGroup).top;
        }
        return rect;
    }
}
