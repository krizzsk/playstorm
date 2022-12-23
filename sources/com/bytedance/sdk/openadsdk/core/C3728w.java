package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.adexpress.C2618b;
import com.bytedance.sdk.component.adexpress.p095b.C2631j;
import com.bytedance.sdk.component.adexpress.p097d.C2647b;
import com.bytedance.sdk.component.p090a.C2554a;
import com.bytedance.sdk.component.p090a.C2574l;
import com.bytedance.sdk.component.p090a.C2582r;
import com.bytedance.sdk.component.p104b.p105a.C2807f;
import com.bytedance.sdk.component.p110d.p113c.p117b.C2859a;
import com.bytedance.sdk.component.p110d.p119d.C2885g;
import com.bytedance.sdk.component.p120e.p123c.C2927d;
import com.bytedance.sdk.component.p120e.p123c.C2928e;
import com.bytedance.sdk.component.p120e.p123c.C2931g;
import com.bytedance.sdk.component.p120e.p124d.C2933b;
import com.bytedance.sdk.component.utils.C2971k;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2989x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.common.C3225a;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3617j;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p146b.C3431d;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3470b;
import com.bytedance.sdk.openadsdk.core.p151e.C3481j;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3746a;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3166i;
import com.bytedance.sdk.openadsdk.p130b.C3185u;
import com.bytedance.sdk.openadsdk.p168e.C3790b;
import com.bytedance.sdk.openadsdk.p168e.C3791c;
import com.bytedance.sdk.openadsdk.p168e.C3792d;
import com.bytedance.sdk.openadsdk.p169f.C3793a;
import com.bytedance.sdk.openadsdk.p169f.p170a.C3794a;
import com.bytedance.sdk.openadsdk.p169f.p170a.C3797b;
import com.bytedance.sdk.openadsdk.p169f.p170a.C3799c;
import com.bytedance.sdk.openadsdk.p169f.p170a.C3801d;
import com.bytedance.sdk.openadsdk.p169f.p170a.C3802e;
import com.bytedance.sdk.openadsdk.p171g.C3803a;
import com.bytedance.sdk.openadsdk.p171g.C3804b;
import com.bytedance.sdk.openadsdk.p171g.C3805c;
import com.bytedance.sdk.openadsdk.p171g.C3806d;
import com.bytedance.sdk.openadsdk.p171g.C3807e;
import com.bytedance.sdk.openadsdk.p171g.C3811h;
import com.bytedance.sdk.openadsdk.utils.C3985e;
import com.bytedance.sdk.openadsdk.utils.C3999i;
import com.bytedance.sdk.openadsdk.utils.C4001k;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.facebook.appevents.UserDataStore;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.w */
/* compiled from: TTAndroidObject */
public class C3728w implements C2647b, C2989x.C2990a, C3790b {

    /* renamed from: g */
    private static final Map<String, Boolean> f9583g;

    /* renamed from: A */
    private C3804b f9584A;

    /* renamed from: B */
    private C3811h f9585B;

    /* renamed from: C */
    private boolean f9586C = true;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public List<C3498n> f9587D;

    /* renamed from: E */
    private HashMap<String, C3529i> f9588E;

    /* renamed from: F */
    private boolean f9589F = false;

    /* renamed from: G */
    private boolean f9590G = false;

    /* renamed from: H */
    private C3185u f9591H;

    /* renamed from: I */
    private C2582r f9592I;

    /* renamed from: J */
    private String f9593J;

    /* renamed from: K */
    private boolean f9594K = false;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C3746a f9595L;

    /* renamed from: a */
    protected Map<String, Object> f9596a;

    /* renamed from: b */
    boolean f9597b;

    /* renamed from: c */
    boolean f9598c = false;

    /* renamed from: d */
    private WeakReference<SSWebView> f9599d;

    /* renamed from: e */
    private C2989x f9600e;

    /* renamed from: f */
    private String f9601f;

    /* renamed from: h */
    private WeakReference<Context> f9602h;

    /* renamed from: i */
    private C3791c f9603i;

    /* renamed from: j */
    private String f9604j;

    /* renamed from: k */
    private WeakReference<View> f9605k;

    /* renamed from: l */
    private String f9606l;

    /* renamed from: m */
    private int f9607m;

    /* renamed from: n */
    private String f9608n;

    /* renamed from: o */
    private int f9609o;

    /* renamed from: p */
    private boolean f9610p = true;

    /* renamed from: q */
    private C3498n f9611q;

    /* renamed from: r */
    private C2631j f9612r;

    /* renamed from: s */
    private C3617j f9613s;

    /* renamed from: t */
    private JSONObject f9614t;

    /* renamed from: u */
    private C3792d f9615u;

    /* renamed from: v */
    private C3803a f9616v;

    /* renamed from: w */
    private C3807e f9617w;

    /* renamed from: x */
    private C3806d f9618x;

    /* renamed from: y */
    private JSONObject f9619y;

    /* renamed from: z */
    private C3431d f9620z;

    /* renamed from: com.bytedance.sdk.openadsdk.core.w$a */
    /* compiled from: TTAndroidObject */
    public static class C3738a {

        /* renamed from: a */
        public String f9636a;

        /* renamed from: b */
        public String f9637b;

        /* renamed from: c */
        public String f9638c;

        /* renamed from: d */
        public JSONObject f9639d;

        /* renamed from: e */
        public int f9640e;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f9583g = concurrentHashMap;
        concurrentHashMap.put(C2807f.f1655274989236dc("lne\\asci|"), Boolean.TRUE);
        f9583g.put(C2931g.g1655274989199dc("pskueqc"), Boolean.TRUE);
        f9583g.put(C2931g.g1655274989199dc("dhqseqeoWdoxlij"), Boolean.TRUE);
        f9583g.put(C2931g.g1655274989199dc("ctqwkhYb~ld"), Boolean.TRUE);
        f9583g.put(C2931g.g1655274989199dc("lne\\asci|V|8"), Boolean.TRUE);
    }

