package com.bytedance.sdk.openadsdk.p172h.p173a;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.p110d.p113c.p117b.C2859a;
import com.bytedance.sdk.component.p120e.p123c.C2927d;
import com.bytedance.sdk.component.p120e.p123c.C2931g;
import com.bytedance.sdk.component.p120e.p124d.C2933b;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.p130b.C3166i;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3814b;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.NetworkTools;
import com.com.bytedance.overseas.sdk.p187b.C4028a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.h.a.b */
/* compiled from: LogStatsBase */
public class C3814b<T extends C3814b> implements C3813a {

    /* renamed from: a */
    private String f9885a;

    /* renamed from: b */
    private String f9886b;

    /* renamed from: c */
    private String f9887c;

    /* renamed from: d */
    private String f9888d = C3166i.i1655274989219dc("4/7-4+2");

    /* renamed from: e */
    private String f9889e;

    /* renamed from: f */
    private long f9890f = (System.currentTimeMillis() / 1000);

    /* renamed from: g */
    private int f9891g = 0;

    /* renamed from: h */
    private String f9892h;

    /* renamed from: i */
    private int f9893i = 0;

    /* renamed from: j */
    private String f9894j;

    /* renamed from: k */
    private String f9895k;

    /* renamed from: l */
    private String f9896l;

    /* renamed from: m */
    private String f9897m;

    /* renamed from: n */
    private String f9898n;

    /* renamed from: b */
    public static C3814b<C3814b> m12522b() {
        return new C3814b<>();
    }

