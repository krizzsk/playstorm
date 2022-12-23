package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.share.internal.ShareInternalUtility;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.m */
public final class C5003m implements C4996g {

    /* renamed from: a */
    public final C4996g f13349a;

    /* renamed from: b */
    public final C4996g f13350b;

    /* renamed from: c */
    public final C4996g f13351c;

    /* renamed from: d */
    public final C4996g f13352d;

    /* renamed from: e */
    public C4996g f13353e;

    public C5003m(Context context, C4970a0<? super C4996g> a0Var, C4996g gVar) {
        this.f13349a = (C4996g) C5023a.m15300a(gVar);
        this.f13350b = new C5007q(a0Var);
        this.f13351c = new C4972c(context, a0Var);
        this.f13352d = new C4992e(context, a0Var);
    }

    /* renamed from: a */
    public long mo24831a(C5000j jVar) throws IOException {
        boolean z = true;
        C5023a.m15304b(this.f13353e == null);
        String scheme = jVar.f13327a.getScheme();
        Uri uri = jVar.f13327a;
        int i = C5049u.f13471a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !scheme2.equals(ShareInternalUtility.STAGING_PARAM)) {
            z = false;
        }
        if (z) {
            if (jVar.f13327a.getPath().startsWith("/android_asset/")) {
                this.f13353e = this.f13351c;
            } else {
                this.f13353e = this.f13350b;
            }
        } else if ("asset".equals(scheme)) {
            this.f13353e = this.f13351c;
        } else if ("content".equals(scheme)) {
            this.f13353e = this.f13352d;
        } else {
            this.f13353e = this.f13349a;
        }
        return this.f13353e.mo24831a(jVar);
    }

    public void close() throws IOException {
        C4996g gVar = this.f13353e;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.f13353e = null;
            }
        }
    }

    /* renamed from: a */
    public int mo24830a(byte[] bArr, int i, int i2) throws IOException {
        return this.f13353e.mo24830a(bArr, i, i2);
    }

    /* renamed from: a */
    public Uri mo24832a() {
        C4996g gVar = this.f13353e;
        if (gVar == null) {
            return null;
        }
        return gVar.mo24832a();
    }
}
