package com.bytedance.sdk.component.p104b.p105a.p106a.p107a;

import android.text.TextUtils;
import com.bytedance.sdk.component.p104b.p105a.C2806e;
import com.bytedance.sdk.component.p104b.p105a.C2815j;
import com.bytedance.sdk.component.p104b.p105a.C2816k;
import com.bytedance.sdk.component.p104b.p105a.C2820m;
import com.bytedance.sdk.component.p104b.p105a.C2821n;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.f */
/* compiled from: NetResponse */
public class C2792f extends C2820m {

    /* renamed from: a */
    HttpURLConnection f6281a;

    /* renamed from: b */
    C2816k f6282b;

    /* renamed from: a */
    public long mo17493a() {
        return 0;
    }

    /* renamed from: b */
    public long mo17496b() {
        return 0;
    }

    public String toString() {
        return "";
    }

    public C2792f(HttpURLConnection httpURLConnection, C2816k kVar) {
        this.f6281a = httpURLConnection;
        this.f6282b = kVar;
    }

    /* renamed from: c */
    public int mo17497c() {
        try {
            return this.f6281a.getResponseCode();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public boolean mo17499d() {
        return mo17497c() >= 200 && mo17497c() < 300;
    }

    /* renamed from: e */
    public String mo17500e() throws IOException {
        return this.f6281a.getResponseMessage();
    }

    /* renamed from: f */
    public C2821n mo17501f() {
        try {
            return new C2793g(this.f6281a);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public C2806e mo17502g() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f6281a.getHeaderFields().entrySet()) {
            for (String str : (List) entry.getValue()) {
                if (!HttpHeaders.CONTENT_RANGE.equalsIgnoreCase((String) entry.getKey()) || mo17497c() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new C2806e((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: a */
    public String mo17494a(String str) {
        return this.f6281a.getHeaderField(str);
    }

    /* renamed from: a */
    public String mo17495a(String str, String str2) {
        return !TextUtils.isEmpty(mo17494a(str)) ? mo17494a(str) : str2;
    }

    public void close() {
        try {
            mo17501f().close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public C2815j mo17503h() {
        return C2815j.HTTP_1_1;
    }
}