    public C3728w(Context context) {
        this.f9602h = new WeakReference<>(context);
        this.f9600e = new C2989x(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    private void m12167a(final C3738a aVar, final JSONObject jSONObject) {
        if (aVar != null) {
            try {
                mo20440a(aVar.f9639d, (C3805c) new C3805c() {
                    /* renamed from: a */
                    public void mo20474a(boolean z, List<C3498n> list) {
                        if (z) {
                            try {
                                jSONObject.put(C2933b.b1655274989200dc("csgbplpb{"), C3728w.m12175b(list));
                                C3728w.this.m12177b(aVar.f9637b, jSONObject);
                            } catch (Exception unused) {
                            }
                        } else {
                            C3728w.this.m12177b(aVar.f9637b, jSONObject);
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m12171a(String str, boolean z) {
        if (this.f9591H != null && !TextUtils.isEmpty(str)) {
            if (z) {
                this.f9591H.mo18810a(str);
            } else {
                this.f9591H.mo18817b(str);
            }
        }
    }

    @JProtect
    /* renamed from: a */
    private void m12172a(JSONObject jSONObject, int i) throws Exception {
        String b1655274989200dc;
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String put : m12198q()) {
            jSONArray.put(put);
        }
        jSONObject.put(C2933b.b1655274989200dc("aqrMehc"), C3225a.m9409a());
        jSONObject.put(C2933b.b1655274989200dc("iolfvDvwFhgn"), C3225a.m9414e());
        jSONObject.put(C2933b.b1655274989200dc("ahf"), C3225a.m9411b());
        jSONObject.put(C2933b.b1655274989200dc("seiF`lrngg"), C3225a.m9412c());
        jSONObject.put(C2933b.b1655274989200dc("aqrUawungg"), C3225a.m9413d());
        jSONObject.put(C2933b.b1655274989200dc("ndvW}uc"), C3225a.m9415f());
        jSONObject.put(C2933b.b1655274989200dc("strskwrKaz~"), jSONArray);
        jSONObject.put(C2933b.b1655274989200dc("ddtjg`Oc"), C3225a.m9410a(C3578m.m11231a()));
        if (C3985e.m13059b(C3578m.m11231a())) {
            b1655274989200dc = C2933b.b1655274989200dc("ddtjg`Ywdh~mcc");
            str = "AofqklbXXhn";
        } else {
            b1655274989200dc = C2933b.b1655274989200dc("ddtjg`Ywdh~mcc");
            str = "Aofqklb";
        }
        jSONObject.put(b1655274989200dc, C2933b.b1655274989200dc(str));
        jSONObject.put(C2933b.b1655274989200dc("ddtjg`Ysqyo"), Build.VERSION.RELEASE);
    }

    @JProtect
    /* renamed from: a */
    private boolean m12173a(String str, int i, C3481j jVar) {
        HashMap<String, C3529i> hashMap;
        C3529i iVar;
        if (TextUtils.isEmpty(str) || (hashMap = this.f9588E) == null || (iVar = hashMap.get(str)) == null) {
            return false;
        }
        iVar.mo19880a(i, jVar);
        return true;
    }

    /* renamed from: b */
    public static JSONArray m12175b(List<C3498n> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(list.get(i).mo19674ar());
        }
        return jSONArray;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12177b(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C2859a.a1655274989226dc("_^opcZr~xl"), C2859a.a1655274989226dc("c`nofdel"));
            jSONObject2.put(C2859a.a1655274989226dc("_^abhidfkbUbh"), str);
            if (jSONObject != null) {
                jSONObject2.put(C2931g.g1655274989199dc("_^rbvdkt"), jSONObject);
            }
            m12199q(jSONObject2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m12179c(String str, JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C2931g.g1655274989199dc("_^opcZr~xl"), C2931g.g1655274989199dc("ewgmp"));
                jSONObject2.put(C2931g.g1655274989199dc("_^guakrXam"), str);
                if (jSONObject != null) {
                    jSONObject2.put(C2931g.g1655274989199dc("_^rbvdkt"), jSONObject);
                }
                m12199q(jSONObject2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private void m12180e(JSONObject jSONObject) throws Exception {
        if (!TextUtils.isEmpty(this.f9604j)) {
            jSONObject.put(C2885g.g1655274989219dc("chf"), this.f9604j);
        }
        if (!TextUtils.isEmpty(this.f9606l)) {
            jSONObject.put(C2885g.g1655274989219dc("lne\\a}rui"), this.f9606l);
        }
        if (!TextUtils.isEmpty(this.f9608n)) {
            jSONObject.put(C2885g.g1655274989219dc("dnumhjgcW|xg"), this.f9608n);
        }
        jSONObject.put(C2885g.g1655274989219dc(UserDataStore.DATE_OF_BIRTH), TextUtils.isEmpty(C3578m.m11241h().mo19973w()) ? C3578m.m11241h().mo19973w() : C2885g.g1655274989219dc("SF"));
        jSONObject.put(C2885g.g1655274989219dc("l`ldqdab"), C4014u.m13245k(C3578m.m11231a()));
    }

    /* renamed from: f */
    private void m12181f(JSONObject jSONObject) throws Exception {
        if (!TextUtils.isEmpty(C3501p.m10762b(this.f9611q))) {
            jSONObject.put(C2807f.f1655274989236dc("pmczegjbWz~r`h"), C3501p.m10762b(this.f9611q));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:4|5|6|(1:8)|9|10|(1:24)(2:12|(2:14|25)(2:15|23))|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0067 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0071 A[Catch:{ Exception -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12182g(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "TUCm`winlFhainz"
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x008e }
            r2 = 2
            byte[] r2 = android.util.Base64.decode(r9, r2)     // Catch:{ Exception -> 0x008e }
            r1.<init>(r2)     // Catch:{ Exception -> 0x008e }
            java.lang.String r2 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r0)     // Catch:{ Exception -> 0x008e }
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x008e }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x008e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x008e }
            int r1 = r2.length()     // Catch:{ Exception -> 0x008e }
            r3 = 0
        L_0x001d:
            if (r3 >= r1) goto L_0x00be
            com.bytedance.sdk.openadsdk.core.w$a r4 = new com.bytedance.sdk.openadsdk.core.w$a     // Catch:{ Exception -> 0x008e }
            r4.<init>()     // Catch:{ Exception -> 0x008e }
            org.json.JSONObject r5 = r2.optJSONObject(r3)     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x0067
            java.lang.String r6 = "_^opcZr~xl"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)     // Catch:{ all -> 0x0067 }
            r7 = 0
            java.lang.String r6 = r5.optString(r6, r7)     // Catch:{ all -> 0x0067 }
            r4.f9636a = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "_^abhidfkbUbh"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = r5.optString(r6, r7)     // Catch:{ all -> 0x0067 }
            r4.f9637b = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "ftl`"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = r5.optString(r6)     // Catch:{ all -> 0x0067 }
            r4.f9638c = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "p`pbiv"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)     // Catch:{ all -> 0x0067 }
            org.json.JSONObject r6 = r5.optJSONObject(r6)     // Catch:{ all -> 0x0067 }
            r4.f9639d = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "JRQGO"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)     // Catch:{ all -> 0x0067 }
            int r5 = r5.optInt(r6)     // Catch:{ all -> 0x0067 }
            r4.f9640e = r5     // Catch:{ all -> 0x0067 }
        L_0x0067:
            java.lang.String r5 = r4.f9636a     // Catch:{ Exception -> 0x008e }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x008e }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x008e }
            if (r5 != 0) goto L_0x008b
            java.lang.String r5 = r4.f9638c     // Catch:{ Exception -> 0x008e }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x008e }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x008e }
            if (r5 == 0) goto L_0x007c
            goto L_0x008b
        L_0x007c:
            com.bytedance.sdk.component.utils.x r5 = r8.f9600e     // Catch:{ Exception -> 0x008e }
            r6 = 11
            android.os.Message r5 = r5.obtainMessage(r6)     // Catch:{ Exception -> 0x008e }
            r5.obj = r4     // Catch:{ Exception -> 0x008e }
            com.bytedance.sdk.component.utils.x r4 = r8.f9600e     // Catch:{ Exception -> 0x008e }
            r4.sendMessage(r5)     // Catch:{ Exception -> 0x008e }
        L_0x008b:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x008e:
            boolean r1 = com.bytedance.sdk.component.utils.C2975l.m8381a()
            if (r1 == 0) goto L_0x00b1
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "f`koaa&sg)zj~~k/zbpa}qqr8ti|<lkzUD\u0002"
            java.lang.String r2 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r2)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.bytedance.sdk.component.utils.C2975l.m8390d(r0, r9)
            goto L_0x00be
        L_0x00b1:
            java.lang.String r9 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r0)
            java.lang.String r0 = "f`koaa&sg)zj~~k/zbpa}qqr8ti|<lkzUD"
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r0)
            com.bytedance.sdk.component.utils.C2975l.m8390d(r9, r0)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.m12182g(java.lang.String):void");
    }

    /* renamed from: g */
    private void m12183g(JSONObject jSONObject) {
        C3185u uVar;
        if (jSONObject != null && (uVar = this.f9591H) != null) {
            uVar.mo18819b(jSONObject);
        }
    }

    /* renamed from: h */
    private void m12184h(JSONObject jSONObject) {
        C3804b bVar = this.f9584A;
        if (bVar != null && jSONObject != null) {
            bVar.mo18477a(jSONObject.optBoolean(C2927d.d1655274989178dc("irPfjacu[|i"), false), jSONObject.optInt(C2927d.d1655274989178dc("cnff"), -1), jSONObject.optString(C2927d.d1655274989178dc("mre"), ""));
        }
    }

    /* renamed from: h */
    private boolean m12185h(String str) {
        return TextUtils.isEmpty(str) || !C2928e.e1655274989197dc("cmk`oZis`lx").equals(str) || mo20465k();
    }

    /* renamed from: i */
    private String m12186i(String str) {
        if (this.f9612r != null) {
            return str;
        }
        int i = this.f9607m;
        while (true) {
            char c = '_';
            char c2 = '_';
            while (true) {
                switch (c) {
                    case '^':
                        if (c2 != '\'') {
                            break;
                        } else {
                            continue;
                        }
                    case '_':
                        switch (c2) {
                            case '^':
                            case '`':
                                continue;
                            case '_':
                                break;
                        }
                    case '`':
                        break;
                }
                switch (c2) {
                    case '8':
                        break;
                }
                c = '^';
                c2 = '}';
            }
        }
        return C4014u.m13181a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m12187i(JSONObject jSONObject) {
        if (this.f9613s != null && jSONObject != null) {
            try {
                this.f9613s.mo18495a(jSONObject.optBoolean(C2933b.b1655274989200dc("mtvf"), false));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r0 = r1.length();
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12188j(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "bxvf`dhdm3%$"
            java.lang.String r0 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r0)
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            java.lang.String r0 = "bxvf`dhdm3%$hd}qeq{Kxsdkx}~3"
            java.lang.String r0 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r0)
            java.lang.String r1 = "bxvf`dhdm3%$|gyqew<gpbe}jowh2"
            java.lang.String r1 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r1)
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0032
            android.webkit.WebView r3 = r2.m12194o()     // Catch:{ Exception -> 0x0064 }
            if (r3 == 0) goto L_0x0064
            java.lang.String r0 = "j`tbwftnx}0_cxzfq~X@Vgs|4Dzxj|HpWFQ@\u000e\u000e"
            java.lang.String r0 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r0)     // Catch:{ Exception -> 0x0064 }
            com.bytedance.sdk.component.utils.C2971k.m8372a(r3, r0)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0064
        L_0x0032:
            boolean r0 = r3.startsWith(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
            int r0 = r1.length()     // Catch:{ Exception -> 0x0064 }
            r1 = 38
            int r1 = r3.indexOf(r1, r0)     // Catch:{ Exception -> 0x0064 }
            if (r1 > 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.String r0 = r3.substring(r0, r1)     // Catch:{ Exception -> 0x0064 }
            int r1 = r1 + 1
            java.lang.String r3 = r3.substring(r1)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r1 = "SBGMAZ@B\\JBZYH[J"
            java.lang.String r1 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r1)     // Catch:{ Exception -> 0x0064 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
            int r0 = r3.length()     // Catch:{ Exception -> 0x0064 }
            if (r0 <= 0) goto L_0x0064
            r2.m12182g((java.lang.String) r3)     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.m12188j(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m12189j(JSONObject jSONObject) {
        if (this.f9613s != null && jSONObject != null) {
            try {
                this.f9613s.mo18494a(jSONObject.optInt(C2807f.f1655274989236dc("sucwaQwm"), -1));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: k */
    private boolean m12190k(JSONObject jSONObject) {
        C3617j jVar = this.f9613s;
        if (!(jVar == null || jSONObject == null)) {
            double c = (double) jVar.mo18498c();
            int d = this.f9613s.mo18499d();
            try {
                jSONObject.put(C2807f.f1655274989236dc("ctpqakrSado"), c / 1000.0d);
                jSONObject.put(C2807f.f1655274989236dc("sucwa"), d);
                String f1655274989236dc = C2807f.f1655274989236dc("TUCm`winlFhainz");
                C2975l.m8384b(f1655274989236dc, C2807f.f1655274989236dc("ctpqakrSado'yo{u+") + d);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0117, code lost:
        switch(r2) {
            case 40: goto L_0x0117;
            case 41: goto L_0x011b;
            case 42: goto L_0x011e;
            default: goto L_0x011a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        switch(r1) {
            case 70: goto L_0x0102;
            case 71: goto L_0x0102;
            case 72: goto L_0x0111;
            default: goto L_0x011e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011e, code lost:
        r4 = '6';
        r2 = 'Q';
        r1 = '[';
     */
    @com.bytedance.JProtect
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12191l(org.json.JSONObject r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            com.bytedance.sdk.component.adexpress.b.j r2 = r0.f9612r
            if (r2 == 0) goto L_0x013c
            if (r1 != 0) goto L_0x000c
            goto L_0x013c
        L_0x000c:
            com.bytedance.sdk.component.adexpress.b.m r2 = new com.bytedance.sdk.component.adexpress.b.m
            r2.<init>()
            r3 = 1
            r2.mo16783a((int) r3)
            java.lang.String r4 = "irPfjacu[|i"
            java.lang.String r4 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r4)     // Catch:{ Exception -> 0x012b }
            boolean r4 = r1.optBoolean(r4)     // Catch:{ Exception -> 0x012b }
            java.lang.String r5 = "AeQj~`"
            java.lang.String r5 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r5)     // Catch:{ Exception -> 0x012b }
            org.json.JSONObject r5 = r1.optJSONObject(r5)     // Catch:{ Exception -> 0x012b }
            java.lang.String r6 = "hdkdlq"
            java.lang.String r7 = "whfwl"
            r8 = 0
            if (r5 == 0) goto L_0x0042
            java.lang.String r8 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r7)     // Catch:{ Exception -> 0x012b }
            double r8 = r5.optDouble(r8)     // Catch:{ Exception -> 0x012b }
            java.lang.String r10 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r6)     // Catch:{ Exception -> 0x012b }
            double r10 = r5.optDouble(r10)     // Catch:{ Exception -> 0x012b }
            goto L_0x0043
        L_0x0042:
            r10 = r8
        L_0x0043:
            java.lang.String r5 = "vhffkLhag"
            java.lang.String r5 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r5)     // Catch:{ Exception -> 0x012b }
            org.json.JSONObject r5 = r1.optJSONObject(r5)     // Catch:{ Exception -> 0x012b }
            if (r5 == 0) goto L_0x00ca
            java.lang.String r12 = "x"
            java.lang.String r12 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r12)     // Catch:{ Exception -> 0x00c5 }
            double r12 = r5.optDouble(r12)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r14 = "y"
            java.lang.String r14 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r14)     // Catch:{ Exception -> 0x00c5 }
            double r14 = r5.optDouble(r14)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r7)     // Catch:{ Exception -> 0x00c5 }
            r16 = r4
            double r3 = r5.optDouble(r7)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)     // Catch:{ Exception -> 0x00c5 }
            double r6 = r5.optDouble(r6)     // Catch:{ Exception -> 0x00c5 }
            boolean r17 = r0.m12192m(r5)     // Catch:{ Exception -> 0x00c5 }
            if (r17 == 0) goto L_0x00b6
            java.lang.String r17 = "bnpgawTfl`xXb~Cuwf"
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r17)     // Catch:{ Exception -> 0x00c5 }
            r17 = r10
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.mo16782a((float) r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "bnpgawTfl`xXb~]yvzg"
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r0)     // Catch:{ Exception -> 0x00c5 }
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.mo16789b((float) r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "bnpgawTfl`xNbz{|^vra"
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r0)     // Catch:{ Exception -> 0x00c5 }
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.mo16794c((float) r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "bnpgawTfl`xNbz{|@zs}b"
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r0)     // Catch:{ Exception -> 0x00c5 }
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.mo16797d((float) r0)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00b8
        L_0x00b6:
            r17 = r10
        L_0x00b8:
            r2.mo16793c((double) r12)     // Catch:{ Exception -> 0x00c5 }
            r2.mo16796d((double) r14)     // Catch:{ Exception -> 0x00c5 }
            r2.mo16799e(r3)     // Catch:{ Exception -> 0x00c5 }
            r2.mo16801f(r6)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00ce
        L_0x00c5:
            r1 = 101(0x65, float:1.42E-43)
            r0 = r19
            goto L_0x012d
        L_0x00ca:
            r16 = r4
            r17 = r10
        L_0x00ce:
            java.lang.String r0 = "mdqpebc"
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r0)     // Catch:{ Exception -> 0x0129 }
            r3 = 101(0x65, float:1.42E-43)
            java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C3513g.m10825a(r3)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r0 = r1.optString(r0, r4)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r4 = "cnff"
            java.lang.String r4 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r4)     // Catch:{ Exception -> 0x0125 }
            int r1 = r1.optInt(r4, r3)     // Catch:{ Exception -> 0x0125 }
            r3 = r16
            r2.mo16785a((boolean) r3)     // Catch:{ Exception -> 0x0129 }
            r2.mo16781a((double) r8)     // Catch:{ Exception -> 0x0129 }
            r8 = r17
            r2.mo16788b((double) r8)     // Catch:{ Exception -> 0x0129 }
            r2.mo16784a((java.lang.String) r0)     // Catch:{ Exception -> 0x0129 }
            r2.mo16790b((int) r1)     // Catch:{ Exception -> 0x0129 }
            r0 = r19
            com.bytedance.sdk.component.adexpress.b.j r1 = r0.f9612r     // Catch:{ Exception -> 0x012b }
            r1.mo16748a(r2)     // Catch:{ Exception -> 0x012b }
        L_0x0102:
            r1 = -84
            r3 = 17
            r2 = r3
        L_0x0107:
            if (r2 == r3) goto L_0x010f
        L_0x0109:
            switch(r1) {
                case 89: goto L_0x0102;
                case 90: goto L_0x0102;
                case 91: goto L_0x013c;
                default: goto L_0x010c;
            }
        L_0x010c:
            r1 = 90
            goto L_0x0109
        L_0x010f:
            r4 = 11
        L_0x0111:
            r4 = 56
        L_0x0113:
            switch(r4) {
                case 54: goto L_0x0107;
                case 55: goto L_0x0117;
                case 56: goto L_0x011e;
                default: goto L_0x0116;
            }
        L_0x0116:
            goto L_0x0111
        L_0x0117:
            switch(r2) {
                case 40: goto L_0x0117;
                case 41: goto L_0x011b;
                case 42: goto L_0x011e;
                default: goto L_0x011a;
            }
        L_0x011a:
            goto L_0x011e
        L_0x011b:
            switch(r1) {
                case 70: goto L_0x0102;
                case 71: goto L_0x0102;
                case 72: goto L_0x0111;
                default: goto L_0x011e;
            }
        L_0x011e:
            r4 = 54
            r2 = 81
            r1 = 91
            goto L_0x0113
        L_0x0125:
            r0 = r19
            r1 = r3
            goto L_0x012d
        L_0x0129:
            r0 = r19
        L_0x012b:
            r1 = 101(0x65, float:1.42E-43)
        L_0x012d:
            r2.mo16790b((int) r1)
            java.lang.String r1 = com.bytedance.sdk.openadsdk.core.C3513g.m10825a(r1)
            r2.mo16784a((java.lang.String) r1)
            com.bytedance.sdk.component.adexpress.b.j r1 = r0.f9612r
            r1.mo16748a(r2)
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.m12191l(org.json.JSONObject):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: m */
    private boolean m12192m(org.json.JSONObject r5) {
        /*
            r4 = this;
            java.lang.String r0 = "bnpgawTfl`xXb~Cuwf"
            java.lang.String r0 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r0)
            boolean r0 = r5.has(r0)
            r1 = 0
            r2 = 56
            r3 = 60
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "bnpgawTfl`xNbz{|^vra"
            java.lang.String r0 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r0)
            boolean r0 = r5.has(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "bnpgawTfl`xXb~]yvzg"
            java.lang.String r0 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r0)
            boolean r0 = r5.has(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "bnpgawTfl`xNbz{|@zs}b"
            java.lang.String r0 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r0)
            boolean r5 = r5.has(r0)
            goto L_0x0043
        L_0x0034:
            r5 = r1
        L_0x0035:
            r0 = 41
        L_0x0037:
            switch(r0) {
                case 40: goto L_0x003b;
                case 41: goto L_0x0055;
                case 42: goto L_0x0035;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0035
        L_0x003b:
            switch(r3) {
                case 81: goto L_0x003f;
                case 82: goto L_0x0049;
                case 83: goto L_0x0047;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0055
        L_0x003f:
            switch(r2) {
                case 29: goto L_0x0047;
                case 30: goto L_0x0047;
                case 31: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x0049
        L_0x0043:
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x004d
        L_0x0047:
            r1 = r5
            goto L_0x0055
        L_0x0049:
            switch(r2) {
                case 39: goto L_0x004d;
                case 40: goto L_0x0034;
                case 41: goto L_0x0055;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0052
        L_0x004d:
            r0 = 40
            r3 = 83
            goto L_0x0037
        L_0x0052:
            r2 = 39
            goto L_0x0049
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.m12192m(org.json.JSONObject):boolean");
    }

    /* renamed from: n */
    private void m12193n(JSONObject jSONObject) {
        if (jSONObject != null) {
            C2975l.m8384b(C2807f.f1655274989236dc("TUCm`winlFhainz"), C2807f.f1655274989236dc("TUCm`winlFhainz/xp|wxpdSaw{vu~JmABI"));
            try {
                Uri parse = Uri.parse(jSONObject.optString(C2807f.f1655274989236dc("tsc`oAgsi")));
                if (C2807f.f1655274989236dc("bxvf`dhdm").equals(parse.getScheme().toLowerCase())) {
                    C3999i.m13114a(parse, this);
                    char c = '8';
                    char c2 = Typography.less;
                    while (true) {
                        char c3 = ')';
                        while (true) {
                            switch (c3) {
                                case '(':
                                    switch (c2) {
                                        case 'Q':
                                            switch (c) {
                                                case 29:
                                                case 30:
                                                case 31:
                                                    return;
                                            }
                                        case 'R':
                                            break;
                                        case 'S':
                                            return;
                                    }
                                    while (true) {
                                        switch (c) {
                                            case '\'':
                                                break;
                                            case '(':
                                            case ')':
                                                continue;
                                            default:
                                                c = '\'';
                                        }
                                    }
                                    break;
                                case ')':
                                    break;
                            }
                            c3 = '(';
                            c2 = 'S';
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: o */
    private WebView m12194o() {
        WeakReference<SSWebView> weakReference = this.f9599d;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return ((SSWebView) this.f9599d.get()).getWebView();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        switch(r5) {
            case 29: goto L_0x0045;
            case 30: goto L_0x0025;
            case 31: goto L_0x0035;
            default: goto L_0x0032;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r5 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12195o(org.json.JSONObject r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0045
            com.bytedance.sdk.openadsdk.e.d r0 = r4.f9615u
            if (r0 != 0) goto L_0x0007
            goto L_0x0045
        L_0x0007:
            r0 = 0
            r1 = 0
            java.lang.String r2 = "tdobmUthl|iEi}"
            java.lang.String r2 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r2)     // Catch:{ Exception -> 0x0040 }
            org.json.JSONArray r5 = r5.optJSONArray(r2)     // Catch:{ Exception -> 0x0040 }
            if (r5 == 0) goto L_0x003a
            int r2 = r5.length()     // Catch:{ Exception -> 0x0040 }
            if (r2 <= 0) goto L_0x003a
            com.bytedance.sdk.openadsdk.e.d r2 = r4.f9615u     // Catch:{ Exception -> 0x0040 }
            r3 = 1
            r2.mo18527a(r3, r5)     // Catch:{ Exception -> 0x0040 }
            r5 = 72
            r0 = 95
        L_0x0025:
            r1 = 38
        L_0x0027:
            switch(r1) {
                case 38: goto L_0x0035;
                case 39: goto L_0x002b;
                case 40: goto L_0x0025;
                default: goto L_0x002a;
            }     // Catch:{ Exception -> 0x0040 }
        L_0x002a:
            goto L_0x0025
        L_0x002b:
            switch(r0) {
                case 52: goto L_0x0045;
                case 53: goto L_0x0035;
                case 54: goto L_0x002f;
                default: goto L_0x002e;
            }     // Catch:{ Exception -> 0x0040 }
        L_0x002e:
            goto L_0x0025
        L_0x002f:
            switch(r5) {
                case 29: goto L_0x0045;
                case 30: goto L_0x0025;
                case 31: goto L_0x0035;
                default: goto L_0x0032;
            }     // Catch:{ Exception -> 0x0040 }
        L_0x0032:
            r5 = 31
            goto L_0x002f
        L_0x0035:
            r1 = 39
            r0 = 52
            goto L_0x0027
        L_0x003a:
            com.bytedance.sdk.openadsdk.e.d r5 = r4.f9615u     // Catch:{ Exception -> 0x0040 }
            r5.mo18527a(r1, r0)     // Catch:{ Exception -> 0x0040 }
            goto L_0x0045
        L_0x0040:
            com.bytedance.sdk.openadsdk.e.d r5 = r4.f9615u
            r5.mo18527a(r1, r0)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.m12195o(org.json.JSONObject):void");
    }

    @JProtect
    /* renamed from: p */
    private JSONObject m12196p() {
        try {
            View view = (View) this.f9605k.get();
            View view2 = (View) this.f9599d.get();
            if (view != null) {
                if (view2 != null) {
                    int[] b = C4020v.m13304b(view);
                    int[] b2 = C4020v.m13304b(view2);
                    if (b != null) {
                        if (b2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(C2807f.f1655274989236dc("x"), C4020v.m13311d(C3578m.m11231a(), (float) (b[0] - b2[0])));
                            jSONObject.put(C2807f.f1655274989236dc("y"), C4020v.m13311d(C3578m.m11231a(), (float) (b[1] - b2[1])));
                            jSONObject.put(C2807f.f1655274989236dc("w"), C4020v.m13311d(C3578m.m11231a(), (float) view.getWidth()));
                            jSONObject.put(C2807f.f1655274989236dc("h"), C4020v.m13311d(C3578m.m11231a(), (float) view.getHeight()));
                            jSONObject.put(C2807f.f1655274989236dc("irG{mvr"), true);
                            return jSONObject;
                        }
                    }
                    C2975l.m8391e(C2807f.f1655274989236dc("TUCm`winlFhainz"), C2807f.f1655274989236dc("sdv@hjubJ|~ccGav~2vfgye8iuhuiwpN\u0001MQ\u0004RCE~@O\\|B]FDX]]\u0014\\E\u0017VLVW"));
                    return null;
                }
            }
            C2975l.m8391e(C2807f.f1655274989236dc("TUCm`winlFhainz"), C2807f.f1655274989236dc("sdv@hjubJ|~ccGav~2vfgye8zvtox\\jTUMM\u0004LU\u0007F\\FG"));
            return null;
        } catch (Throwable th) {
            C2975l.m8379a(C2807f.f1655274989236dc("TUCm`winlFhainz"), C2807f.f1655274989236dc("sdv@hjubJ|~ccGav~2vfgye"), th);
            return null;
        }
    }

    /* renamed from: p */
    private boolean m12197p(JSONObject jSONObject) {
        try {
            jSONObject.put(C2859a.a1655274989226dc("csgbplpb{"), m12175b(this.f9587D));
            while (true) {
                char c = '_';
                char c2 = '_';
                while (true) {
                    switch (c) {
                        case '^':
                            if (c2 != '\'') {
                                break;
                            } else {
                                continue;
                            }
                        case '_':
                            switch (c2) {
                                case '^':
                                case '`':
                                    continue;
                                case '_':
                                    break;
                            }
                        case '`':
                            break;
                    }
                    switch (c2) {
                        case '7':
                        case '8':
                        case '9':
                            break;
                    }
                    c = '^';
                    c2 = '}';
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: q */
    private List<String> m12198q() {
        return Arrays.asList(new String[]{C2931g.g1655274989199dc("aqrJjci"), C2931g.g1655274989199dc("aeKmbj"), C2933b.b1655274989200dc("gdvWahvki}oBbka"), C2933b.b1655274989200dc("gdvWaHgnImy")});
    }

    /* renamed from: q */
    private void m12199q(JSONObject jSONObject) {
        WebView o;
        if (jSONObject != null && (o = m12194o()) != null) {
            String str = C2931g.g1655274989199dc("j`tbwftnx}0_cxzfq~X@Vgs|4Dt|p{LDoFWVG@MoXDAyAZDXS\\\u001c") + jSONObject.toString() + C2931g.g1655274989199dc(")");
            C2971k.m8372a(o, str);
            if (C2975l.m8381a()) {
                C2975l.m8378a(C2931g.g1655274989199dc("TUCm`winlFhainz"), C2931g.g1655274989199dc("jr]nwb&") + str);
            }
        }
    }

    /* renamed from: r */
    private JSONObject m12200r(JSONObject jSONObject) {
        if (this.f9596a != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String optString = jSONObject.optString(C2928e.e1655274989197dc("ae]f|qtfWmkm"), (String) null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                for (Map.Entry next : this.f9596a.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
                jSONObject.put(C2928e.e1655274989197dc("ae]f|qtfWmkm"), jSONObject2.toString());
            } catch (Exception e) {
                C2975l.m8383b(e.toString());
            }
        }
        return jSONObject;
    }

    /* renamed from: r */
    private void m12201r() {
        C3811h hVar = this.f9585B;
        if (hVar != null) {
            hVar.mo19144a();
        }
    }

    /* renamed from: s */
    private void m12202s() {
        C3811h hVar = this.f9585B;
        if (hVar != null) {
            hVar.mo19145b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m12203t() {
        C3617j jVar = this.f9613s;
        if (jVar != null) {
            jVar.mo18493a();
            char c = '\\';
            while (true) {
                char c2 = 14;
                while (true) {
                    switch (c2) {
                        case 13:
                            break;
                        case 14:
                            break;
                        case 15:
                            switch (c) {
                                case '_':
                                    return;
                            }
                    }
                    c2 = 15;
                    c = '_';
                }
            }
        }
    }

    /* renamed from: u */
    private void m12204u() {
        WeakReference<Context> weakReference = this.f9602h;
        if (weakReference != null && weakReference.get() != null && !TextUtils.isEmpty(C3578m.m11241h().mo19969s())) {
            TTWebsiteActivity.m8985a((Context) this.f9602h.get(), this.f9611q, this.f9593J);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0 A[Catch:{ Exception -> 0x00c2 }] */
    @com.bytedance.JProtect
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m12205v() {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.sdk.openadsdk.core.i.f r1 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()
            if (r1 == 0) goto L_0x00c2
            com.bytedance.sdk.openadsdk.core.e.n r1 = r10.f9611q     // Catch:{ Exception -> 0x00c2 }
            int r1 = com.bytedance.sdk.openadsdk.utils.C4014u.m13223f((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f9611q     // Catch:{ Exception -> 0x00c2 }
            int r2 = com.bytedance.sdk.openadsdk.utils.C4014u.m13219e((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r2)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.i.f r3 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2 }
            int r3 = r3.mo19941f((java.lang.String) r4)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.i.f r4 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()     // Catch:{ Exception -> 0x00c2 }
            int r4 = r4.mo19937e((int) r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.i.f r5 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2 }
            boolean r5 = r5.mo19933c((java.lang.String) r6)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r6 = r10.f9611q     // Catch:{ Exception -> 0x00c2 }
            boolean r6 = com.bytedance.sdk.openadsdk.core.p151e.C3498n.m10583c((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r6)     // Catch:{ Exception -> 0x00c2 }
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L_0x0051
            com.bytedance.sdk.openadsdk.core.i.f r6 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2 }
            int r6 = r6.mo19953j((java.lang.String) r9)     // Catch:{ Exception -> 0x00c2 }
            if (r6 != r7) goto L_0x0051
            r6 = r7
            goto L_0x0052
        L_0x0051:
            r6 = r8
        L_0x0052:
            r9 = 7
            if (r2 == r9) goto L_0x0063
            r9 = 8
            if (r2 != r9) goto L_0x005a
            goto L_0x0063
        L_0x005a:
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()     // Catch:{ Exception -> 0x00c2 }
            boolean r1 = r2.mo19927a((int) r1)     // Catch:{ Exception -> 0x00c2 }
            goto L_0x006b
        L_0x0063:
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()     // Catch:{ Exception -> 0x00c2 }
            boolean r1 = r2.mo19929b((int) r1)     // Catch:{ Exception -> 0x00c2 }
        L_0x006b:
            java.lang.String r2 = "vnk`aZehf}xd`"
            java.lang.String r2 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r2)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "rw]polvX|`gn"
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "fw]polvX{ae|"
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r5)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "iw]polvX|`gn"
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r4)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "simt[aotd`an"
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f9611q     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00a2
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f9611q     // Catch:{ Exception -> 0x00c2 }
            boolean r2 = r2.mo19672ap()     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r7 = r8
        L_0x00a3:
            r0.put(r1, r7)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "vhffkZgciy~jxdaa"
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f9611q     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00b6
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f9611q     // Catch:{ Exception -> 0x00c2 }
            int r8 = r2.mo19746t()     // Catch:{ Exception -> 0x00c2 }
        L_0x00b6:
            r0.put(r1, r8)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "sjks[fnffnoTxbQl|~av"
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r6)     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.m12205v():org.json.JSONObject");
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m12206w() {
        Context context;
        List<C3498n> list = this.f9587D;
        if (list != null && list.size() > 0) {
            this.f9588E = new HashMap<>();
            View view = null;
            WeakReference<SSWebView> weakReference = this.f9599d;
            if (weakReference != null) {
                view = (View) weakReference.get();
            }
            WeakReference<Context> weakReference2 = this.f9602h;
            if (weakReference2 != null && (context = (Context) weakReference2.get()) != null) {
                for (C3498n next : this.f9587D) {
                    this.f9588E.put(next.mo19622Y(), new C3529i(context, next, view));
                }
            }
        }
    }

    /* renamed from: x */
    private boolean m12207x() {
        C3498n nVar = this.f9611q;
        if (nVar == null || nVar.mo19667ak() == null || C3501p.m10761a(this.f9611q) || this.f9589F || this.f9611q.mo19667ak().optInt(C2859a.a1655274989226dc("p`pfjqYsqyo")) != 2) {
            return false;
        }
        int e = C4014u.m13219e(this.f9611q);
        if (e != 8 && e != 7) {
            return false;
        }
        this.f9589F = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        switch(r2) {
            case 55: goto L_0x000f;
            case 56: goto L_0x000f;
            case 57: goto L_0x000f;
            default: goto L_0x001d;
        };
     */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12208y() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.e.c r0 = r3.f9603i
            r1 = 95
            if (r0 != 0) goto L_0x000f
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f9611q
            com.bytedance.sdk.openadsdk.e.a r0 = com.bytedance.sdk.openadsdk.p168e.C3789a.m12449a((com.bytedance.sdk.openadsdk.p168e.C3790b) r3, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r0)
            r3.f9603i = r0
            goto L_0x0022
        L_0x000f:
            r0 = 94
            r2 = 125(0x7d, float:1.75E-43)
        L_0x0013:
            switch(r0) {
                case 94: goto L_0x001e;
                case 95: goto L_0x0017;
                case 96: goto L_0x001a;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x000f
        L_0x0017:
            switch(r2) {
                case 94: goto L_0x0022;
                case 95: goto L_0x000f;
                case 96: goto L_0x0022;
                default: goto L_0x001a;
            }
        L_0x001a:
            switch(r2) {
                case 55: goto L_0x000f;
                case 56: goto L_0x000f;
                case 57: goto L_0x000f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0025
        L_0x001e:
            r0 = 39
            if (r2 != r0) goto L_0x0025
        L_0x0022:
            r0 = r1
            r2 = r0
            goto L_0x0013
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.m12208y():void");
    }

    /* renamed from: a */
    public C2582r mo20419a() {
        return this.f9592I;
    }

    /* renamed from: a */
    public C3728w mo20420a(int i) {
        this.f9609o = i;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        switch(r1) {
            case 91: goto L_0x001b;
            case 92: goto L_0x0000;
            case 93: goto L_0x001b;
            default: goto L_0x001a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = '[';
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.core.C3728w mo20421a(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            r0 = 93
            r1 = r0
        L_0x0003:
            switch(r0) {
                case 92: goto L_0x000b;
                case 93: goto L_0x0017;
                case 94: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0000
        L_0x0007:
            r0 = 4
            if (r1 > r0) goto L_0x000f
            goto L_0x0000
        L_0x000b:
            switch(r1) {
                case 21: goto L_0x0000;
                case 22: goto L_0x000f;
                case 23: goto L_0x001b;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0017
        L_0x000f:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f9605k = r0
            return r2
        L_0x0017:
            switch(r1) {
                case 91: goto L_0x001b;
                case 92: goto L_0x0000;
                case 93: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0020
        L_0x001b:
            r0 = 94
            r1 = 75
            goto L_0x0003
        L_0x0020:
            r1 = 91
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.mo20421a(android.view.View):com.bytedance.sdk.openadsdk.core.w");
    }

    /* renamed from: a */
    public C3728w mo20422a(C2631j jVar) {
        this.f9612r = jVar;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20423a(SSWebView sSWebView) {
        String e1655274989197dc = C2928e.e1655274989197dc("wd`um`qwgff");
        C2975l.m8391e(e1655274989197dc, C2927d.d1655274989178dc("=<?vw`Ltj;*|ioXfuf2{uf~Tw}!") + sSWebView.hashCode());
        if (sSWebView == null && sSWebView.getWebView() == null) {
            return this;
        }
        try {
            C2582r b = C2582r.m6570a(sSWebView.getWebView()).mo16572a((C2554a) new C3793a()).mo16574a(C2927d.d1655274989178dc("TnwwmdiM[Kxbhjk")).mo16573a((C2574l) new C2574l() {
                /* renamed from: a */
                public <T> T mo16585a(String str, Type type) {
                    return null;
                }

                /* renamed from: a */
                public <T> String mo16586a(T t) {
                    return null;
                }
            }).mo16575a(C3524h.m10852d().mo19869s()).mo16576b(true).mo16571a().mo16577b();
            this.f9592I = b;
            C3802e.m12493a(b, this);
            C3794a.m12472a(this.f9592I, this);
            C3797b.m12480a(this.f9592I, this);
            C3799c.m12485a(this.f9592I, this);
            C3801d.m12490a(this.f9592I, this);
        } catch (Exception unused) {
        }
        return this;
    }

    /* renamed from: a */
    public C3728w mo20424a(C3185u uVar) {
        this.f9591H = uVar;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20425a(C3431d dVar) {
        this.f9620z = dVar;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20426a(C3498n nVar) {
        this.f9611q = nVar;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20427a(C3617j jVar) {
        this.f9613s = jVar;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20428a(C3792d dVar) {
        this.f9615u = dVar;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20429a(C3803a aVar) {
        this.f9616v = aVar;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20430a(C3804b bVar) {
        this.f9584A = bVar;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20431a(C3806d dVar) {
        this.f9618x = dVar;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20432a(C3807e eVar) {
        this.f9617w = eVar;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20433a(C3811h hVar) {
        this.f9585B = hVar;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20434a(List<C3498n> list) {
        this.f9587D = list;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20435a(Map<String, Object> map) {
        this.f9596a = map;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20436a(JSONObject jSONObject) {
        this.f9614t = jSONObject;
        return this;
    }

    /* renamed from: a */
    public C3728w mo20437a(boolean z) {
        this.f9597b = z;
        return this;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x042a, code lost:
        if (r5 != null) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x045a, code lost:
        if (r5 != null) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x045c, code lost:
        r3 = r5;
     */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo20438a(com.bytedance.sdk.openadsdk.core.C3728w.C3738a r22, int r23) throws java.lang.Exception {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "c`no"
            java.lang.String r3 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r3)
            java.lang.String r4 = r1.f9636a
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0016
            r1 = 0
            return r1
        L_0x0016:
            com.bytedance.sdk.openadsdk.core.h r3 = com.bytedance.sdk.openadsdk.core.C3524h.m10852d()
            boolean r3 = r3.mo19869s()
            java.lang.String r4 = "TUCm`winlFhainz"
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[KQA)WCVU)|n~~g`~+"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " lgwljb="
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            r5.append(r6)
            java.lang.String r6 = r1.f9638c
            r5.append(r6)
            java.lang.String r6 = " qcqehu:"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            r5.append(r6)
            org.json.JSONObject r6 = r1.f9639d
            if (r6 == 0) goto L_0x0059
            org.json.JSONObject r6 = r1.f9639d
            java.lang.String r6 = r6.toString()
            goto L_0x005b
        L_0x0059:
            java.lang.String r6 = ""
        L_0x005b:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
        L_0x0065:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r5 = r1.f9638c
            int r6 = r5.hashCode()
            r7 = 3
            r8 = 0
            java.lang.String r9 = "oqgmTwoqijs"
            r10 = -1
            r11 = 1
            switch(r6) {
                case -2036781162: goto L_0x028b;
                case -1423303823: goto L_0x027d;
                case -1330994877: goto L_0x026e;
                case -1169135450: goto L_0x025f;
                case -1023873614: goto L_0x0250;
                case -844321441: goto L_0x0241;
                case -800853518: goto L_0x0232;
                case -794273169: goto L_0x0223;
                case -715147645: goto L_0x0214;
                case -511324706: goto L_0x0206;
                case -489318846: goto L_0x01f6;
                case -278382602: goto L_0x01e6;
                case -173752734: goto L_0x01d7;
                case 27837080: goto L_0x01c7;
                case 94756344: goto L_0x01b7;
                case 105049135: goto L_0x01a7;
                case 399543522: goto L_0x0197;
                case 402955465: goto L_0x0188;
                case 425443791: goto L_0x0178;
                case 442647767: goto L_0x0168;
                case 571273292: goto L_0x0158;
                case 650209982: goto L_0x0149;
                case 672928467: goto L_0x0139;
                case 711635577: goto L_0x0129;
                case 885131792: goto L_0x0119;
                case 1107374321: goto L_0x0109;
                case 1151744482: goto L_0x00f9;
                case 1237100796: goto L_0x00e9;
                case 1532142616: goto L_0x00d9;
                case 1634511418: goto L_0x00c9;
                case 1713585602: goto L_0x00b9;
                case 1731806400: goto L_0x00aa;
                case 1979895452: goto L_0x009b;
                case 2086000188: goto L_0x008b;
                case 2105008900: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x029a
        L_0x007b:
            java.lang.String r6 = "l`lgwfgwmVigene"
            java.lang.String r6 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 16
            goto L_0x029b
        L_0x008b:
            java.lang.String r6 = "sjksRlbbg"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 20
            goto L_0x029b
        L_0x009b:
            java.lang.String r6 = "sdlgHja"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 2
            goto L_0x029b
        L_0x00aa:
            java.lang.String r6 = "pmczegjbWz~r`h"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = r7
            goto L_0x029b
        L_0x00b9:
            java.lang.String r6 = "gdvMaqqhzbNjxl"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 26
            goto L_0x029b
        L_0x00c9:
            java.lang.String r6 = "eof`ewbXdfko"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 27
            goto L_0x029b
        L_0x00d9:
            java.lang.String r6 = "rdolr`Jhimcek"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 10
            goto L_0x029b
        L_0x00e9:
            java.lang.String r6 = "rdlgawBnlOcee~f"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 18
            goto L_0x029b
        L_0x00f9:
            java.lang.String r6 = "mtvfRlbbg"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 21
            goto L_0x029b
        L_0x0109:
            java.lang.String r6 = "p`wpaRce^`o|Xdcjbb"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 29
            goto L_0x029b
        L_0x0119:
            java.lang.String r6 = "gdvUkisjm"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 9
            goto L_0x029b
        L_0x0129:
            java.lang.String r6 = "gdv@qwtbf}\\bhha\\dpfv"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 23
            goto L_0x029b
        L_0x0139:
            java.lang.String r6 = "c`l`aiYcg~dgcljPqabLuq"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 14
            goto L_0x029b
        L_0x0149:
            java.lang.String r6 = "gdvWahvki}oBbka"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 4
            goto L_0x029b
        L_0x0158:
            java.lang.String r6 = "dxlbileSzhi`"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 19
            goto L_0x029b
        L_0x0168:
            java.lang.String r6 = "sdlgV`qfzm"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 11
            goto L_0x029b
        L_0x0178:
            java.lang.String r6 = "gdvMeqoqmZciN{|d~Wuaw"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 33
            goto L_0x029b
        L_0x0188:
            java.lang.String r6 = "irTjargedl"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 6
            goto L_0x029b
        L_0x0197:
            java.lang.String r6 = "gdv@hjubJ|~ccGav~"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 8
            goto L_0x029b
        L_0x01a7:
            java.lang.String r6 = "uoqvfveuakoTm}~Pqu"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 15
            goto L_0x029b
        L_0x01b7:
            java.lang.String r6 = "cmmpa"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 34
            goto L_0x029b
        L_0x01c7:
            java.lang.String r6 = "dnumhjgcWhz{Slj"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 13
            goto L_0x029b
        L_0x01d7:
            java.lang.String r6 = "gdvWaHgnImy"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 5
            goto L_0x029b
        L_0x01e6:
            java.lang.String r6 = "sdlg[qcji`U{~bjzseMzpf"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 24
            goto L_0x029b
        L_0x01f6:
            java.lang.String r6 = "gdvNeqcuahfFiyo"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 25
            goto L_0x029b
        L_0x0206:
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r9)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 31
            goto L_0x029b
        L_0x0214:
            java.lang.String r6 = "gdvPgwcbfZcqi"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 7
            goto L_0x029b
        L_0x0223:
            java.lang.String r6 = "aqrJjci"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = r8
            goto L_0x029b
        L_0x0232:
            java.lang.String r6 = "cmk`o@pbf}"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 17
            goto L_0x029b
        L_0x0241:
            java.lang.String r6 = "wd`um`qX|`gnSy|nsz"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 30
            goto L_0x029b
        L_0x0250:
            java.lang.String r6 = "oqgmEaJffmZjkhBf~za"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 32
            goto L_0x029b
        L_0x025f:
            java.lang.String r6 = "cicmc`PnlleXxlzj"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 22
            goto L_0x029b
        L_0x026e:
            java.lang.String r6 = "p`wpaRce^`o|"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 28
            goto L_0x029b
        L_0x027d:
            java.lang.String r6 = "aeKmbj"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = r11
            goto L_0x029b
        L_0x028b:
            java.lang.String r6 = "st`pgwoemVk{|Rok"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 12
            goto L_0x029b
        L_0x029a:
            r5 = r10
        L_0x029b:
            switch(r5) {
                case 0: goto L_0x051e;
                case 1: goto L_0x051a;
                case 2: goto L_0x048e;
                case 3: goto L_0x0489;
                case 4: goto L_0x045f;
                case 5: goto L_0x0458;
                case 6: goto L_0x044f;
                case 7: goto L_0x042d;
                case 8: goto L_0x0426;
                case 9: goto L_0x03e6;
                case 10: goto L_0x03dd;
                case 11: goto L_0x03d2;
                case 12: goto L_0x03af;
                case 13: goto L_0x0387;
                case 14: goto L_0x037c;
                case 15: goto L_0x0371;
                case 16: goto L_0x035a;
                case 17: goto L_0x0353;
                case 18: goto L_0x034c;
                case 19: goto L_0x0345;
                case 20: goto L_0x0340;
                case 21: goto L_0x0339;
                case 22: goto L_0x0332;
                case 23: goto L_0x032d;
                case 24: goto L_0x0326;
                case 25: goto L_0x0321;
                case 26: goto L_0x031c;
                case 27: goto L_0x0315;
                case 28: goto L_0x0310;
                case 29: goto L_0x030b;
                case 30: goto L_0x0304;
                case 31: goto L_0x02f4;
                case 32: goto L_0x02e0;
                case 33: goto L_0x02b2;
                case 34: goto L_0x02a0;
                default: goto L_0x029e;
            }
        L_0x029e:
            goto L_0x0523
        L_0x02a0:
            java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r4)
            java.lang.String r6 = "MDVKKAYDDFYN"
            java.lang.String r6 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r6)
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r5, (java.lang.String) r6)
            r21.mo20460f()
            goto L_0x0523
        L_0x02b2:
            java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r4)
            java.lang.String r6 = "MDVKKAY@M]UEMYGYUNAZ@PITMJNTQBZ^t`"
            java.lang.String r6 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r6)
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r5, (java.lang.String) r6)
            com.bytedance.sdk.openadsdk.core.e.n r5 = r0.f9611q
            if (r5 == 0) goto L_0x0523
            java.lang.String r5 = r5.mo19601D()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0523
            java.lang.String r5 = "d`vb"
            java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)
            com.bytedance.sdk.openadsdk.core.e.n r6 = r0.f9611q
            java.lang.String r6 = r6.mo19601D()
            r3.put(r5, r6)
            goto L_0x0523
        L_0x02e0:
            java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r4)
            java.lang.String r6 = "MDVKKAYHXLDTC]KAOPVLXTXSHX]^CQWQkr"
            java.lang.String r6 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r6)
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r5, (java.lang.String) r6)
            org.json.JSONObject r5 = r1.f9639d
            r0.mo20452c((org.json.JSONObject) r5)
            goto L_0x0523
        L_0x02f4:
            java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r4)
            java.lang.String r6 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r9)
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r5, (java.lang.String) r6)
            r21.m12204u()
            goto L_0x0523
        L_0x0304:
            org.json.JSONObject r5 = r1.f9639d
            r0.m12183g((org.json.JSONObject) r5)
            goto L_0x0523
        L_0x030b:
            r21.m12202s()
            goto L_0x0523
        L_0x0310:
            r21.m12201r()
            goto L_0x0523
        L_0x0315:
            org.json.JSONObject r5 = r1.f9639d
            r0.m12184h((org.json.JSONObject) r5)
            goto L_0x0523
        L_0x031c:
            r0.m12167a((com.bytedance.sdk.openadsdk.core.C3728w.C3738a) r1, (org.json.JSONObject) r3)
            goto L_0x0523
        L_0x0321:
            r0.m12197p(r3)
            goto L_0x0523
        L_0x0326:
            org.json.JSONObject r5 = r1.f9639d
            r0.m12195o(r5)
            goto L_0x0523
        L_0x032d:
            r0.m12190k(r3)
            goto L_0x0523
        L_0x0332:
            org.json.JSONObject r5 = r1.f9639d
            r0.m12189j((org.json.JSONObject) r5)
            goto L_0x0523
        L_0x0339:
            org.json.JSONObject r5 = r1.f9639d
            r0.m12187i((org.json.JSONObject) r5)
            goto L_0x0523
        L_0x0340:
            r21.m12203t()
            goto L_0x0523
        L_0x0345:
            org.json.JSONObject r5 = r1.f9639d
            r0.m12193n(r5)
            goto L_0x0523
        L_0x034c:
            org.json.JSONObject r5 = r1.f9639d
            r0.m12191l(r5)
            goto L_0x0523
        L_0x0353:
            org.json.JSONObject r5 = r1.f9639d
            r0.mo20454d((org.json.JSONObject) r5)
            goto L_0x0523
        L_0x035a:
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f9602h
            if (r5 == 0) goto L_0x0523
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            if (r5 == 0) goto L_0x0523
            boolean r6 = r5 instanceof com.bytedance.sdk.openadsdk.core.video.p164c.C3685b
            if (r6 == 0) goto L_0x0523
            com.bytedance.sdk.openadsdk.core.video.c.b r5 = (com.bytedance.sdk.openadsdk.core.video.p164c.C3685b) r5
            r5.mo18516K()
            goto L_0x0523
        L_0x0371:
            com.bytedance.sdk.openadsdk.e.c r5 = r0.f9603i
            if (r5 == 0) goto L_0x0523
            org.json.JSONObject r6 = r1.f9639d
            r5.mo20608a(r6)
            goto L_0x0523
        L_0x037c:
            com.bytedance.sdk.openadsdk.e.c r5 = r0.f9603i
            if (r5 == 0) goto L_0x0523
            org.json.JSONObject r6 = r1.f9639d
            r5.mo20610b(r6)
            goto L_0x0523
        L_0x0387:
            r0.f9594K = r11
            com.bytedance.sdk.openadsdk.core.b.d r5 = r0.f9620z
            if (r5 == 0) goto L_0x0394
            boolean r6 = r0.f9586C
            r5.mo18547a(r6)
            goto L_0x0523
        L_0x0394:
            com.bytedance.sdk.openadsdk.e.c r5 = r0.f9603i
            if (r5 == 0) goto L_0x0523
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f9602h
            if (r5 == 0) goto L_0x0523
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            if (r5 == 0) goto L_0x0523
            com.bytedance.sdk.openadsdk.e.c r6 = r0.f9603i
            org.json.JSONObject r7 = r1.f9639d
            java.lang.String r8 = r0.f9593J
            r6.mo20606a(r5, r7, r8)
            goto L_0x0523
        L_0x03af:
            r21.m12208y()
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f9602h
            if (r5 == 0) goto L_0x0523
            java.lang.Object r5 = r5.get()
            r13 = r5
            android.content.Context r13 = (android.content.Context) r13
            if (r13 == 0) goto L_0x0523
            com.bytedance.sdk.openadsdk.e.c r12 = r0.f9603i
            org.json.JSONObject r14 = r1.f9639d
            java.lang.String r15 = r0.f9606l
            int r5 = r0.f9607m
            boolean r6 = r0.f9610p
            r16 = r5
            r17 = r6
            r12.mo20607a(r13, r14, r15, r16, r17)
            goto L_0x0523
        L_0x03d2:
            r0.f9598c = r11
            com.bytedance.sdk.openadsdk.g.e r5 = r0.f9617w
            if (r5 == 0) goto L_0x0523
            r5.mo18488a()
            goto L_0x0523
        L_0x03dd:
            com.bytedance.sdk.openadsdk.g.d r5 = r0.f9618x
            if (r5 == 0) goto L_0x0523
            r5.mo18489a()
            goto L_0x0523
        L_0x03e6:
            android.content.Context r5 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()
            java.lang.String r6 = "atfjk"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x0418
            int r10 = r5.getStreamVolume(r7)
            java.lang.String r5 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Mtqjg%phd|gn,301.1Sfp|yZyw{|yo32\u001eBWQV@HS~FF^AH\u0013"
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r7)
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r5, (java.lang.String) r6)
        L_0x0418:
            if (r10 > 0) goto L_0x041b
            r8 = r11
        L_0x041b:
            java.lang.String r5 = "eof`ewbXe|~n"
            java.lang.String r5 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r5)
            r3.put(r5, r8)
            goto L_0x0523
        L_0x0426:
            org.json.JSONObject r5 = r21.m12196p()
            if (r5 == 0) goto L_0x0523
            goto L_0x045c
        L_0x042d:
            com.bytedance.sdk.openadsdk.g.a r5 = r0.f9616v
            if (r5 == 0) goto L_0x0523
            int r5 = r5.mo19143b()
            com.bytedance.sdk.openadsdk.g.a r6 = r0.f9616v
            int r6 = r6.mo19142a()
            java.lang.String r7 = "whfwl"
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r7)
            r3.put(r7, r5)
            java.lang.String r5 = "hdkdlq"
            java.lang.String r5 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r5)
        L_0x044a:
            r3.put(r5, r6)
            goto L_0x0523
        L_0x044f:
            java.lang.String r5 = "vhgtWqgs}z"
            java.lang.String r5 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r5)
            boolean r6 = r0.f9590G
            goto L_0x044a
        L_0x0458:
            org.json.JSONObject r5 = r0.f9619y
            if (r5 == 0) goto L_0x0523
        L_0x045c:
            r3 = r5
            goto L_0x0523
        L_0x045f:
            org.json.JSONObject r3 = r0.f9614t
            if (r3 == 0) goto L_0x0485
            java.lang.String r5 = "sdvwmka"
            java.lang.String r5 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r5)
            org.json.JSONObject r6 = r21.m12205v()
            r3.put(r5, r6)
            com.bytedance.sdk.openadsdk.core.e.n r3 = r0.f9611q
            if (r3 == 0) goto L_0x0485
            org.json.JSONObject r3 = r0.f9614t
            java.lang.String r5 = "eyvfjvohf"
            java.lang.String r5 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r5)
            com.bytedance.sdk.openadsdk.core.e.n r6 = r0.f9611q
            org.json.JSONObject r6 = r6.mo19648aB()
            r3.put(r5, r6)
        L_0x0485:
            org.json.JSONObject r3 = r0.f9614t
            goto L_0x0523
        L_0x0489:
            r0.m12181f((org.json.JSONObject) r3)
            goto L_0x0523
        L_0x048e:
            org.json.JSONObject r5 = r1.f9639d
            if (r5 == 0) goto L_0x0523
            java.lang.String r6 = "eyvIwjh"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r6)
            org.json.JSONObject r6 = r5.getJSONObject(r6)
            if (r6 == 0) goto L_0x0523
            java.lang.String r7 = "c`vfcjt~"
            java.lang.String r8 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r7)
            boolean r8 = r6.has(r8)
            if (r8 == 0) goto L_0x0523
            java.lang.String r8 = "t`e"
            java.lang.String r9 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r8)
            boolean r9 = r6.has(r9)
            if (r9 == 0) goto L_0x0523
            java.lang.String r9 = "l``fh"
            java.lang.String r10 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r9)
            boolean r10 = r6.has(r10)
            if (r10 == 0) goto L_0x0523
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r7)
            java.lang.String r13 = r6.getString(r7)
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r8)
            r6.getString(r7)
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r9)
            java.lang.String r15 = r6.getString(r7)
            java.lang.String r7 = "v`nva"
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r7)
            long r16 = r5.getLong(r7)
            java.lang.String r7 = "eyvUeisb"
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r7)
            long r18 = r5.getLong(r7)
            java.lang.String r5 = "u`]skiodq"
            java.lang.String r5 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r5)     // Catch:{ Exception -> 0x04fc }
            int r7 = r0.f9609o     // Catch:{ Exception -> 0x04fc }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x04fc }
            r6.putOpt(r5, r7)     // Catch:{ Exception -> 0x04fc }
        L_0x04fc:
            java.lang.String r5 = "cmk`o"
            java.lang.String r5 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r5)
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x050c
            org.json.JSONObject r6 = r0.m12200r(r6)
        L_0x050c:
            r20 = r6
            int r5 = r0.f9607m
            java.lang.String r14 = com.bytedance.sdk.openadsdk.utils.C4014u.m13181a((int) r5)
            com.bytedance.sdk.openadsdk.core.e.n r12 = r0.f9611q
            com.bytedance.sdk.openadsdk.p130b.C3156e.m9184a(r12, r13, r14, r15, r16, r18, r20)
            goto L_0x0523
        L_0x051a:
            r0.m12180e((org.json.JSONObject) r3)
            goto L_0x0523
        L_0x051e:
            int r5 = r1.f9640e
            r0.m12172a((org.json.JSONObject) r3, (int) r5)
        L_0x0523:
            if (r2 != r11) goto L_0x0566
            java.lang.String r5 = r1.f9637b
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0566
            java.lang.String r1 = r1.f9637b
            r0.m12177b((java.lang.String) r1, (org.json.JSONObject) r3)
            com.bytedance.sdk.openadsdk.core.h r1 = com.bytedance.sdk.openadsdk.core.C3524h.m10852d()
            boolean r1 = r1.mo19869s()
            if (r1 == 0) goto L_0x0566
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[KQA)WUWU)|n~~g`~+"
            java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " ecwe8"
            java.lang.String r2 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r2)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            android.util.Log.d(r1, r2)
        L_0x0566:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.mo20438a(com.bytedance.sdk.openadsdk.core.w$a, int):org.json.JSONObject");
    }

    /* renamed from: a */
    public void mo17318a(Message message) {
        if (message != null && message.what == 11 && (message.obj instanceof C3738a)) {
            try {
                mo20438a((C3738a) message.obj, 1);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo16828a(String str) {
    }

    /* renamed from: a */
    public void mo20439a(String str, JSONObject jSONObject) {
        m12179c(str, jSONObject);
    }

    @JProtect
    /* renamed from: a */
    public void mo20440a(JSONObject jSONObject, final C3805c cVar) {
        if (cVar != null) {
            try {
                if (this.f9611q != null) {
                    if (!TextUtils.isEmpty(this.f9606l)) {
                        int e = C4014u.m13219e(this.f9611q);
                        AdSlot x = this.f9611q.mo19754x();
                        C3500o oVar = new C3500o();
                        if (this.f9611q.mo19604G() != null) {
                            oVar.f8660f = 2;
                        }
                        JSONObject ak = this.f9611q.mo19667ak();
                        if (ak == null) {
                            ak = new JSONObject();
                        }
                        if (jSONObject != null) {
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                ak.put(next, jSONObject.opt(next));
                            }
                        }
                        oVar.f8662h = ak;
                        C3578m.m11239f().mo20073a(x, oVar, e, new C3581n.C3582a() {
                            /* renamed from: a */
                            public void mo18544a(int i, String str) {
                                cVar.mo20474a(false, (List<C3498n>) null);
                            }

                            /* renamed from: a */
                            public void mo18545a(C3469a aVar, C3470b bVar) {
                                if (aVar.mo19477b() == null || aVar.mo19477b().isEmpty()) {
                                    cVar.mo20474a(false, (List<C3498n>) null);
                                    bVar.mo19482a(-3);
                                    C3470b.m10407a(bVar);
                                    return;
                                }
                                cVar.mo20474a(true, aVar.mo19477b());
                            }
                        });
                        return;
                    }
                }
                cVar.mo20474a(false, (List<C3498n>) null);
            } catch (Exception e2) {
                C2975l.m8388c(C2931g.g1655274989199dc("TUCm`winlFhainz"), C2931g.g1655274989199dc("gdv#eau'm{xd~"), e2);
            }
        }
    }

    /* renamed from: a */
    public boolean mo20441a(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!C2885g.g1655274989219dc("bxvf`dhdm").equals(uri.getScheme())) {
                return false;
            }
            return f9583g.containsKey(uri.getHost());
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            m12180e(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            m12172a(jSONObject, 0);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public C3728w mo20442b(int i) {
        this.f9607m = i;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        switch(r1) {
            case 91: goto L_0x001b;
            case 92: goto L_0x0000;
            case 93: goto L_0x001b;
            default: goto L_0x001a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = '[';
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.core.C3728w mo20443b(com.bytedance.sdk.component.widget.SSWebView r3) {
        /*
            r2 = this;
        L_0x0000:
            r0 = 93
            r1 = r0
        L_0x0003:
            switch(r0) {
                case 92: goto L_0x000b;
                case 93: goto L_0x0017;
                case 94: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0000
        L_0x0007:
            r0 = 4
            if (r1 > r0) goto L_0x000f
            goto L_0x0000
        L_0x000b:
            switch(r1) {
                case 21: goto L_0x0000;
                case 22: goto L_0x000f;
                case 23: goto L_0x001b;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0017
        L_0x000f:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f9599d = r0
            return r2
        L_0x0017:
            switch(r1) {
                case 91: goto L_0x001b;
                case 92: goto L_0x0000;
                case 93: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0020
        L_0x001b:
            r0 = 94
            r1 = 75
            goto L_0x0003
        L_0x0020:
            r1 = 91
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.mo20443b(com.bytedance.sdk.component.widget.SSWebView):com.bytedance.sdk.openadsdk.core.w");
    }

    /* renamed from: b */
    public C3728w mo20444b(JSONObject jSONObject) {
        this.f9619y = jSONObject;
        return this;
    }

    /* renamed from: b */
    public C3728w mo20445b(boolean z) {
        this.f9590G = z;
        return this;
    }

    /* renamed from: b */
    public void mo20446b() {
        C2582r rVar = this.f9592I;
        if (rVar != null) {
            rVar.mo16606a();
            this.f9592I = null;
        }
    }

    /* renamed from: b */
    public void mo20447b(Uri uri) {
        long j;
        String str;
        JSONObject jSONObject;
        try {
            String host = uri.getHost();
            if (!C2807f.f1655274989236dc("lne\\asci|").equals(host) && !C2807f.f1655274989236dc("ctqwkhYb~ld").equals(host)) {
                if (!C2807f.f1655274989236dc("lne\\asci|V|8").equals(host)) {
                    if (!C2807f.f1655274989236dc("pskueqc").equals(host)) {
                        if (!C2807f.f1655274989236dc("dhqseqeoWdoxlij").equals(host)) {
                            C2975l.m8390d(C2807f.f1655274989236dc("TUCm`winlFhainz"), C2807f.f1655274989236dc("h`lghwSnz3*ecy.bqeq{4fu}t{;trmk"));
                            return;
                        }
                    }
                    m12188j(uri.toString());
                    return;
                }
            }
            String queryParameter = uri.getQueryParameter(C2807f.f1655274989236dc("c`vfcjt~"));
            String queryParameter2 = uri.getQueryParameter(C2807f.f1655274989236dc("t`e"));
            this.f9593J = queryParameter2;
            String queryParameter3 = uri.getQueryParameter(C2807f.f1655274989236dc("l``fh"));
            if (m12185h(queryParameter3)) {
                long j2 = 0;
                try {
                    j = Long.parseLong(uri.getQueryParameter(C2807f.f1655274989236dc("v`nva")));
                } catch (Exception unused) {
                    j = 0;
                }
                try {
                    j2 = Long.parseLong(uri.getQueryParameter(C2807f.f1655274989236dc("eyv\\rdjrm")));
                } catch (Exception unused2) {
                }
                long j3 = j2;
                JSONObject jSONObject2 = null;
                String queryParameter4 = uri.getQueryParameter(C2807f.f1655274989236dc("eyvqe"));
                if (!TextUtils.isEmpty(queryParameter4)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(queryParameter4);
                        try {
                            jSONObject3.putOpt(C2807f.f1655274989236dc("u`]skiodq"), Integer.valueOf(this.f9609o));
                        } catch (Exception unused3) {
                        }
                        jSONObject2 = jSONObject3;
                    } catch (Exception unused4) {
                    }
                }
                if (C2807f.f1655274989236dc("cmk`o").equals(queryParameter3)) {
                    jSONObject2 = m12200r(jSONObject2);
                }
                if (!C2807f.f1655274989236dc("l`lgmkaXxlxmSh|}c").equals(queryParameter3)) {
                    if (!C2807f.f1655274989236dc("l`lgmkaXxlxmS~zndb").equals(queryParameter3)) {
                        str = m12186i(queryParameter2);
                        jSONObject = jSONObject2;
                        C3156e.m9184a(this.f9611q, queryParameter, str, queryParameter3, j, j3, jSONObject);
                    }
                }
                try {
                    jSONObject = new JSONObject();
                    for (String next : uri.getQueryParameterNames()) {
                        try {
                            if (C2807f.f1655274989236dc("eyvqe").equals(next)) {
                                jSONObject.put(C2807f.f1655274989236dc("ae]f|qtfWmkm"), new JSONObject(uri.getQueryParameter(next)).optString(C2807f.f1655274989236dc("ae]f|qtfWmkm")));
                            } else {
                                jSONObject.put(next, uri.getQueryParameter(next));
                            }
                        } catch (Exception unused5) {
                        }
                    }
                    str = this.f9601f;
                    C3156e.m9184a(this.f9611q, queryParameter, str, queryParameter3, j, j3, jSONObject);
                } catch (Exception unused6) {
                }
            }
        } catch (Exception e) {
            C2975l.m8385b(C2807f.f1655274989236dc("TUCm`winlFhainz"), C2807f.f1655274989236dc("h`lgh`Sua)osoh~{y~|)4"), e);
        }
    }

    /* renamed from: b */
    public void mo16831b(String str) {
    }

    /* renamed from: c */
    public C3498n mo20448c() {
        return this.f9611q;
    }

    /* renamed from: c */
    public C3728w mo20449c(String str) {
        this.f9601f = str;
        return this;
    }

    /* renamed from: c */
    public C3728w mo20450c(boolean z) {
        this.f9586C = z;
        return this;
    }

    /* renamed from: c */
    public void mo20451c(int i) {
        C3617j jVar = this.f9613s;
        if (jVar != null) {
            jVar.mo18497b(i);
        }
    }

    /* renamed from: c */
    public void mo20452c(JSONObject jSONObject) {
        WeakReference<Context> weakReference;
        int optInt = jSONObject.optInt(C2933b.b1655274989200dc("l`lgmkaT|pfn"));
        String optString = jSONObject.optString(C2885g.g1655274989219dc("usn"));
        String optString2 = jSONObject.optString(C2885g.g1655274989219dc("f`nofdelW|xg"));
        if (!TextUtils.isEmpty(optString)) {
            if (optInt == 0) {
                if (m12194o() != null) {
                    m12194o().loadUrl(optString);
                }
            } else if (optInt == 1) {
                WeakReference<Context> weakReference2 = this.f9602h;
                if (weakReference2 != null && (weakReference2.get() instanceof Activity)) {
                    C4001k.m13116a((Activity) this.f9602h.get(), optString);
                }
            } else if (optInt == 2 && (weakReference = this.f9602h) != null && (weakReference.get() instanceof Activity) && !C4001k.m13118b((Activity) this.f9602h.get(), optString)) {
                C4001k.m13116a((Activity) this.f9602h.get(), optString2);
            }
        }
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m12189j(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C3728w.this.m12189j(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo20454d(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C3728w.this.mo20454d(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public C3728w mo20453d(String str) {
        this.f9604j = str;
        return this;
    }

    /* renamed from: d */
    public void mo20454d(JSONObject jSONObject) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        String str;
        double d7;
        double d8;
        JSONObject jSONObject2;
        double d9;
        JSONObject jSONObject3 = jSONObject;
        if (jSONObject3 != null) {
            C2975l.m8384b(C2931g.g1655274989199dc("TUCm`winlFhainz"), C2931g.g1655274989199dc("TUCm`winlFhainz/xp|wxpU{qzq^jxpk"));
            try {
                String optString = jSONObject3.optString(C2931g.g1655274989199dc("aeKg"));
                int optInt = jSONObject3.optInt(C2931g.g1655274989199dc("asgbP|vb"), 1);
                String optString2 = jSONObject3.optString(C2931g.g1655274989199dc("cmk`oDtbi]s{i"));
                JSONObject optJSONObject = jSONObject3.optJSONObject(C2931g.g1655274989199dc("cmk`oLhag"));
                double d10 = 0.0d;
                if (optJSONObject != null) {
                    double optDouble = optJSONObject.optDouble(C3166i.i1655274989219dc("dnum[}"), 0.0d);
                    d7 = optJSONObject.optDouble(C3166i.i1655274989219dc("dnum[|"), 0.0d);
                    double optDouble2 = optJSONObject.optDouble(C3166i.i1655274989219dc("uq]{"), 0.0d);
                    double optDouble3 = optJSONObject.optDouble(C3166i.i1655274989219dc("uq]z"), 0.0d);
                    double optDouble4 = optJSONObject.optDouble(C3166i.i1655274989219dc("dnum[qojm"), 0.0d);
                    double optDouble5 = optJSONObject.optDouble(C3166i.i1655274989219dc("uq]wmhc"), 0.0d);
                    double optDouble6 = optJSONObject.optDouble(C3166i.i1655274989219dc("btvwkkY"), 0.0d);
                    double optDouble7 = optJSONObject.optDouble(C3166i.i1655274989219dc("btvwkkY~"), 0.0d);
                    double optDouble8 = optJSONObject.optDouble(C3166i.i1655274989219dc("btvwkkYpam~c"), 0.0d);
                    double optDouble9 = optJSONObject.optDouble(C3166i.i1655274989219dc("btvwkkYom`mcx"), 0.0d);
                    jSONObject2 = optJSONObject.optJSONObject(C3166i.i1655274989219dc("rdawMk`h"));
                    d = optDouble9;
                    d10 = optDouble;
                    d8 = optDouble2;
                    d6 = optDouble4;
                    d5 = optDouble5;
                    d4 = optDouble6;
                    d3 = optDouble7;
                    d2 = optDouble8;
                    str = optString;
                    d9 = optDouble3;
                } else {
                    str = optString;
                    d9 = 0.0d;
                    d8 = 0.0d;
                    d7 = 0.0d;
                    d6 = 0.0d;
                    d5 = 0.0d;
                    d4 = 0.0d;
                    d3 = 0.0d;
                    d2 = 0.0d;
                    d = 0.0d;
                    jSONObject2 = null;
                }
                C3481j a = new C3481j.C3483a().mo19555d((float) d10).mo19553c((float) d7).mo19550b((float) d8).mo19542a((float) d9).mo19552b((long) d6).mo19544a((long) d5).mo19554c((int) d4).mo19556d((int) d3).mo19557e((int) d2).mo19558f((int) d).mo19546a(optString2).mo19545a((SparseArray<C3429c.C3430a>) null).mo19548a(true).mo19551b(optInt).mo19547a(jSONObject2).mo19543a(jSONObject3.optInt(C2931g.g1655274989199dc("cmk`oDtbiJkija}i"), -1)).mo19549a();
                if (this.f9612r != null) {
                    this.f9612r.mo16747a((View) null, optInt, a);
                }
                m12173a(str, optInt, a);
                while (true) {
                    boolean z = true;
                    while (true) {
                        if (z) {
                            return;
                        }
                        if (z || !z) {
                            z = true;
                        }
                    }
                }
            } catch (Exception unused) {
                C2631j jVar = this.f9612r;
                if (jVar != null) {
                    jVar.mo16747a((View) null, -1, (C2618b) null);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo20455d(boolean z) {
        this.f9598c = z;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022 A[LOOP:0: B:5:0x000e->B:12:0x0022, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0012 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0015 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x001d A[SYNTHETIC] */
    /* renamed from: d */
    public boolean mo20456d() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f9611q
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.mo19735o()
            goto L_0x001a
        L_0x0009:
            r0 = 0
        L_0x000a:
            r1 = 73
            r2 = 96
        L_0x000e:
            switch(r1) {
                case 72: goto L_0x001d;
                case 73: goto L_0x0012;
                case 74: goto L_0x0015;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0022
        L_0x0012:
            switch(r2) {
                case 94: goto L_0x000a;
                case 95: goto L_0x0019;
                case 96: goto L_0x0019;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r2) {
                case 55: goto L_0x000a;
                case 56: goto L_0x001a;
                case 57: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x000a
        L_0x0019:
            return r0
        L_0x001a:
            if (r0 == 0) goto L_0x0009
            r0 = 1
        L_0x001d:
            r1 = 74
            r2 = 55
            goto L_0x000e
        L_0x0022:
            r1 = 72
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.mo20456d():boolean");
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            m12193n(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public C3728w mo20457e(String str) {
        this.f9606l = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo20458e() {
        boolean z = this.f9598c;
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
        return z;
    }

    /* renamed from: f */
    public C3728w mo20459f(String str) {
        this.f9608n = str;
        return this;
    }

    /* renamed from: f */
    public void mo20460f() {
        WeakReference<Context> weakReference = this.f9602h;
        if (weakReference != null && (weakReference.get() instanceof Activity) && C4001k.m13117a((Activity) this.f9602h.get())) {
            ((Activity) this.f9602h.get()).finish();
        }
    }

    /* renamed from: g */
    public void mo20461g() {
        C3617j jVar = this.f9613s;
        if (jVar != null) {
            jVar.mo18496b();
            while (true) {
                char c = 15;
                while (true) {
                    switch (c) {
                        case 13:
                        case 14:
                            return;
                        default:
                            c = 14;
                    }
                }
            }
        }
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        m12190k(jSONObject);
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        m12171a(C2927d.d1655274989178dc("gdvWahvki}oBbka"), true);
        try {
            if (this.f9614t != null) {
                this.f9614t.put(C2927d.d1655274989178dc("sdvwmka"), m12205v());
                if (this.f9611q != null) {
                    this.f9614t.put(C2927d.d1655274989178dc("eyvfjvohf"), this.f9611q.mo19648aB());
                }
            }
            m12171a(C2927d.d1655274989178dc("gdvWahvki}oBbka"), false);
            return this.f9614t.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0009 A[LOOP:0: B:1:0x0009->B:13:0x0009, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0020 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[SYNTHETIC] */
    @com.bytedance.JProtect
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20462h() {
        /*
            r3 = this;
            r0 = 0
            com.bytedance.sdk.openadsdk.core.w$8 r1 = new com.bytedance.sdk.openadsdk.core.w$8
            r1.<init>()
            r3.mo20440a((org.json.JSONObject) r0, (com.bytedance.sdk.openadsdk.p171g.C3805c) r1)
        L_0x0009:
            r0 = 94
            r1 = 75
            r2 = 93
        L_0x000f:
            switch(r0) {
                case 92: goto L_0x0015;
                case 93: goto L_0x0018;
                case 94: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0020
        L_0x0013:
            r0 = 4
            goto L_0x0020
        L_0x0015:
            switch(r1) {
                case 21: goto L_0x0020;
                case 22: goto L_0x0020;
                case 23: goto L_0x0020;
                default: goto L_0x0018;
            }
        L_0x0018:
            switch(r1) {
                case 91: goto L_0x0009;
                case 92: goto L_0x0020;
                case 93: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            r1 = 91
            goto L_0x0018
        L_0x0020:
            r0 = r2
            r1 = r0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.mo20462h():void");
    }

    /* renamed from: i */
    public void mo20463i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C2885g.g1655274989219dc("m`vfvlgk"), m12175b(this.f9587D));
            mo20439a(C2885g.g1655274989219dc("m`vfvlgkEl~j"), jSONObject);
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void initRenderFinish() {
        C2975l.m8384b(C2933b.b1655274989200dc("TUCm`winlFhainz"), C2933b.b1655274989200dc("iokwV`hcm{Lbbd}g"));
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                if (C3728w.this.f9595L != null) {
                    C3728w.this.f9595L.mo20535a();
                }
            }
        });
    }

    /* renamed from: j */
    public boolean mo20464j() {
        boolean z = this.f9594K;
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
        return z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0 != 1) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        switch(r3) {
            case 55: goto L_0x001d;
            case 56: goto L_0x000a;
            case 57: goto L_0x001d;
            default: goto L_0x001c;
        };
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo20465k() {
        /*
            r5 = this;
            com.bytedance.sdk.openadsdk.core.e.n r0 = r5.f9611q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x001d
        L_0x0006:
            int r0 = r0.mo19606I()
        L_0x000a:
            r2 = 94
            r3 = 125(0x7d, float:1.75E-43)
            r4 = 95
        L_0x0010:
            switch(r2) {
                case 94: goto L_0x001e;
                case 95: goto L_0x0014;
                case 96: goto L_0x0019;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x000a
        L_0x0014:
            switch(r3) {
                case 94: goto L_0x0027;
                case 95: goto L_0x0018;
                case 96: goto L_0x0027;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0019
        L_0x0018:
            return r1
        L_0x0019:
            switch(r3) {
                case 55: goto L_0x001d;
                case 56: goto L_0x000a;
                case 57: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0023
        L_0x001d:
            return r1
        L_0x001e:
            r2 = 39
            if (r3 != r2) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            r2 = 1
            if (r0 != r2) goto L_0x0027
            return r2
        L_0x0027:
            r2 = r4
            r3 = r2
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3728w.mo20465k():boolean");
    }

    /* renamed from: l */
    public void mo20466l() {
        C3791c cVar = this.f9603i;
        if (cVar != null) {
            cVar.mo20605a();
        }
        if (m12207x()) {
            mo20462h();
        }
    }

    /* renamed from: m */
    public void mo20467m() {
        C3791c cVar = this.f9603i;
        if (cVar != null) {
            cVar.mo20609b();
            char c = '\\';
            while (true) {
                char c2 = 14;
                while (true) {
                    switch (c2) {
                        case 13:
                            break;
                        case 14:
                            break;
                        case 15:
                            switch (c) {
                                case '_':
                                    return;
                            }
                    }
                    c2 = 15;
                    c = '_';
                }
            }
        }
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m12187i(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C3728w.this.m12187i(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
            C2975l.m8391e(C2928e.e1655274989197dc("TUCm`winlFhainz"), "");
        }
    }

    /* renamed from: n */
    public void mo20468n() {
        C3791c cVar = this.f9603i;
        if (cVar != null) {
            cVar.mo20611c();
            while (true) {
                char c = 15;
                while (true) {
                    switch (c) {
                        case 13:
                        case 14:
                            return;
                        default:
                            c = 14;
                    }
                }
            }
        }
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            m12191l(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m12203t();
            } else {
                this.f9600e.post(new Runnable() {
                    public void run() {
                        C3728w.this.m12203t();
                    }
                });
            }
        } catch (Exception unused) {
        }
    }
}
