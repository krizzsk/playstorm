package com.iab.omid.library.mmadbridge.p262a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.mmadbridge.a.d */
public final class C7936d extends ContentObserver {

    /* renamed from: a */
    private final Context f18872a;

    /* renamed from: b */
    private final AudioManager f18873b;

    /* renamed from: c */
    private final C7933a f18874c;

    /* renamed from: d */
    private final C7935c f18875d;

    /* renamed from: e */
    private float f18876e;

    public C7936d(Handler handler, Context context, C7933a aVar, C7935c cVar) {
        super(handler);
        this.f18872a = context;
        this.f18873b = (AudioManager) context.getSystemService("audio");
        this.f18874c = aVar;
        this.f18875d = cVar;
    }

    /* renamed from: a */
    private boolean m22494a(float f) {
        return f != this.f18876e;
    }

    /* renamed from: c */
    private float m22495c() {
        return this.f18874c.mo55500a(this.f18873b.getStreamVolume(3), this.f18873b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m22496d() {
        this.f18875d.mo55502a(this.f18876e);
    }

    /* renamed from: a */
    public void mo55503a() {
        this.f18876e = m22495c();
        m22496d();
        this.f18872a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo55504b() {
        this.f18872a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m22495c();
        if (m22494a(c)) {
            this.f18876e = c;
            m22496d();
        }
    }
}
