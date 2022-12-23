package com.iab.omid.library.vungle.p280a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.vungle.a.d */
public final class C8087d extends ContentObserver {

    /* renamed from: a */
    private final Context f19223a;

    /* renamed from: b */
    private final AudioManager f19224b;

    /* renamed from: c */
    private final C8084a f19225c;

    /* renamed from: d */
    private final C8086c f19226d;

    /* renamed from: e */
    private float f19227e;

    public C8087d(Handler handler, Context context, C8084a aVar, C8086c cVar) {
        super(handler);
        this.f19223a = context;
        this.f19224b = (AudioManager) context.getSystemService("audio");
        this.f19225c = aVar;
        this.f19226d = cVar;
    }

    /* renamed from: a */
    private boolean m23177a(float f) {
        return f != this.f19227e;
    }

    /* renamed from: c */
    private float m23178c() {
        return this.f19225c.mo56107a(this.f19224b.getStreamVolume(3), this.f19224b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m23179d() {
        this.f19226d.mo56109a(this.f19227e);
    }

    /* renamed from: a */
    public void mo56110a() {
        this.f19227e = m23178c();
        m23179d();
        this.f19223a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo56111b() {
        this.f19223a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m23178c();
        if (m23177a(c)) {
            this.f19227e = c;
            m23179d();
        }
    }
}
