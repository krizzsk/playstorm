package com.iab.omid.library.fyber.p244a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.fyber.a.d */
public final class C7785d extends ContentObserver {

    /* renamed from: a */
    private final Context f18528a;

    /* renamed from: b */
    private final AudioManager f18529b;

    /* renamed from: c */
    private final C7782a f18530c;

    /* renamed from: d */
    private final C7784c f18531d;

    /* renamed from: e */
    private float f18532e;

    public C7785d(Handler handler, Context context, C7782a aVar, C7784c cVar) {
        super(handler);
        this.f18528a = context;
        this.f18529b = (AudioManager) context.getSystemService("audio");
        this.f18530c = aVar;
        this.f18531d = cVar;
    }

    /* renamed from: a */
    private boolean m21819a(float f) {
        return f != this.f18532e;
    }

    /* renamed from: c */
    private float m21820c() {
        return this.f18530c.mo54921a(this.f18529b.getStreamVolume(3), this.f18529b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m21821d() {
        this.f18531d.mo54923a(this.f18532e);
    }

    /* renamed from: a */
    public void mo54924a() {
        this.f18532e = m21820c();
        m21821d();
        this.f18528a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo54925b() {
        this.f18528a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m21820c();
        if (m21819a(c)) {
            this.f18532e = c;
            m21821d();
        }
    }
}
