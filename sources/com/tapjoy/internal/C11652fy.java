package com.tapjoy.internal;

import com.tapjoy.internal.C11676gi;

/* renamed from: com.tapjoy.internal.fy */
public final class C11652fy {

    /* renamed from: a */
    public C11644fs f28331a;

    /* renamed from: b */
    public volatile C11676gi.C11678a f28332b;

    /* renamed from: c */
    public int f28333c;

    /* renamed from: d */
    public volatile C11676gi.C11678a f28334d;

    /* renamed from: e */
    public volatile C11676gi.C11678a f28335e;

    /* renamed from: a */
    public final void mo72521a() {
        C11644fs fsVar = this.f28331a;
        if (fsVar != null) {
            fsVar.mo72518c();
        }
    }

    /* renamed from: b */
    public final void mo72523b() {
        mo72522a(16);
        C11676gi.C11678a aVar = this.f28334d;
        if (aVar != null) {
            this.f28334d = null;
            aVar.mo72569b().mo72572c();
        }
    }

    /* renamed from: a */
    public final synchronized void mo72522a(int i) {
        C11676gi.C11678a aVar = this.f28332b;
        if (aVar != null && this.f28333c < i) {
            int i2 = i | this.f28333c;
            this.f28333c = i2;
            aVar.mo72567a("state", (Object) Integer.valueOf(i2)).mo72569b().mo72572c();
        }
    }
}
