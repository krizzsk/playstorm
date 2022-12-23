package com.iab.omid.library.fyber.p245b;

import android.view.View;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.p248e.C7810a;

/* renamed from: com.iab.omid.library.fyber.b.c */
public class C7792c {

    /* renamed from: a */
    private final C7810a f18557a;

    /* renamed from: b */
    private final String f18558b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f18559c;

    /* renamed from: d */
    private final String f18560d;

    public C7792c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f18557a = new C7810a(view);
        this.f18558b = view.getClass().getCanonicalName();
        this.f18559c = friendlyObstructionPurpose;
        this.f18560d = str;
    }

    /* renamed from: a */
    public C7810a mo55019a() {
        return this.f18557a;
    }

    /* renamed from: b */
    public String mo55020b() {
        return this.f18558b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose mo55021c() {
        return this.f18559c;
    }

    /* renamed from: d */
    public String mo55022d() {
        return this.f18560d;
    }
}
