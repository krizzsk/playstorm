package com.bytedance.sdk.openadsdk.p176i.p177a;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.C2962d;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.i.a.b */
/* compiled from: GifRequestResult */
public class C3850b {

    /* renamed from: a */
    int f9959a;

    /* renamed from: b */
    private byte[] f9960b = null;

    /* renamed from: c */
    private Bitmap f9961c = null;

    /* renamed from: d */
    private List<Object> f9962d = null;

    /* renamed from: e */
    private Map<String, String> f9963e = null;

    public C3850b(byte[] bArr, int i) {
        this.f9960b = bArr;
        this.f9959a = i;
    }

    public C3850b(Bitmap bitmap, int i) {
        this.f9961c = bitmap;
        this.f9959a = i;
    }

    /* renamed from: a */
    public Bitmap mo20695a() {
        return this.f9961c;
    }

    /* renamed from: b */
    public byte[] mo20696b() {
        try {
            if (this.f9960b == null) {
                this.f9960b = C2962d.m8348a(this.f9961c);
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        return this.f9960b;
    }

    /* renamed from: c */
    public boolean mo20697c() {
        if (this.f9961c != null) {
            return true;
        }
        byte[] bArr = this.f9960b;
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        return true;
    }
}
