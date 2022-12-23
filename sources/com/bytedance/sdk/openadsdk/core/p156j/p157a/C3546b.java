package com.bytedance.sdk.openadsdk.core.p156j.p157a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.p120e.C2913b;
import com.bytedance.sdk.component.p120e.p122b.C2916b;
import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a.b */
/* compiled from: VastXmlParser */
public abstract class C3546b {

    /* renamed from: e */
    public static int f8906e;

    /* renamed from: a */
    protected int f8907a;

    /* renamed from: b */
    protected final Context f8908b;

    /* renamed from: c */
    protected int f8909c = Integer.MIN_VALUE;

    /* renamed from: d */
    protected double f8910d = Double.MIN_VALUE;

    public C3546b(Context context, int i, int i2) {
        if (i2 > 0 && i > 0) {
            this.f8910d = ((double) i) / ((double) i2);
        }
        float e = C4020v.m13314e(context);
        if (e != 0.0f) {
            this.f8909c = (int) (((float) i) / e);
        }
        this.f8908b = context.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20004a(Exception exc, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i);
            C3815b.m12552a().mo20663a("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo20005a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            if (Integer.parseInt(str) < 2) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo20003a(String str, List<C3553c> list) {
        String str2;
        int i = this.f8907a;
        if (i >= 5) {
            return null;
        }
        this.f8907a = i + 1;
        if (str == null) {
            return null;
        }
        try {
            C2916b c = C3854d.m12660a().mo20705b().mo17762c();
            c.mo17789a(str);
            C2913b a = c.mo17785a();
            str2 = a.mo17777d();
            try {
                a.mo17773a();
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            str2 = null;
            mo20004a(e, 0);
            if (!list.isEmpty()) {
                C3553c.m11120b(list, C3540a.WRAPPER_TIMEOUT, -1, (String) null);
            }
            return str2;
        }
        return str2;
    }
}
