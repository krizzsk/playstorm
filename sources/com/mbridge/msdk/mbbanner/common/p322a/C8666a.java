package com.mbridge.msdk.mbbanner.common.p322a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.tools.C8596q;

/* renamed from: com.mbridge.msdk.mbbanner.common.a.a */
/* compiled from: BannerReportData */
public final class C8666a {

    /* renamed from: a */
    private String f20982a;

    /* renamed from: b */
    private String f20983b;

    /* renamed from: c */
    private String f20984c;

    /* renamed from: d */
    private String f20985d;

    /* renamed from: e */
    private String f20986e;

    /* renamed from: f */
    private String f20987f;

    /* renamed from: g */
    private String f20988g;

    /* renamed from: h */
    private int f20989h;

    /* renamed from: i */
    private boolean f20990i;

    /* renamed from: a */
    public final C8666a mo57968a(boolean z) {
        this.f20990i = z;
        return this;
    }

    private C8666a() {
    }

    /* renamed from: a */
    public static C8666a m25135a() {
        return new C8666a();
    }

    /* renamed from: a */
    public final C8666a mo57967a(String str) {
        this.f20982a = str;
        return this;
    }

    /* renamed from: b */
    public final C8666a mo57969b(String str) {
        this.f20983b = str;
        return this;
    }

    /* renamed from: c */
    public final C8666a mo57971c(String str) {
        this.f20984c = str;
        return this;
    }

    /* renamed from: d */
    public final C8666a mo57972d(String str) {
        this.f20986e = str;
        return this;
    }

    /* renamed from: e */
    public final C8666a mo57973e(String str) {
        this.f20985d = str;
        return this;
    }

    /* renamed from: f */
    public final C8666a mo57974f(String str) {
        this.f20987f = str;
        return this;
    }

    /* renamed from: g */
    public final C8666a mo57975g(String str) {
        this.f20988g = str;
        return this;
    }

    /* renamed from: a */
    public final C8666a mo57966a(int i) {
        this.f20989h = i;
        return this;
    }

    /* renamed from: b */
    public final String mo57970b() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f20983b)) {
            sb.append("unit_id=");
            sb.append(this.f20983b);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20984c)) {
            sb.append("cid=");
            sb.append(this.f20984c);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20985d)) {
            sb.append("rid=");
            sb.append(this.f20985d);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20986e)) {
            sb.append("rid_n=");
            sb.append(this.f20986e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20987f)) {
            sb.append("creative_id=");
            sb.append(this.f20987f);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20988g)) {
            sb.append("reason=");
            sb.append(this.f20988g);
            sb.append("&");
        }
        if (this.f20989h != 0) {
            sb.append("result=");
            sb.append(this.f20989h);
            sb.append("&");
        }
        if (this.f20990i) {
            sb.append("hb=1");
            sb.append("&");
        }
        sb.append("network_type=");
        sb.append(C8596q.m24849n(C2350a.m5601e().mo15792g()));
        sb.append("&");
        if (!TextUtils.isEmpty(this.f20982a)) {
            sb.append("key=");
            sb.append(this.f20982a);
        }
        return sb.toString();
    }
}
