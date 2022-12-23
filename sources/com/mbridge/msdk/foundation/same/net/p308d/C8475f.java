package com.mbridge.msdk.foundation.same.net.p308d;

import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.C8498i;
import com.mbridge.msdk.foundation.same.net.C8501k;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p309e.C8479c;
import com.mbridge.msdk.foundation.same.net.p310f.C8482b;
import com.mbridge.msdk.foundation.tools.C8608u;
import java.io.UnsupportedEncodingException;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.f */
/* compiled from: StringRequest */
public class C8475f extends C8498i<String> {

    /* renamed from: c */
    private static final String f20483c = C8475f.class.getSimpleName();

    /* renamed from: d */
    private String f20484d;

    public C8475f(int i, String str, String str2, C8476e<String> eVar) {
        super(i, str, eVar);
        this.f20484d = str2;
    }

    /* renamed from: e */
    public final byte[] mo57578e() {
        try {
            if (this.f20484d == null) {
                return null;
            }
            return this.f20484d.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C8501k<String> mo57571a(C8479c cVar) {
        try {
            return C8501k.m24570a(new String(cVar.f20492b, C8482b.m24482a(cVar.f20494d)), cVar);
        } catch (UnsupportedEncodingException e) {
            C8608u.m24884d(f20483c, e.getMessage());
            return C8501k.m24569a(new C8452a(8, cVar));
        }
    }
}
