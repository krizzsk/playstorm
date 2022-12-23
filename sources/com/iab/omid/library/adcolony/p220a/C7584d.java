package com.iab.omid.library.adcolony.p220a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.adcolony.a.d */
public final class C7584d extends ContentObserver {

    /* renamed from: a */
    private final Context f18064a;

    /* renamed from: b */
    private final AudioManager f18065b;

    /* renamed from: c */
    private final C7581a f18066c;

    /* renamed from: d */
    private final C7583c f18067d;

    /* renamed from: e */
    private float f18068e;

    public C7584d(Handler handler, Context context, C7581a aVar, C7583c cVar) {
        super(handler);
        this.f18064a = context;
        this.f18065b = (AudioManager) context.getSystemService("audio");
        this.f18066c = aVar;
        this.f18067d = cVar;
    }

    /* renamed from: a */
    private boolean m20905a(float f) {
        return f != this.f18068e;
    }

    /* renamed from: c */
    private float m20906c() {
        return this.f18066c.mo54130a(this.f18065b.getStreamVolume(3), this.f18065b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m20907d() {
        this.f18067d.mo54132a(this.f18068e);
    }

    /* renamed from: a */
    public void mo54133a() {
        this.f18068e = m20906c();
        m20907d();
        this.f18064a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo54134b() {
        this.f18064a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m20906c();
        if (m20905a(c)) {
            this.f18068e = c;
            m20907d();
        }
    }
}
