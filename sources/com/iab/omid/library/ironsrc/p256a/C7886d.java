package com.iab.omid.library.ironsrc.p256a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.ironsrc.a.d */
public final class C7886d extends ContentObserver {

    /* renamed from: a */
    private final Context f18758a;

    /* renamed from: b */
    private final AudioManager f18759b;

    /* renamed from: c */
    private final C7883a f18760c;

    /* renamed from: d */
    private final C7885c f18761d;

    /* renamed from: e */
    private float f18762e;

    public C7886d(Handler handler, Context context, C7883a aVar, C7885c cVar) {
        super(handler);
        this.f18758a = context;
        this.f18759b = (AudioManager) context.getSystemService("audio");
        this.f18760c = aVar;
        this.f18761d = cVar;
    }

    /* renamed from: a */
    private boolean m22273a(float f) {
        return f != this.f18762e;
    }

    /* renamed from: c */
    private float m22274c() {
        return this.f18760c.mo55314a(this.f18759b.getStreamVolume(3), this.f18759b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m22275d() {
        this.f18761d.mo55316a(this.f18762e);
    }

    /* renamed from: a */
    public final void mo55317a() {
        this.f18762e = m22274c();
        m22275d();
        this.f18758a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo55318b() {
        this.f18758a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m22274c();
        if (m22273a(c)) {
            this.f18762e = c;
            m22275d();
        }
    }
}
