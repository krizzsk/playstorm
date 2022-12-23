package com.iab.omid.library.smaato.p274a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.smaato.a.d */
public final class C8037d extends ContentObserver {

    /* renamed from: a */
    private final Context f19110a;

    /* renamed from: b */
    private final AudioManager f19111b;

    /* renamed from: c */
    private final C8034a f19112c;

    /* renamed from: d */
    private final C8036c f19113d;

    /* renamed from: e */
    private float f19114e;

    public C8037d(Handler handler, Context context, C8034a aVar, C8036c cVar) {
        super(handler);
        this.f19110a = context;
        this.f19111b = (AudioManager) context.getSystemService("audio");
        this.f19112c = aVar;
        this.f19113d = cVar;
    }

    /* renamed from: a */
    private boolean m22953a(float f) {
        return f != this.f19114e;
    }

    /* renamed from: c */
    private float m22954c() {
        return this.f19112c.mo55913a(this.f19111b.getStreamVolume(3), this.f19111b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m22955d() {
        this.f19113d.mo55915a(this.f19114e);
    }

    /* renamed from: a */
    public void mo55916a() {
        this.f19114e = m22954c();
        m22955d();
        this.f19110a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo55917b() {
        this.f19110a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m22954c();
        if (m22953a(c)) {
            this.f19114e = c;
            m22955d();
        }
    }
}
