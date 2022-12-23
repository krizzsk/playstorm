package com.iab.omid.library.applovin.p232a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.applovin.a.d */
public final class C7684d extends ContentObserver {

    /* renamed from: a */
    private final Context f18298a;

    /* renamed from: b */
    private final AudioManager f18299b;

    /* renamed from: c */
    private final C7681a f18300c;

    /* renamed from: d */
    private final C7683c f18301d;

    /* renamed from: e */
    private float f18302e;

    public C7684d(Handler handler, Context context, C7681a aVar, C7683c cVar) {
        super(handler);
        this.f18298a = context;
        this.f18299b = (AudioManager) context.getSystemService("audio");
        this.f18300c = aVar;
        this.f18301d = cVar;
    }

    /* renamed from: a */
    private boolean m21365a(float f) {
        return f != this.f18302e;
    }

    /* renamed from: c */
    private float m21366c() {
        return this.f18300c.mo54528a(this.f18299b.getStreamVolume(3), this.f18299b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m21367d() {
        this.f18301d.mo54530a(this.f18302e);
    }

    /* renamed from: a */
    public void mo54531a() {
        this.f18302e = m21366c();
        m21367d();
        this.f18298a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo54532b() {
        this.f18298a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m21366c();
        if (m21365a(c)) {
            this.f18302e = c;
            m21367d();
        }
    }
}
