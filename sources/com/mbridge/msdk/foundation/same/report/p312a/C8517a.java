package com.mbridge.msdk.foundation.same.report.p312a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8406g;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2380k;
import com.mbridge.msdk.foundation.tools.C8596q;

/* renamed from: com.mbridge.msdk.foundation.same.report.a.a */
/* compiled from: CampaignRequestTimeUtil */
public final class C8517a {

    /* renamed from: a */
    private C8406g f20636a;

    /* renamed from: b */
    private C2376g f20637b = null;

    /* renamed from: c */
    private Context f20638c;

    public C8517a(C8406g gVar) {
        Context context;
        this.f20636a = gVar;
        Context g = C2350a.m5601e().mo15792g();
        this.f20638c = g;
        this.f20637b = C2376g.m5723a(g);
        if (this.f20636a != null && (context = this.f20638c) != null) {
            int n = C8596q.m24849n(context);
            this.f20636a.mo57366d(n);
            this.f20636a.mo57364c(C8596q.m24818a(this.f20638c, n));
        }
    }

    /* renamed from: a */
    public final void mo57675a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f20636a.mo57358a(str);
        }
    }

    /* renamed from: a */
    public final void mo57674a(int i) {
        C8406g gVar = this.f20636a;
        if (gVar != null) {
            gVar.mo57360b(i);
        }
    }

    /* renamed from: b */
    public final void mo57676b(int i) {
        C8406g gVar = this.f20636a;
        if (gVar != null) {
            gVar.mo57363c(i);
        }
    }

    /* renamed from: a */
    public final void mo57673a() {
        if (this.f20636a != null) {
            C2380k.m5747a((C2374f) this.f20637b).mo15913a(this.f20636a);
        }
    }

    /* renamed from: b */
    public final void mo57677b(String str) {
        C8406g gVar = this.f20636a;
        if (gVar != null) {
            gVar.mo57361b(str);
        }
    }

    /* renamed from: c */
    public final void mo57678c(int i) {
        C8406g gVar = this.f20636a;
        if (gVar != null) {
            gVar.mo57357a(i);
        }
    }
}
