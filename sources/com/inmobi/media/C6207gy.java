package com.inmobi.media;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.gy */
/* compiled from: NetworkResponse */
public class C6207gy {

    /* renamed from: d */
    private static final String f15721d = C6207gy.class.getSimpleName();

    /* renamed from: a */
    public C6205gw f15722a;

    /* renamed from: b */
    public int f15723b;

    /* renamed from: c */
    public Map<String, List<String>> f15724c;

    /* renamed from: e */
    private String f15725e;

    /* renamed from: f */
    private byte[] f15726f;

    /* renamed from: a */
    public final boolean mo35396a() {
        return this.f15722a != null;
    }

    /* renamed from: b */
    public final String mo35397b() {
        if (this.f15725e == null) {
            this.f15725e = m18469b(this.f15726f);
        }
        return this.f15725e;
    }

    /* renamed from: b */
    private static String m18469b(byte[] bArr) {
        if (!(bArr == null || bArr.length == 0)) {
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return "";
    }

    /* renamed from: c */
    public final byte[] mo35398c() {
        byte[] bArr = this.f15726f;
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public final void mo35395a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.f15726f = new byte[0];
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f15726f = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    /* renamed from: d */
    public final long mo35399d() {
        try {
            if (this.f15725e != null) {
                return ((long) this.f15725e.length()) + 0;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }
}
