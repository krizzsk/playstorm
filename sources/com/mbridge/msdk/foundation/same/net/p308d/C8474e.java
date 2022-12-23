package com.mbridge.msdk.foundation.same.net.p308d;

import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.C8498i;
import java.io.UnsupportedEncodingException;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.e */
/* compiled from: JsonRequest */
public abstract class C8474e<T> extends C8498i<T> {

    /* renamed from: c */
    private static final String f20481c = C8474e.class.getSimpleName();

    /* renamed from: d */
    private final String f20482d;

    public C8474e(int i, String str, String str2, C8476e<T> eVar) {
        super(i, str, eVar);
        this.f20482d = str2;
    }

    /* renamed from: e */
    public final byte[] mo57578e() {
        try {
            if (this.f20482d == null) {
                return null;
            }
            return this.f20482d.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
