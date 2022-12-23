package com.inmobi.media;

import java.util.Locale;

/* renamed from: com.inmobi.media.cb */
/* compiled from: NativeTextAsset */
public class C5914cb extends C5901bt {

    /* renamed from: com.inmobi.media.cb$a */
    /* compiled from: NativeTextAsset */
    public static class C5915a extends C5902bu {

        /* renamed from: l */
        protected int f14971l;

        /* renamed from: m */
        protected String f14972m;

        /* renamed from: n */
        protected int f14973n;

        /* renamed from: o */
        protected String[] f14974o;

        /* renamed from: p */
        public byte f14975p;

        public C5915a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, C5916cc ccVar) {
            this(i, i2, i3, i4, i5, i6, i7, i8, str, str2, str3, str4, 12, (byte) 0, Integer.MAX_VALUE, "#ff000000", new String[]{"none"}, ccVar);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5915a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, int i9, byte b, int i10, String str5, String[] strArr, C5916cc ccVar) {
            super(i, i2, i3, i4, i5, i6, i7, i8, str, str2, str3, str4, ccVar);
            String[] strArr2 = strArr;
            this.f14971l = i9;
            this.f14972m = str5.length() == 0 ? "#ff000000" : str5;
            this.f14973n = i10;
            int min = Math.min(strArr2.length, 4);
            String[] strArr3 = new String[min];
            this.f14974o = strArr3;
            this.f14975p = b;
            System.arraycopy(strArr2, 0, strArr3, 0, min);
        }

        /* renamed from: h */
        public final int mo34903h() {
            return this.f14971l;
        }

        /* renamed from: i */
        public final String mo34904i() {
            return this.f14972m.toLowerCase(Locale.US);
        }

        /* renamed from: j */
        public final String[] mo34905j() {
            return this.f14974o;
        }

        /* renamed from: e */
        public final String mo34884e() {
            return this.f14926j.toLowerCase(Locale.US);
        }
    }

    public C5914cb(String str, String str2, C5902bu buVar, String str3) {
        super(str, str2, "TEXT", buVar);
        this.f14896e = str3;
    }

    public C5914cb(String str, String str2, String str3, C5902bu buVar, String str4) {
        super(str, str2, str3, buVar);
        this.f14896e = str4;
    }
}
