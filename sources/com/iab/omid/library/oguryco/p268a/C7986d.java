package com.iab.omid.library.oguryco.p268a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.oguryco.a.d */
public final class C7986d extends ContentObserver {

    /* renamed from: a */
    private final Context f18989a;

    /* renamed from: b */
    private final AudioManager f18990b;

    /* renamed from: c */
    private final C7983a f18991c;

    /* renamed from: d */
    private final C7985c f18992d;

    /* renamed from: e */
    private float f18993e;

    public C7986d(Handler handler, Context context, C7983a aVar, C7985c cVar) {
        super(handler);
        this.f18989a = context;
        this.f18990b = (AudioManager) context.getSystemService("audio");
        this.f18991c = aVar;
        this.f18992d = cVar;
    }

    /* renamed from: a */
    private boolean m22724a(float f) {
        return f != this.f18993e;
    }

    /* renamed from: c */
    private float m22725c() {
        return this.f18991c.mo55699a(this.f18990b.getStreamVolume(3), this.f18990b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m22726d() {
        this.f18992d.mo55701a(this.f18993e);
    }

    /* renamed from: a */
    public final void mo55702a() {
        this.f18993e = m22725c();
        m22726d();
        this.f18989a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo55703b() {
        this.f18989a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m22725c();
        if (m22724a(c)) {
            this.f18993e = c;
            m22726d();
        }
    }
}
