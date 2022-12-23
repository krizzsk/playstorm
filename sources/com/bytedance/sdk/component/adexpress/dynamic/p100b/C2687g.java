package com.bytedance.sdk.component.adexpress.dynamic.p100b;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2710l;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.VisionDataDBAdapter;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.g */
/* compiled from: DynamicLayoutNativeValue */
public class C2687g {

    /* renamed from: a */
    public int f5887a;

    /* renamed from: b */
    public String f5888b;

    /* renamed from: c */
    private C2686f f5889c;

    /* renamed from: d */
    private C2685e f5890d;

    /* renamed from: e */
    private String f5891e;

    public C2687g(C2685e eVar) {
        this.f5890d = eVar;
        this.f5887a = eVar.mo16951a();
        this.f5888b = eVar.mo16957c();
        this.f5891e = eVar.mo16959d();
        if (C2640c.m6892c() == 1) {
            this.f5889c = eVar.mo16961f();
        } else {
            this.f5889c = eVar.mo16960e();
        }
        if (C2640c.m6891b()) {
            this.f5889c = eVar.mo16960e();
        }
    }

    /* renamed from: a */
    public int mo17110a() {
        return (int) this.f5889c.mo17033f();
    }

    /* renamed from: b */
    public int mo17113b() {
        return (int) this.f5889c.mo17048i();
    }

    /* renamed from: c */
    public int mo17114c() {
        return (int) this.f5889c.mo17038g();
    }

    /* renamed from: d */
    public int mo17115d() {
        return (int) this.f5889c.mo17043h();
    }

    /* renamed from: e */
    public float mo17116e() {
        return this.f5889c.mo17053j();
    }

    /* renamed from: f */
    public String mo17117f() {
        return this.f5887a == 0 ? this.f5888b : "";
    }

    /* renamed from: g */
    public int mo17118g() {
        return m7189a(this.f5889c.mo17069n());
    }

    /* renamed from: h */
    public int mo17119h() {
        String m = this.f5889c.mo17065m();
        if ("left".equals(m)) {
            return 2;
        }
        if ("center".equals(m)) {
            return 4;
        }
        if ("right".equals(m)) {
            return 3;
        }
        return 2;
    }

    /* renamed from: i */
    public int mo17120i() {
        int h = mo17119h();
        if (h == 4) {
            return 17;
        }
        return h == 3 ? 5 : 3;
    }

    /* renamed from: j */
    public String mo17121j() {
        int i = this.f5887a;
        if (i == 2 || i == 13) {
            return this.f5888b;
        }
        return "";
    }

    /* renamed from: k */
    public String mo17122k() {
        return this.f5887a == 1 ? this.f5888b : "";
    }

    /* renamed from: l */
    public String mo17123l() {
        return this.f5891e;
    }

