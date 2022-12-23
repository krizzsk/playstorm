package com.bytedance.sdk.openadsdk.component.reward.p144b;

import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3290c;
import com.bytedance.sdk.openadsdk.component.reward.view.C3389d;
import com.bytedance.sdk.openadsdk.core.p146b.C3432e;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.a */
/* compiled from: RewardFullAdType */
public abstract class C3322a {

    /* renamed from: a */
    protected Activity f7925a;

    /* renamed from: b */
    protected C3498n f7926b;

    /* renamed from: c */
    protected int f7927c;

    /* renamed from: d */
    protected int f7928d;

    /* renamed from: e */
    protected int f7929e;

    /* renamed from: f */
    protected float f7930f;

    /* renamed from: g */
    protected String f7931g;

    /* renamed from: h */
    protected C3432e f7932h;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.a$a */
    /* compiled from: RewardFullAdType */
    public interface C3323a {
        /* renamed from: a */
        void mo19177a(boolean z);
    }

    /* renamed from: a */
    public C3323a mo19168a() {
        return null;
    }

    /* renamed from: a */
    public abstract void mo19171a(FrameLayout frameLayout);

    /* renamed from: a */
    public abstract void mo19172a(C3290c cVar, C3389d dVar);

    /* renamed from: b */
    public abstract boolean mo19175b();

    /* renamed from: c */
    public abstract boolean mo19176c();

    public C3322a(Activity activity, C3498n nVar, int i, int i2) {
        this.f7925a = activity;
        this.f7926b = nVar;
        this.f7927c = i;
        this.f7928d = i2;
    }

    /* renamed from: a */
    public final void mo19170a(int i) {
        this.f7929e = i;
    }

    /* renamed from: a */
    public final void mo19169a(float f) {
        this.f7930f = f;
    }

    /* renamed from: a */
    public final void mo19174a(String str) {
        this.f7931g = str;
    }

    /* renamed from: a */
    public final void mo19173a(C3432e eVar) {
        this.f7932h = eVar;
    }
}
