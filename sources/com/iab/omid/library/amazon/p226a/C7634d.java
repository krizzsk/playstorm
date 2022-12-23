package com.iab.omid.library.amazon.p226a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.amazon.a.d */
public final class C7634d extends ContentObserver {

    /* renamed from: a */
    private final Context f18181a;

    /* renamed from: b */
    private final AudioManager f18182b;

    /* renamed from: c */
    private final C7631a f18183c;

    /* renamed from: d */
    private final C7633c f18184d;

    /* renamed from: e */
    private float f18185e;

    public C7634d(Handler handler, Context context, C7631a aVar, C7633c cVar) {
        super(handler);
        this.f18181a = context;
        this.f18182b = (AudioManager) context.getSystemService("audio");
        this.f18183c = aVar;
        this.f18184d = cVar;
    }

    /* renamed from: a */
    private boolean m21135a(float f) {
        return f != this.f18185e;
    }

    /* renamed from: c */
    private float m21136c() {
        return this.f18183c.mo54329a(this.f18182b.getStreamVolume(3), this.f18182b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m21137d() {
        this.f18184d.mo54331a(this.f18185e);
    }

    /* renamed from: a */
    public void mo54332a() {
        this.f18185e = m21136c();
        m21137d();
        this.f18181a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo54333b() {
        this.f18181a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m21136c();
        if (m21135a(c)) {
            this.f18185e = c;
            m21137d();
        }
    }
}