    /* renamed from: m */
    public double mo17124m() {
        if (this.f5887a == 11) {
            try {
                double parseDouble = Double.parseDouble(this.f5888b);
                return !C2640c.m6891b() ? (double) ((int) parseDouble) : parseDouble;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    /* renamed from: n */
    public double mo17125n() {
        return this.f5889c.mo17057k();
    }

    /* renamed from: o */
    public float mo17126o() {
        return this.f5889c.mo17017c();
    }

    /* renamed from: p */
    public int mo17127p() {
        return m7189a(this.f5889c.mo17075p());
    }

    /* renamed from: q */
    public float mo17128q() {
        return this.f5889c.mo17023d();
    }

    /* renamed from: r */
    public int mo17129r() {
        return this.f5889c.mo17002af();
    }

    /* renamed from: s */
    public boolean mo17130s() {
        return this.f5889c.mo17003ag();
    }

    /* renamed from: a */
    public void mo17111a(float f) {
        this.f5889c.mo16991a(f);
    }

    /* renamed from: t */
    public boolean mo17131t() {
        return this.f5889c.mo17097y();
    }

    /* renamed from: u */
    public int mo17132u() {
        return this.f5889c.mo17098z();
    }

    /* renamed from: v */
    public int mo17133v() {
        String u = this.f5889c.mo17089u();
        if ("skip-with-time-skip-btn".equals(this.f5890d.mo16954b()) || "skip".equals(this.f5890d.mo16954b()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.f5890d.mo16954b())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.f5890d.mo16954b()) && !"skip-with-time".equals(this.f5890d.mo16954b())) {
            if (this.f5887a == 10 && TextUtils.equals(this.f5889c.mo17091v(), "click")) {
                return 5;
            }
            if (m7187L() && m7188M()) {
                return 0;
            }
            if (m7187L()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.f5890d.mo16954b())) {
                return 3;
            }
            if (!TextUtils.isEmpty(u) && !u.equals("none")) {
                if (u.equals("video") || (this.f5890d.mo16951a() == 7 && TextUtils.equals(u, Constants.NORMAL))) {
                    return (!C2640c.m6891b() || this.f5890d.mo16960e() == null || !this.f5890d.mo16960e().mo17005ai()) ? 4 : 11;
                }
                if (u.equals(Constants.NORMAL)) {
                    return 1;
                }
                if (!u.equals(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE) && !"slide".equals(this.f5889c.mo17091v())) {
                    return 0;
                }
                return 2;
            }
        }
        return 0;
    }

    /* renamed from: L */
    private boolean m7187L() {
        return "logo-union".equals(this.f5890d.mo16954b()) || "logounion".equals(this.f5890d.mo16954b()) || "logoad".equals(this.f5890d.mo16954b());
    }

    /* renamed from: w */
    public int mo17134w() {
        return m7189a(this.f5889c.mo17072o());
    }

    /* renamed from: x */
    public int mo17135x() {
        return this.f5889c.mo16989a();
    }

    /* renamed from: y */
    public String mo17136y() {
        return this.f5889c.mo17010b();
    }

    /* renamed from: z */
    public String mo17137z() {
        return this.f5889c.mo17091v();
    }

    /* renamed from: M */
    private boolean m7188M() {
        if (C2640c.m6891b()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.f5888b) || !this.f5888b.contains("adx:")) && !C2710l.m7358b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m7189a(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals(TJAdUnitConstants.String.TRANSPARENT)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (!str.startsWith("rgba") || (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) == null || split.length != 4) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0;
    }

    /* renamed from: b */
    public static float[] m7190b(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        if (split == null || split.length != 4) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        }
        return new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
    }

    /* renamed from: a */
    public boolean mo17112a(int i) {
        C2685e eVar = this.f5890d;
        if (eVar == null) {
            return false;
        }
        if (i == 1) {
            this.f5889c = eVar.mo16961f();
        } else {
            this.f5889c = eVar.mo16960e();
        }
        if (this.f5889c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public boolean mo17099A() {
        return this.f5889c.mo16980R();
    }

    /* renamed from: B */
    public int mo17100B() {
        return this.f5889c.mo16982T();
    }

    /* renamed from: C */
    public int mo17101C() {
        return this.f5889c.mo16981S();
    }

    /* renamed from: D */
    public String mo17102D() {
        return this.f5889c.mo17087t();
    }

    /* renamed from: E */
    public int mo17103E() {
        return this.f5889c.mo17001ae();
    }

    /* renamed from: F */
    public int mo17104F() {
        return this.f5889c.mo17006aj();
    }

    /* renamed from: G */
    public int mo17105G() {
        return this.f5889c.mo16998ab();
    }

    /* renamed from: H */
    public int mo17106H() {
        return this.f5889c.mo16997aa();
    }

    /* renamed from: I */
    public String mo17107I() {
        return this.f5889c.mo17084s();
    }

    /* renamed from: J */
    public boolean mo17108J() {
        return this.f5889c.mo17032e();
    }

    /* renamed from: K */
    public String mo17109K() {
        return this.f5890d.mo16954b() + CertificateUtil.DELIMITER + this.f5889c.mo17000ad();
    }
}