    @JProtect
    /* renamed from: q */
    private JSONObject m12523q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C2927d.d1655274989178dc("or"), 1);
            jSONObject.put(C2927d.d1655274989178dc("mnffh"), Build.MODEL);
            jSONObject.put(C2859a.a1655274989226dc("vdlgkw"), Build.MANUFACTURER);
            jSONObject.put(C2859a.a1655274989226dc("p`ahebcXfhgn"), C4014u.m13214d());
            jSONObject.put(C2859a.a1655274989226dc("u`"), C4014u.m13197b());
            jSONObject.put(C2859a.a1655274989226dc("g`kg"), C4028a.m13343a().mo20936b());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: r */
    private T m12524r() {
        return this;
    }

    /* renamed from: a */
    public T mo20632a(int i) {
        this.f9891g = i;
        return m12524r();
    }

    /* renamed from: a */
    public T mo20633a(long j) {
        this.f9890f = j;
        return m12524r();
    }

    /* renamed from: a */
    public T mo20634a(String str) {
        this.f9885a = str;
        return m12524r();
    }

    @JProtect
    /* renamed from: a */
    public JSONObject mo20631a() {
        String b1655274989200dc;
        String f;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(mo20638c())) {
                jSONObject.put(C2931g.g1655274989199dc("txrf"), mo20638c());
            }
            if (!TextUtils.isEmpty(mo20642e())) {
                jSONObject.put(C2931g.g1655274989199dc("rhv"), mo20642e());
            }
            if (!TextUtils.isEmpty(mo20644f())) {
                jSONObject.put(C2931g.g1655274989199dc("csgbplpbW`n"), mo20644f());
            }
            if (!TextUtils.isEmpty(mo20646g())) {
                jSONObject.put(C2931g.g1655274989199dc("ae]p`nYqm{ybcc"), mo20646g());
            }
            if (!TextUtils.isEmpty(mo20648h())) {
                b1655274989200dc = C2931g.g1655274989199dc("aqr\\r`ttafd");
                f = mo20648h();
            } else {
                b1655274989200dc = C2933b.b1655274989200dc("aqr\\r`ttafd");
                f = C4014u.m13226f();
            }
            jSONObject.put(b1655274989200dc, f);
            if (mo20649i() > 0) {
                jSONObject.put(C2931g.g1655274989199dc("thofwqgjx"), mo20649i());
            }
            if (mo20650j() > 0) {
                jSONObject.put(C2931g.g1655274989199dc("aevzt`"), mo20650j());
            }
            if (!TextUtils.isEmpty(mo20651k())) {
                jSONObject.put(C2931g.g1655274989199dc("rds\\ma"), mo20651k());
            }
            jSONObject.put(C2933b.b1655274989200dc("esplvZehll"), mo20652l());
            if (!TextUtils.isEmpty(mo20653m())) {
                jSONObject.put(C2931g.g1655274989199dc("esplvZkto"), mo20653m());
            }
            if (!TextUtils.isEmpty(mo20654n())) {
                jSONObject.put(C2933b.b1655274989200dc("eyvqe"), mo20654n());
            }
            if (!TextUtils.isEmpty(mo20655o())) {
                jSONObject.put(C2933b.b1655274989200dc("ilcdaZsud"), mo20655o());
            }
            if (!TextUtils.isEmpty(mo20640d())) {
                jSONObject.put(C2933b.b1655274989200dc("ewgmpZc|{k"), mo20640d());
            }
            if (!TextUtils.isEmpty(mo20656p())) {
                jSONObject.put(C2933b.b1655274989200dc("dtpbplii"), mo20656p());
            }
            if (!TextUtils.isEmpty(C3524h.m10852d().mo19854f())) {
                jSONObject.put(C2933b.b1655274989200dc("aqrj`"), C3524h.m10852d().mo19854f());
            }
            jSONObject.put(C2933b.b1655274989200dc("cnlm[qwm"), NetworkTools.m13020b(C3578m.m11231a()));
            jSONObject.put(C2933b.b1655274989200dc("ddtjg`Ynfoe"), m12523q());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    public T mo20635b(int i) {
        this.f9893i = i;
        return m12524r();
    }

    /* renamed from: b */
    public T mo20636b(String str) {
        this.f9897m = str;
        return m12524r();
    }

    /* renamed from: c */
    public T mo20637c(String str) {
        this.f9886b = str;
        return m12524r();
    }

    /* renamed from: c */
    public String mo20638c() {
        return this.f9885a;
    }

    /* renamed from: d */
    public T mo20639d(String str) {
        this.f9887c = str;
        return m12524r();
    }

    /* renamed from: d */
    public String mo20640d() {
        return this.f9897m;
    }

    /* renamed from: e */
    public T mo20641e(String str) {
        this.f9892h = str;
        return m12524r();
    }

    /* renamed from: e */
    public String mo20642e() {
        return this.f9886b;
    }

    /* renamed from: f */
    public T mo20643f(String str) {
        this.f9894j = str;
        return m12524r();
    }

    /* renamed from: f */
    public String mo20644f() {
        return this.f9887c;
    }

    /* renamed from: g */
    public T mo20645g(String str) {
        this.f9895k = str;
        return m12524r();
    }

    /* renamed from: g */
    public String mo20646g() {
        return this.f9888d;
    }

    /* renamed from: h */
    public T mo20647h(String str) {
        this.f9898n = str;
        return m12524r();
    }

    /* renamed from: h */
    public String mo20648h() {
        return this.f9889e;
    }

    /* renamed from: i */
    public long mo20649i() {
        long j = this.f9890f;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c = ']';
                c2 = ']';
            }
            while (true) {
                switch (c2) {
                    case '[':
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return j;
    }

    /* renamed from: j */
    public int mo20650j() {
        int i = this.f9891g;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        if (c2 > 4) {
                            break;
                        } else {
                            continue;
                        }
                }
                while (true) {
                    switch (c2) {
                        case '[':
                        case ']':
                            break;
                        case '\\':
                            break;
                        default:
                            c2 = '[';
                    }
                }
                c = '^';
                c2 = 'K';
            }
        }
        return i;
    }

    /* renamed from: k */
    public String mo20651k() {
        return this.f9892h;
    }

    /* renamed from: l */
    public int mo20652l() {
        int i = this.f9893i;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c = ']';
                c2 = ']';
            }
            while (true) {
                switch (c2) {
                    case '[':
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return i;
    }

    /* renamed from: m */
    public String mo20653m() {
        return this.f9894j;
    }

    /* renamed from: n */
    public String mo20654n() {
        return this.f9895k;
    }

    /* renamed from: o */
    public String mo20655o() {
        return this.f9896l;
    }

    /* renamed from: p */
    public String mo20656p() {
        return this.f9898n;
    }
}
