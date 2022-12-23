package com.iab.omid.library.inmobi.p250a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.inmobi.a.d */
public final class C7836d extends ContentObserver {

    /* renamed from: a */
    private final Context f18645a;

    /* renamed from: b */
    private final AudioManager f18646b;

    /* renamed from: c */
    private final C7833a f18647c;

    /* renamed from: d */
    private final C7835c f18648d;

    /* renamed from: e */
    private float f18649e;

    public C7836d(Handler handler, Context context, C7833a aVar, C7835c cVar) {
        super(handler);
        this.f18645a = context;
        this.f18646b = (AudioManager) context.getSystemService("audio");
        this.f18647c = aVar;
        this.f18648d = cVar;
    }

    /* renamed from: a */
    private boolean m22049a(float f) {
        return f != this.f18649e;
    }

    /* renamed from: c */
    private float m22050c() {
        return this.f18647c.mo55120a(this.f18646b.getStreamVolume(3), this.f18646b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m22051d() {
        this.f18648d.mo55122a(this.f18649e);
    }

    /* renamed from: a */
    public void mo55123a() {
        this.f18649e = m22050c();
        m22051d();
        this.f18645a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo55124b() {
        this.f18645a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m22050c();
        if (m22049a(c)) {
            this.f18649e = c;
            m22051d();
        }
    }
}
