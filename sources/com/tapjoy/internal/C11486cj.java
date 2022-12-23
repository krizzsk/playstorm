package com.tapjoy.internal;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: com.tapjoy.internal.cj */
public final class C11486cj extends ContentObserver {

    /* renamed from: a */
    public final Context f27756a;

    /* renamed from: b */
    public float f27757b;

    /* renamed from: c */
    private final AudioManager f27758c;

    /* renamed from: d */
    private final C11483cg f27759d;

    /* renamed from: e */
    private final C11485ci f27760e;

    public C11486cj(Handler handler, Context context, C11483cg cgVar, C11485ci ciVar) {
        super(handler);
        this.f27756a = context;
        this.f27758c = (AudioManager) context.getSystemService("audio");
        this.f27759d = cgVar;
        this.f27760e = ciVar;
    }

    /* renamed from: a */
    public final float mo72277a() {
        return C11483cg.m33388a(this.f27758c.getStreamVolume(3), this.f27758c.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    public final void mo72278b() {
        this.f27760e.mo72276a(this.f27757b);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float a = mo72277a();
        if (a != this.f27757b) {
            this.f27757b = a;
            mo72278b();
        }
    }
}
