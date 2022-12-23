package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gx */
/* compiled from: NetworkRequest */
public class C6206gx {

    /* renamed from: a */
    private static final String f15702a = C6206gx.class.getSimpleName();

    /* renamed from: b */
    private String f15703b;

    /* renamed from: c */
    private C6271ir f15704c;

    /* renamed from: d */
    private boolean f15705d;

    /* renamed from: f */
    protected Map<String, String> f15706f;

    /* renamed from: g */
    protected Map<String, String> f15707g;

    /* renamed from: h */
    protected Map<String, String> f15708h;

    /* renamed from: i */
    protected JSONObject f15709i;

    /* renamed from: j */
    String f15710j;

    /* renamed from: k */
    String f15711k;

    /* renamed from: l */
    public int f15712l;

    /* renamed from: m */
    public int f15713m;

    /* renamed from: n */
    public boolean f15714n;

    /* renamed from: o */
    public boolean f15715o;

    /* renamed from: p */
    long f15716p;

    /* renamed from: q */
    public boolean f15717q;

    /* renamed from: r */
    protected boolean f15718r;

    /* renamed from: s */
    protected String f15719s;

    /* renamed from: t */
    public boolean f15720t;

    public C6206gx(String str, String str2, C6271ir irVar) {
        this(str, str2, irVar, false, ShareTarget.ENCODING_TYPE_URL_ENCODED);
    }

    public C6206gx(String str, String str2) {
        this(str, str2, (C6271ir) null, false, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        this.f15705d = false;
    }

    public C6206gx(String str, String str2, C6271ir irVar, boolean z, String str3) {
        this.f15706f = new HashMap();
        this.f15712l = 60000;
        this.f15713m = 60000;
        this.f15714n = true;
        this.f15715o = true;
        this.f15716p = -1;
        this.f15717q = false;
        this.f15705d = true;
        this.f15718r = false;
        this.f15719s = C6227ho.m18559f();
        this.f15720t = true;
        this.f15710j = str;
        this.f15703b = str2;
        this.f15704c = irVar;
        this.f15706f.put("User-Agent", C6227ho.m18564i());
        this.f15717q = z;
        if (ShareTarget.METHOD_GET.equals(str)) {
            this.f15707g = new HashMap();
        } else if (ShareTarget.METHOD_POST.equals(str)) {
            this.f15708h = new HashMap();
            this.f15709i = new JSONObject();
        }
        this.f15711k = str3;
    }

    /* renamed from: c */
    public final boolean mo35389c() {
        return this.f15716p != -1;
    }

    /* renamed from: a */
    public final void mo35385a(Map<String, String> map) {
        if (map != null) {
            this.f15706f.putAll(map);
        }
    }

    /* renamed from: b */
    public final void mo35387b(Map<String, String> map) {
        if (map != null) {
            this.f15707g.putAll(map);
        }
    }

    /* renamed from: c */
    public final void mo35388c(Map<String, String> map) {
        this.f15708h.putAll(map);
    }

    /* renamed from: d */
    public final Map<String, String> mo35390d() {
        C6239hv.m18615a(this.f15706f);
        return this.f15706f;
    }

    /* renamed from: e */
    public final String mo35392e() {
        String b;
        String str = this.f15703b;
        if (this.f15707g == null || (b = mo35339b()) == null || b.trim().length() == 0) {
            return str;
        }
        if (!str.contains("?")) {
            str = str + "?";
        }
        if (!str.endsWith("&") && !str.endsWith("?")) {
            str = str + "&";
        }
        return str + b;
    }

    /* renamed from: a */
    public void mo34922a() {
        JSONObject b;
        C6256ie.m18677g();
        this.f15717q = C6256ie.m18668a(this.f15717q);
        if (this.f15715o) {
            if (ShareTarget.METHOD_GET.equals(this.f15710j)) {
                m18457e(this.f15707g);
            } else if (ShareTarget.METHOD_POST.equals(this.f15710j)) {
                m18457e(this.f15708h);
            }
        }
        if (this.f15705d && (b = C6256ie.m18669b()) != null) {
            if (ShareTarget.METHOD_GET.equals(this.f15710j)) {
                this.f15707g.put("consentObject", b.toString());
            } else if (ShareTarget.METHOD_POST.equals(this.f15710j)) {
                this.f15708h.put("consentObject", b.toString());
            }
        }
        if (!this.f15720t) {
            return;
        }
        if (ShareTarget.METHOD_GET.equals(this.f15710j)) {
            this.f15707g.put("u-appsecure", Byte.toString(C6249ia.m18645a().f15828d));
        } else if (ShareTarget.METHOD_POST.equals(this.f15710j)) {
            this.f15708h.put("u-appsecure", Byte.toString(C6249ia.m18645a().f15828d));
        }
    }

    /* renamed from: b */
    private String mo35339b() {
        C6239hv.m18615a(this.f15707g);
        return C6239hv.m18611a(this.f15707g, "&");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo35393f() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f15711k
            int r1 = r0.hashCode()
            r2 = -1485569826(0xffffffffa77400de, float:-3.3862272E-15)
            r3 = 1
            if (r1 == r2) goto L_0x001c
            r2 = -43840953(0xfffffffffd630a47, float:-1.8861757E37)
            if (r1 == r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            java.lang.String r1 = "application/json"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = 0
            goto L_0x0027
        L_0x001c:
            java.lang.String r1 = "application/x-www-form-urlencoded"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0027
        L_0x0026:
            r0 = -1
        L_0x0027:
            if (r0 == 0) goto L_0x003c
            if (r0 == r3) goto L_0x002e
            java.lang.String r0 = ""
            goto L_0x0042
        L_0x002e:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f15708h
            com.inmobi.media.C6239hv.m18615a((java.util.Map<java.lang.String, java.lang.String>) r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f15708h
            java.lang.String r1 = "&"
            java.lang.String r0 = com.inmobi.media.C6239hv.m18611a((java.util.Map<java.lang.String, java.lang.String>) r0, (java.lang.String) r1)
            goto L_0x0042
        L_0x003c:
            org.json.JSONObject r0 = r4.f15709i
            java.lang.String r0 = r0.toString()
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6206gx.mo35393f():java.lang.String");
    }

    /* renamed from: a */
    public final void mo35386a(boolean z) {
        this.f15718r = z;
    }

    /* renamed from: e */
    private void m18457e(Map<String, String> map) {
        map.putAll(C6249ia.m18645a().f15827c);
        map.putAll(C6251ib.m18650a(this.f15718r));
        map.putAll(C6257if.m18680a());
        mo35391d(map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo35391d(Map<String, String> map) {
        C6271ir irVar = this.f15704c;
        if (irVar != null) {
            map.putAll(irVar.mo35481a());
        }
    }

    /* renamed from: g */
    public final long mo35394g() {
        try {
            if (ShareTarget.METHOD_GET.equals(this.f15710j)) {
                return 0 + ((long) mo35339b().length());
            }
            if (ShareTarget.METHOD_POST.equals(this.f15710j)) {
                return ((long) mo35393f().length()) + 0;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }
}
