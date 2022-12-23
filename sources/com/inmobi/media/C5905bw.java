package com.inmobi.media;

import com.inmobi.media.C5914cb;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bw */
/* compiled from: NativeCtaAsset */
public final class C5905bw extends C5914cb {

    /* renamed from: com.inmobi.media.bw$a */
    /* compiled from: NativeCtaAsset */
    public static class C5906a extends C5914cb.C5915a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5906a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, int i9, String str5, String[] strArr, C5916cc ccVar) {
            super(i, i2, i3, i4, i5, i6, i7, i8, str, str2, str3, str4, ccVar);
            String[] strArr2 = strArr;
            this.f14971l = i9;
            this.f14973n = Integer.MAX_VALUE;
            this.f14972m = str5.length() == 0 ? "#ff000000" : str5;
            int min = Math.min(strArr2.length, 1);
            this.f14974o = new String[min];
            System.arraycopy(strArr2, 0, this.f14974o, 0, min);
        }
    }

    C5905bw(String str, String str2, C5902bu buVar, String str3, byte b, JSONObject jSONObject) {
        this(str, str2, buVar, str3, new LinkedList(), b, jSONObject);
    }

    C5905bw(String str, String str2, C5902bu buVar, String str3, List<C5922cf> list, byte b, JSONObject jSONObject) {
        super(str, str2, "CTA", buVar, str3);
        mo34878a(list);
        if (jSONObject != null) {
            this.f14900i = b;
            this.f14897f = jSONObject;
        }
    }
}
