package com.ogury.p376ed.internal;

import android.widget.FrameLayout;
import com.smaato.sdk.video.vast.model.C11286Ad;

/* renamed from: com.ogury.ed.internal.av */
public final class C10343av {

    /* renamed from: a */
    private final C10491ej f26213a;

    /* renamed from: b */
    private final FrameLayout f26214b;

    /* renamed from: c */
    private final C10546g f26215c;

    /* renamed from: d */
    private final C10318aj f26216d;

    public C10343av(C10491ej ejVar, FrameLayout frameLayout, C10546g gVar, C10318aj ajVar) {
        C10765mq.m32773b(ejVar, C11286Ad.AD_TYPE);
        C10765mq.m32773b(frameLayout, "parent");
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(ajVar, "adController");
        this.f26213a = ejVar;
        this.f26214b = frameLayout;
        this.f26215c = gVar;
        this.f26216d = ajVar;
    }

    /* renamed from: a */
    public final C10491ej mo67082a() {
        return this.f26213a;
    }

    /* renamed from: b */
    public final FrameLayout mo67083b() {
        return this.f26214b;
    }

    /* renamed from: c */
    public final C10546g mo67084c() {
        return this.f26215c;
    }

    /* renamed from: d */
    public final C10318aj mo67085d() {
        return this.f26216d;
    }
}
