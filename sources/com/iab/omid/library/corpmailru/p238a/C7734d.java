package com.iab.omid.library.corpmailru.p238a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.corpmailru.a.d */
public final class C7734d extends ContentObserver {

    /* renamed from: a */
    private final Context f18415a;

    /* renamed from: b */
    private final AudioManager f18416b;

    /* renamed from: c */
    private final C7731a f18417c;

    /* renamed from: d */
    private final C7733c f18418d;

    /* renamed from: e */
    private float f18419e;

    public C7734d(Handler handler, Context context, C7731a aVar, C7733c cVar) {
        super(handler);
        this.f18415a = context;
        this.f18416b = (AudioManager) context.getSystemService("audio");
        this.f18417c = aVar;
        this.f18418d = cVar;
    }

    /* renamed from: a */
    private boolean m21595a(float f) {
        return f != this.f18419e;
    }

    /* renamed from: c */
    private float m21596c() {
        return this.f18417c.mo54727a(this.f18416b.getStreamVolume(3), this.f18416b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m21597d() {
        this.f18418d.mo54729a(this.f18419e);
    }

    /* renamed from: a */
    public void mo54730a() {
        this.f18419e = m21596c();
        m21597d();
        this.f18415a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo54731b() {
        this.f18415a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m21596c();
        if (m21595a(c)) {
            this.f18419e = c;
            m21597d();
        }
    }
}
