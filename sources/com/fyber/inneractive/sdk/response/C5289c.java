package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C4273e;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.util.C5335g0;
import com.fyber.inneractive.sdk.util.C5350l;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.response.c */
public class C5289c extends C5288b {
    /* renamed from: a */
    public void mo24394a(String str, C4345y yVar) throws IOException {
        String str2;
        C5292f fVar = (C5292f) this.f14055a;
        if (str == null) {
            str2 = null;
        } else {
            str2 = C5335g0.f14191g.mo26450a(str);
        }
        int i = C4273e.f10606a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
        if (!TextUtils.isEmpty(property)) {
            String c = C5350l.m16766c(property);
            if (!TextUtils.isEmpty(c)) {
                str2 = c;
            }
        }
        fVar.f14092B = str2;
    }

    /* renamed from: b */
    public boolean mo24395b() {
        return true;
    }

    /* renamed from: a */
    public C5291e mo24393a() {
        C5292f fVar = new C5292f();
        this.f14055a = fVar;
        return fVar;
    }
}
