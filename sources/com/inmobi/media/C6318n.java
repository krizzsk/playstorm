package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C6022eg;
import com.inmobi.media.C6047eu;
import com.inmobi.media.C6286j;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.vungle.warren.model.ReportDBAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.n */
/* compiled from: NativeAdContainer */
public class C6318n implements Application.ActivityLifecycleCallbacks, C6286j {
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final String f15987x = C6318n.class.getSimpleName();

    /* renamed from: A */
    private List<C5901bt> f15988A = new ArrayList();

    /* renamed from: B */
    private C6067fc f15989B;

    /* renamed from: C */
    private int f15990C = -1;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C6318n f15991D;

    /* renamed from: E */
    private C5901bt f15992E = null;

    /* renamed from: F */
    private String f15993F = null;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C6318n f15994G;

    /* renamed from: H */
    private C6357s f15995H;

    /* renamed from: I */
    private final C6286j.C6287a f15996I = new C6286j.C6287a() {
        /* renamed from: a */
        public final void mo35510a() {
            String unused = C6318n.f15987x;
            C6331c e = C6318n.this.mo35565e();
            if (e != null) {
                e.mo34564a();
            }
        }

        /* renamed from: a */
        public final void mo35511a(Object obj) {
            C6331c e;
            if (C6318n.this.mo35572l() != null && (e = C6318n.this.mo35565e()) != null) {
                e.mo34567b();
            }
        }

        /* renamed from: b */
        public final void mo35512b(Object obj) {
            C6331c e = C6318n.this.mo35565e();
            if (e != null) {
                e.mo34571f();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C6229hq f15997J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C5783af<C6318n> f15998K = new C5783af<C6318n>(this) {
        /* renamed from: a */
        public final void mo34435a() {
            if (!C6318n.this.f16009j && C6318n.this.getPlacementType() == 0 && C6318n.this.f16000a.f14937c) {
                String unused = C6318n.f15987x;
                C6318n.m18920a(C6318n.this);
            }
        }
    };

    /* renamed from: L */
    private final C6060f f15999L = new C6060f() {
        /* renamed from: a */
        public final void mo35211a(String str) {
            Context context = (Context) C6318n.this.f16013n.get();
            if (context != null && C6236hs.m18599a(str)) {
                InMobiAdActivity.m23429a((C6337q) null);
                InMobiAdActivity.m23430a(C6318n.this.mo35587t());
                Intent intent = new Intent(context, InMobiAdActivity.class);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", str);
                intent.putExtra(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, C6318n.this.f16003d);
                intent.putExtra("creativeId", C6318n.this.f16004e);
                intent.putExtra("impressionId", C6318n.this.f16002c);
                intent.putExtra("allowAutoRedirection", C6318n.this.f16005f);
                C6227ho.m18540a(context, intent);
            }
        }

        /* renamed from: a */
        public final void mo35210a() {
            C6331c e = C6318n.this.mo35565e();
            if (e != null) {
                e.mo34567b();
            }
        }

        /* renamed from: b */
        public final void mo35212b() {
            C6331c e = C6318n.this.mo35565e();
            if (e != null) {
                e.mo34571f();
            }
        }
    };

    /* renamed from: a */
    protected C5907bx f16000a;

    /* renamed from: b */
    C6125fq f16001b;

    /* renamed from: c */
    public final String f16002c;

    /* renamed from: d */
    public final long f16003d;

    /* renamed from: e */
    public final String f16004e;

    /* renamed from: f */
    public final boolean f16005f;

    /* renamed from: g */
    protected Set<C6002du> f16006g;

    /* renamed from: h */
    protected C6004dw f16007h;

    /* renamed from: i */
    protected boolean f16008i;

    /* renamed from: j */
    public boolean f16009j;

    /* renamed from: k */
    protected boolean f16010k;

    /* renamed from: l */
    public C6318n f16011l;

    /* renamed from: m */
    protected C6331c f16012m;

    /* renamed from: n */
    protected WeakReference<Context> f16013n = new WeakReference<>((Object) null);

    /* renamed from: o */
    WeakReference<Activity> f16014o;

    /* renamed from: p */
    boolean f16015p = false;

    /* renamed from: q */
    public int f16016q = 0;

    /* renamed from: r */
    public boolean f16017r = false;

    /* renamed from: s */
    Intent f16018s = null;

    /* renamed from: t */
    public C6337q f16019t;

    /* renamed from: u */
    public C6337q f16020u;

    /* renamed from: v */
    public byte f16021v;

    /* renamed from: w */
    public final C6022eg.C6026a f16022w = new C6022eg.C6026a() {
        /* renamed from: a */
        public final void mo35152a(View view, boolean z) {
            C6318n.this.mo35561a(z);
        }
    };

    /* renamed from: y */
    private byte f16023y;

    /* renamed from: z */
    private Set<Integer> f16024z = new HashSet();

    /* renamed from: com.inmobi.media.n$c */
    /* compiled from: NativeAdContainer */
    public interface C6331c {
        /* renamed from: a */
        void mo34564a();

        /* renamed from: a */
        void mo34565a(Map<String, String> map);

        /* renamed from: a */
        void mo34566a(boolean z);

        /* renamed from: b */
        void mo34567b();

        /* renamed from: c */
        void mo34568c();

        /* renamed from: d */
        void mo34569d();

        /* renamed from: e */
        void mo34570e();

        /* renamed from: f */
        void mo34571f();

        /* renamed from: g */
        void mo34572g();

        /* renamed from: h */
        void mo34573h();

        /* renamed from: i */
        void mo34574i();
    }

    /* renamed from: a */
    public final void mo35497a() {
    }

    public String getMarkupType() {
        return "inmobiJson";
    }

    public View getVideoContainerView() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo35574n() {
        return false;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* renamed from: com.inmobi.media.n$b */
    /* compiled from: NativeAdContainer */
    public static final class C6330b {
        /* renamed from: a */
        public static C6318n m18993a(Context context, byte b, C5907bx bxVar, String str, Set<C6002du> set, C6125fq fqVar, long j, boolean z, String str2) {
            if (bxVar.mo34901e().contains(ShareConstants.VIDEO_URL)) {
                return new C6332o(context, b, bxVar, str, set, fqVar, j, z, str2);
            }
            return new C6318n(context, b, bxVar, str, set, fqVar, j, z, str2);
        }
    }

    C6318n(Context context, byte b, C5907bx bxVar, String str, Set<C6002du> set, C6125fq fqVar, long j, boolean z, String str2) {
        this.f16023y = b;
        this.f16000a = bxVar;
        this.f16002c = str;
        this.f16003d = j;
        this.f16005f = z;
        this.f16004e = str2;
        mo35558a((C6286j) this);
        this.f16008i = false;
        this.f16009j = false;
        this.f16001b = fqVar;
        if (set != null) {
            this.f16006g = new HashSet(set);
        }
        this.f16000a.f14938d.f14931z = System.currentTimeMillis();
        mo35554a(context);
        this.f16021v = -1;
        this.f15997J = C6229hq.m18582a();
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                C6318n.this.f15997J.mo35434a(C6318n.this.hashCode(), C6318n.this.f15998K);
            }
        });
    }

    public C6286j.C6287a getFullScreenEventsListener() {
        return this.f15996I;
    }

    public byte getPlacementType() {
        return this.f16023y;
    }

    /* renamed from: a */
    public final void mo35554a(Context context) {
        this.f16013n = new WeakReference<>(context);
        C6227ho.m18539a(context, (Application.ActivityLifecycleCallbacks) this);
    }

    /* renamed from: d */
    public final Context mo35564d() {
        return (Context) this.f16013n.get();
    }

    /* renamed from: a */
    public final void mo35558a(C6286j jVar) {
        if (jVar instanceof C6318n) {
            this.f16011l = (C6318n) jVar;
        }
    }

    /* renamed from: e */
    public final C6331c mo35565e() {
        return this.f16012m;
    }

    /* renamed from: a */
    public final void mo35559a(C6331c cVar) {
        this.f16012m = cVar;
    }

    /* renamed from: f */
    public final View mo35566f() {
        C6004dw dwVar = this.f16007h;
        if (dwVar == null) {
            return null;
        }
        return dwVar.mo35120b();
    }

    public C6125fq getAdConfig() {
        return this.f16001b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo35567g() {
        Map<String, String> a = mo35552a((C5901bt) this.f16000a.f14938d);
        mo35498a((byte) 1, a);
        mo35498a((byte) 2, a);
    }

    public C6004dw getViewableAd() {
        Context j = mo35570j();
        if (this.f16007h == null && j != null) {
            mo35567g();
            this.f16007h = new C6020ee(j, this, new C6007dy(this, this.f16019t));
            Set<C6002du> set = this.f16006g;
            if (set != null) {
                for (C6002du next : set) {
                    try {
                        if (next.f15269a == 3) {
                            C6034ek ekVar = (C6034ek) next.f15270b.get("omidAdSession");
                            if (next.f15270b.containsKey("deferred")) {
                                ((Boolean) next.f15270b.get("deferred")).booleanValue();
                            }
                            if (ekVar != null) {
                                if (this.f16021v == 0) {
                                    this.f16007h = new C6039eo(this, this.f16007h, ekVar);
                                } else {
                                    this.f16007h = new C6040ep(this, this.f16007h, ekVar);
                                }
                            }
                        }
                    } catch (Exception e) {
                        C6181gg.m18398a().mo35357a(new C6217hg(e));
                    }
                }
            }
        }
        return this.f16007h;
    }

    /* renamed from: h */
    public final C5907bx mo35568h() {
        return this.f16000a;
    }

    /* renamed from: c */
    public final boolean mo35500c() {
        return this.f16009j;
    }

    public void destroy() {
        if (!this.f16009j) {
            this.f16009j = true;
            this.f15990C = -1;
            C6318n nVar = this.f15991D;
            if (nVar != null) {
                nVar.mo35499b();
            }
            this.f16009j = true;
            this.f16012m = null;
            C6067fc y = m18941y();
            if (y != null) {
                C6047eu euVar = y.f15435b;
                for (C6047eu.C6050a aVar : euVar.f15382a) {
                    aVar.f15390a.cancel();
                }
                euVar.f15382a.clear();
                y.mo35222a();
            }
            this.f15989B = null;
            this.f15988A.clear();
            C6004dw dwVar = this.f16007h;
            if (dwVar != null) {
                dwVar.mo35122d();
                this.f16007h.mo35123e();
            }
            m18942z();
            this.f16013n.clear();
            WeakReference<Activity> weakReference = this.f16014o;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f16000a = null;
            this.f16019t = null;
            C6318n nVar2 = this.f15994G;
            if (nVar2 != null) {
                nVar2.destroy();
                this.f15994G = null;
            }
            this.f15997J.mo35433a(hashCode());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo35569i() {
        return getPlacementType() == 0 && mo35572l() != null;
    }

    /* renamed from: j */
    public final Context mo35570j() {
        return (1 == getPlacementType() || mo35569i()) ? mo35572l() : (Context) this.f16013n.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo35571k() {
        return this.f16008i;
    }

    /* renamed from: a */
    private C5901bt m18914a(C5901bt btVar, C5907bx bxVar, String str) {
        if (C6236hs.m18597a((Context) this.f16013n.get(), str)) {
            return btVar;
        }
        String[] split = str.split("\\|");
        C5901bt b = bxVar.mo34896b(split[0]);
        if (b == null) {
            return m18924b(bxVar.f14940f, btVar);
        }
        if (b.equals(btVar)) {
            return null;
        }
        if (1 == split.length || 2 == split.length) {
            b.f14904m = 1;
            return b;
        }
        b.f14904m = C5907bx.m17659a(split[2]);
        return b;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte m18913a(java.lang.String r6) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r0)
            java.lang.String r6 = r6.trim()
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 1
            r4 = 3
            r5 = 2
            switch(r0) {
                case -934641255: goto L_0x0053;
                case -934524953: goto L_0x0049;
                case 0: goto L_0x003f;
                case 3127582: goto L_0x0035;
                case 3443508: goto L_0x002b;
                case 3532159: goto L_0x0021;
                case 110066619: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x005d
        L_0x0017:
            java.lang.String r0 = "fullscreen"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = 6
            goto L_0x005e
        L_0x0021:
            java.lang.String r0 = "skip"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = r5
            goto L_0x005e
        L_0x002b:
            java.lang.String r0 = "play"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = 7
            goto L_0x005e
        L_0x0035:
            java.lang.String r0 = "exit"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = r1
            goto L_0x005e
        L_0x003f:
            java.lang.String r0 = ""
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = r3
            goto L_0x005e
        L_0x0049:
            java.lang.String r0 = "replay"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = r2
            goto L_0x005e
        L_0x0053:
            java.lang.String r0 = "reload"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = r4
            goto L_0x005e
        L_0x005d:
            r6 = -1
        L_0x005e:
            switch(r6) {
                case 2: goto L_0x0067;
                case 3: goto L_0x0066;
                case 4: goto L_0x0066;
                case 5: goto L_0x0065;
                case 6: goto L_0x0064;
                case 7: goto L_0x0063;
                default: goto L_0x0061;
            }
        L_0x0061:
            r6 = 0
            return r6
        L_0x0063:
            return r1
        L_0x0064:
            return r2
        L_0x0065:
            return r3
        L_0x0066:
            return r4
        L_0x0067:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6318n.m18913a(java.lang.String):byte");
    }

    /* renamed from: a */
    public final void mo35557a(C5901bt btVar, boolean z) {
        C5901bt b;
        C5988dm f;
        if (this.f16000a.f14944j && !this.f16009j && (b = m18924b(this.f16000a, btVar)) != null) {
            Map<String, String> a = mo35552a(b);
            b.f14900i = btVar.f14900i;
            if (ShareConstants.VIDEO_URL.equals(b.f14893b) || b.f14899h) {
                byte b2 = b.f14900i;
                C6004dw dwVar = this.f16007h;
                if (dwVar != null) {
                    dwVar.mo35116a((byte) 4);
                }
                if (b2 != 0) {
                    String str = b.f14909r;
                    if (2 == b.f14904m && (f = ((C5923cg) b).mo34920b().mo35112f()) != null && f.f15217e != null && !f.f15217e.trim().isEmpty()) {
                        str = f.f15217e;
                    }
                    if (!C6236hs.m18597a(m18912A(), str)) {
                        str = b.f14910s;
                        if (!C6236hs.m18597a(m18912A(), str)) {
                            return;
                        }
                    }
                    String a2 = C6239hv.m18610a(str, a);
                    if (!this.f16017r || z) {
                        m18917a(b, b2, a2);
                        return;
                    }
                    C6318n i = m18936i(this);
                    if (i != null) {
                        C6331c cVar = i.f16012m;
                        if (cVar != null) {
                            if (1 != b2 || !C6236hs.m18599a(a2)) {
                                cVar.mo34572g();
                            } else {
                                cVar.mo34568c();
                            }
                        }
                        this.f15992E = b;
                        this.f15993F = a2;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo35553a(int i, C5901bt btVar) {
        if (!this.f16024z.contains(Integer.valueOf(i)) && !this.f16009j) {
            mo35603v();
            m18916a(i, (C5903bv) btVar);
        }
    }

    public void setFullScreenActivityContext(Activity activity) {
        this.f16014o = new WeakReference<>(activity);
    }

    /* renamed from: l */
    public final Activity mo35572l() {
        WeakReference<Activity> weakReference = this.f16014o;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    /* renamed from: v */
    private void mo35603v() {
        C5903bv a = this.f16000a.mo34894a(0);
        if (!this.f16024z.contains(0) && a != null) {
            m18916a(0, a);
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo35552a(C5901bt btVar) {
        C5907bx bxVar;
        HashMap hashMap = new HashMap(3);
        if (!this.f16009j && (bxVar = this.f16000a) != null) {
            hashMap.put("$LTS", String.valueOf(bxVar.f14938d.f14931z));
            C5903bv a = C5907bx.m17665a(btVar);
            long currentTimeMillis = System.currentTimeMillis();
            if (!(a == null || 0 == a.f14931z)) {
                currentTimeMillis = a.f14931z;
            }
            hashMap.put("$STS", String.valueOf(currentTimeMillis));
            hashMap.put("$TS", String.valueOf(System.currentTimeMillis()));
            hashMap.putAll(this.f16000a.mo34895a());
        }
        return hashMap;
    }

    /* renamed from: b */
    private static void m18926b(C5901bt btVar, Map<String, String> map) {
        if (btVar != null) {
            btVar.mo34877a("page_view", map);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35561a(boolean z) {
        if (z) {
            m18939w();
        } else {
            m18940x();
        }
    }

    /* renamed from: b */
    static C5919ce m18925b(View view) {
        if (view != null) {
            return (C5919ce) view.findViewWithTag("timerView");
        }
        return null;
    }

    /* renamed from: c */
    protected static void m18929c(View view) {
        C5919ce b = m18925b(view);
        if (b != null) {
            b.mo34909b();
        }
    }

    /* renamed from: d */
    protected static void m18931d(View view) {
        C5919ce b = m18925b(view);
        if (b != null && b.f14986c != null && !b.f14986c.isRunning()) {
            b.f14986c.setCurrentPlayTime(b.f14985b);
            b.f14986c.start();
        }
    }

    /* renamed from: w */
    private void m18939w() {
        C6067fc y = m18941y();
        if (y != null) {
            y.f15435b.mo35182a();
        }
    }

    /* renamed from: x */
    private void m18940x() {
        C6067fc y = m18941y();
        if (y != null) {
            y.f15435b.mo35184b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo35573m() {
        final C6318n i = m18936i(this);
        if (i != null) {
            C6331c cVar = i.f16012m;
            if (cVar != null) {
                cVar.mo34568c();
            }
            this.f15997J.mo35434a(hashCode(), new C5783af<C6318n>(this) {
                /* renamed from: a */
                public final void mo34435a() {
                    if (C6318n.this.f15991D == null) {
                        C6318n.m18920a(C6318n.this);
                    }
                    int a = InMobiAdActivity.m23427a((C6286j) C6318n.this.f15991D);
                    Intent intent = new Intent((Context) C6318n.this.f16013n.get(), InMobiAdActivity.class);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", a);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR);
                    if (C6318n.this.f16017r) {
                        C6318n.this.f16018s = intent;
                    } else {
                        C6227ho.m18540a((Context) C6318n.this.f16013n.get(), intent);
                    }
                }

                /* renamed from: b */
                public final void mo34437b() {
                    super.mo34437b();
                    C6331c e = i.mo35565e();
                    if (e != null) {
                        e.mo34564a();
                    }
                }
            });
        }
    }

    /* renamed from: o */
    public final void mo35575o() {
        if (mo35574n()) {
            this.f16015p = true;
            C6331c cVar = this.f16012m;
            if (cVar != null && this.f16000a.f14941g != null) {
                cVar.mo34565a(this.f16000a.f14941g);
            }
        }
    }

    /* renamed from: a */
    private void mo35594a(C5923cg cgVar) {
        C5988dm f = cgVar.mo34920b().mo35112f();
        if (f != null && f.f15218g) {
            for (C5922cf a : f.mo35093a("closeEndCard")) {
                C5923cg.m17642a(a, mo35552a((C5901bt) cgVar));
            }
            f.f15218g = false;
        }
    }

    /* renamed from: i */
    private static C6318n m18936i(C6318n nVar) {
        C6318n nVar2;
        while (nVar != null) {
            if (nVar.mo35572l() != null || nVar == (nVar2 = nVar.f16011l)) {
                return nVar;
            }
            nVar = nVar2;
        }
        return null;
    }

    /* renamed from: y */
    private C6067fc m18941y() {
        C6064fb fbVar;
        C6004dw dwVar = this.f16007h;
        if (dwVar == null) {
            fbVar = null;
        } else {
            fbVar = (C6064fb) dwVar.mo35115a();
        }
        if (fbVar != null) {
            this.f15989B = fbVar.f15428b;
        }
        return this.f15989B;
    }

    /* renamed from: a */
    private void m18917a(C5901bt btVar, byte b, String str) {
        if (1 == b) {
            m18927b(str);
        } else {
            m18922a(str, btVar.f14910s, btVar);
        }
    }

    /* renamed from: a */
    private void m18922a(String str, String str2, C5901bt btVar) {
        String a;
        C6318n i;
        if (this.f16013n.get() != null && (a = C6236hs.m18595a((Context) this.f16013n.get(), str, str2)) != null && (i = m18936i(this)) != null) {
            C6331c cVar = i.f16012m;
            if (cVar != null && !this.f16017r) {
                cVar.mo34572g();
            }
            if (a.equals(str2)) {
                btVar.mo34877a("TRACKER_EVENT_TYPE_FALLBACK_URL", mo35552a(btVar));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        com.inmobi.media.C6236hs.m18601b(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0038 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18927b(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r3.f16013n
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            android.app.Activity r1 = r3.mo35572l()
            if (r1 != 0) goto L_0x0018
            com.inmobi.media.n$c r1 = r3.f16012m
            if (r1 == 0) goto L_0x0018
            r1.mo34568c()
        L_0x0018:
            java.lang.String r1 = com.inmobi.media.C6209h.m18477a(r0)
            com.inmobi.media.fq r2 = r3.getAdConfig()     // Catch:{ Exception -> 0x0038 }
            boolean r2 = r2.cctEnabled     // Catch:{ Exception -> 0x0038 }
            if (r1 == 0) goto L_0x0032
            if (r2 != 0) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            com.inmobi.media.co r1 = new com.inmobi.media.co     // Catch:{ Exception -> 0x0038 }
            com.inmobi.media.f r2 = r3.f15999L     // Catch:{ Exception -> 0x0038 }
            r1.<init>(r4, r0, r2)     // Catch:{ Exception -> 0x0038 }
            r1.mo34925b()     // Catch:{ Exception -> 0x0038 }
            return
        L_0x0032:
            com.inmobi.media.f r1 = r3.f15999L     // Catch:{ Exception -> 0x0038 }
            r1.mo35211a(r4)     // Catch:{ Exception -> 0x0038 }
            return
        L_0x0038:
            com.inmobi.media.C6236hs.m18601b(r0, r4)     // Catch:{ URISyntaxException -> 0x003b }
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6318n.m18927b(java.lang.String):void");
    }

    /* renamed from: z */
    private void m18942z() {
        Context context = (Context) this.f16013n.get();
        if (context instanceof Activity) {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public void onActivityStarted(Activity activity) {
        Context A = m18912A();
        if (A != null && A.equals(activity)) {
            mo35583p();
        }
    }

    /* renamed from: p */
    public final void mo35583p() {
        this.f16010k = false;
        m18931d(mo35566f());
        m18939w();
        C6004dw dwVar = this.f16007h;
        if (dwVar != null) {
            dwVar.mo35117a(m18912A(), (byte) 0);
        }
    }

    public void onActivityStopped(Activity activity) {
        Context A = m18912A();
        if (A != null && A.equals(activity)) {
            mo35584q();
        }
    }

    /* renamed from: A */
    private Context m18912A() {
        Activity l = mo35572l();
        return l == null ? (Context) this.f16013n.get() : l;
    }

    /* renamed from: q */
    public void mo35584q() {
        this.f16010k = true;
        m18929c(mo35566f());
        m18940x();
        C6004dw dwVar = this.f16007h;
        if (dwVar != null) {
            dwVar.mo35117a(m18912A(), (byte) 1);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C6004dw dwVar = this.f16007h;
        if (dwVar != null) {
            dwVar.mo35117a(activity, (byte) 2);
        }
        m18942z();
    }

    /* renamed from: r */
    public final void mo35585r() {
        C5901bt btVar = this.f15992E;
        if (btVar != null && this.f15993F != null) {
            m18917a(btVar, btVar.f14900i, this.f15993F);
        } else if (this.f16018s != null && this.f16013n.get() != null) {
            C6227ho.m18540a((Context) this.f16013n.get(), this.f16018s);
        }
    }

    /* renamed from: s */
    public final void mo35586s() {
        new C6329a(this).start();
    }

    /* renamed from: com.inmobi.media.n$a */
    /* compiled from: NativeAdContainer */
    final class C6329a extends Thread {

        /* renamed from: b */
        private WeakReference<C6318n> f16037b;

        C6329a(C6318n nVar) {
            this.f16037b = new WeakReference<>(nVar);
        }

        public final void run() {
            if (C6318n.this.mo35572l() == null) {
                String unused = C6318n.f15987x;
                return;
            }
            C6318n nVar = (C6318n) this.f16037b.get();
            if (nVar != null && !nVar.f16009j) {
                try {
                    C5907bx h = nVar.mo35568h();
                    if (C6318n.this.mo35572l() != null) {
                        if (h.f14939e.length() != 0) {
                            String unused2 = C6318n.f15987x;
                            JSONObject b = h.mo34897b();
                            if (b != null) {
                                C5907bx bxVar = new C5907bx((int) C6318n.this.getPlacementType(), b, h, C6318n.this.getPlacementType() == 0, C6318n.this.getAdConfig());
                                if (bxVar.mo34900d()) {
                                    C6318n a = C6330b.m18993a(C6318n.this.mo35572l(), (byte) 0, bxVar, C6318n.this.f16002c, (Set<C6002du>) null, C6318n.this.f16001b, C6318n.this.f16003d, C6318n.this.f16005f, C6318n.this.f16004e);
                                    String unused3 = C6318n.f15987x;
                                    a.mo35558a((C6286j) nVar);
                                    a.f16019t = nVar.f16019t;
                                    nVar.f15994G = a;
                                    return;
                                }
                                String unused4 = C6318n.f15987x;
                                return;
                            }
                            return;
                        }
                    }
                    String unused5 = C6318n.f15987x;
                } catch (Exception e) {
                    String unused6 = C6318n.f15987x;
                    C6181gg.m18398a().mo35357a(new C6217hg(e));
                }
            }
        }
    }

    /* renamed from: t */
    public final C6357s mo35587t() {
        if (this.f15995H == null) {
            this.f15995H = new C6357s() {
                /* renamed from: a */
                public final void mo34464a() {
                    C6331c e = C6318n.this.mo35565e();
                    if (e != null) {
                        e.mo34564a();
                    }
                }

                /* renamed from: a_ */
                public final void mo34610a_(C6337q qVar) {
                    C6331c e = C6318n.this.mo35565e();
                    if (e != null) {
                        e.mo34567b();
                    }
                }

                /* renamed from: b_ */
                public final void mo34616b_(C6337q qVar) {
                    C6331c e = C6318n.this.mo35565e();
                    if (e != null) {
                        e.mo34571f();
                    }
                }

                /* renamed from: a */
                public final void mo34488a(HashMap<Object, Object> hashMap) {
                    C6331c e = C6318n.this.mo35565e();
                    if (e != null) {
                        e.mo34570e();
                    }
                }

                /* renamed from: a_ */
                public final void mo34495a_() {
                    C6331c e = C6318n.this.mo35565e();
                    if (e != null) {
                        e.mo34572g();
                    }
                }

                /* renamed from: d_ */
                public final void mo35589d_() {
                    C6331c e = C6318n.this.mo35565e();
                    if (e != null && C6318n.this.getPlacementType() == 0) {
                        e.mo34568c();
                    }
                }

                /* renamed from: c_ */
                public final C6305jh mo34515c_() {
                    return C6305jh.m18842a();
                }
            };
        }
        return this.f15995H;
    }

    /* renamed from: a */
    public final void mo35498a(byte b, Map<String, String> map) {
        if (!this.f16009j) {
            if (b == 1) {
                this.f16000a.f14938d.mo34877a("load", map);
            } else if (b == 2) {
                this.f16000a.f14938d.mo34877a("client_fill", map);
            }
        }
    }

    /* renamed from: a */
    private void m18916a(int i, C5903bv bvVar) {
        if (!this.f16009j) {
            this.f16024z.add(Integer.valueOf(i));
            bvVar.f14931z = System.currentTimeMillis();
            if (this.f16008i) {
                m18926b((C5901bt) bvVar, mo35552a((C5901bt) bvVar));
            } else {
                this.f15988A.add(bvVar);
            }
        }
    }

    /* renamed from: b */
    private C5901bt m18924b(C5907bx bxVar, C5901bt btVar) {
        C5901bt btVar2 = null;
        if (bxVar == null) {
            return null;
        }
        String str = btVar.f14909r;
        String str2 = btVar.f14910s;
        if (str != null) {
            btVar2 = m18914a(btVar, bxVar, str);
        }
        return (btVar2 != null || str2 == null) ? btVar2 : m18914a(btVar, bxVar, str2);
    }

    /* renamed from: a */
    public static C5901bt m18915a(C5907bx bxVar, C5901bt btVar) {
        while (bxVar != null) {
            String str = btVar.f14901j;
            if (str == null || str.length() == 0) {
                btVar.f14903l = 0;
                return btVar;
            }
            String[] split = str.split("\\|");
            if (1 == split.length) {
                btVar.f14903l = m18913a(split[0]);
                return btVar;
            }
            C5901bt b = bxVar.mo34896b(split[0]);
            if (b == null) {
                bxVar = bxVar.f14940f;
            } else if (b.equals(btVar)) {
                return null;
            } else {
                b.f14903l = m18913a(split[1]);
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo35556a(View view, C5901bt btVar) {
        C6331c cVar;
        if (!this.f16009j) {
            mo35603v();
            C5901bt b = m18924b(this.f16000a, btVar);
            if (b != null) {
                Map<String, String> a = mo35552a(b);
                m18918a(b, a);
                if (!b.equals(btVar)) {
                    m18918a(btVar, a);
                }
            } else {
                m18918a(btVar, mo35552a(btVar));
            }
            C6318n i = m18936i(this);
            if (i != null) {
                if (!btVar.f14909r.trim().isEmpty() && (cVar = i.f16012m) != null) {
                    cVar.mo34570e();
                }
                C5901bt a2 = m18915a(this.f16000a, btVar);
                if (a2 != null) {
                    if (view != null && ShareConstants.VIDEO_URL.equals(a2.f14893b) && 5 == a2.f14903l) {
                        view.setVisibility(4);
                        btVar.f14915x = 4;
                    }
                    mo35562b(a2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo35555a(View view) {
        C6331c cVar;
        if (!this.f16008i && !this.f16009j) {
            this.f16008i = true;
            this.f16000a.f14938d.mo34877a("Impression", mo35552a((C5901bt) this.f16000a.f14938d));
            mo35603v();
            for (C5901bt next : this.f15988A) {
                m18926b(next, mo35552a(next));
            }
            this.f15988A.clear();
            this.f16007h.mo35116a((byte) 0);
            C6318n i = m18936i(this);
            if (i != null && (cVar = i.f16012m) != null) {
                cVar.mo34569d();
            }
        }
    }

    /* renamed from: a */
    private static void m18918a(C5901bt btVar, Map<String, String> map) {
        if (2 == btVar.f14904m) {
            C5988dm f = ((C5923cg) btVar).mo34920b().mo35112f();
            if (f == null || (f.f15217e == null && btVar.f14909r != null)) {
                btVar.mo34877a("click", map);
            } else if (f.f15216d.size() > 0) {
                for (C5922cf a : f.mo35093a("click")) {
                    C5901bt.m17642a(a, map);
                }
            }
        } else {
            btVar.mo34877a("click", map);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo35562b(C5901bt btVar) {
        C6102fk fkVar;
        byte b = btVar.f14903l;
        if (b == 0) {
            return;
        }
        if (b == 1) {
            try {
                if (this.f16019t != null) {
                    this.f16019t.mo35620d("window.imraid.broadcastEvent('close');");
                }
                mo35499b();
            } catch (Exception e) {
                C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            }
        } else if (b == 3) {
            try {
                if (this.f16019t != null) {
                    this.f16019t.mo35620d("window.imraid.broadcastEvent('replay');");
                }
                if (mo35566f() != null) {
                    View f = mo35566f();
                    ViewGroup viewGroup = (ViewGroup) f.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(f);
                    }
                }
                C6318n nVar = this.f16011l;
                C5919ce b2 = m18925b(nVar.mo35566f());
                if (!(b2 == null || b2.f14986c == null || !b2.f14986c.isRunning())) {
                    b2.f14986c.setCurrentPlayTime(b2.f14984a * 1000);
                    b2.mo34908a(1.0f);
                }
                if (ShareConstants.VIDEO_URL.equals(btVar.f14893b) && (nVar instanceof C6332o) && (fkVar = (C6102fk) nVar.getVideoContainerView()) != null) {
                    C6089fj videoView = fkVar.getVideoView();
                    C5923cg cgVar = (C5923cg) videoView.getTag();
                    if (cgVar != null) {
                        if (cgVar.mo34919a()) {
                            videoView.mo35275i();
                        } else {
                            videoView.mo35274h();
                        }
                    } else if (1 == getPlacementType()) {
                        videoView.mo35275i();
                    } else {
                        videoView.mo35274h();
                    }
                    mo35594a(cgVar);
                    videoView.start();
                }
            } catch (Exception e2) {
                C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error in replaying video");
                C6181gg.m18398a().mo35357a(new C6217hg(e2));
            }
        } else if (b == 4) {
            try {
                if (getPlacementType() == 0) {
                    mo35573m();
                }
            } catch (Exception e3) {
                C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error in launching fullscreen ad");
                C6181gg.m18398a().mo35357a(new C6217hg(e3));
            }
        } else if (b != 5) {
            this.f16015p = true;
            C6337q qVar = this.f16019t;
            if (!(qVar == null || qVar == null)) {
                qVar.mo35620d("window.imraid.broadcastEvent('skip');");
            }
            m18929c(mo35566f());
            mo35563c(btVar);
        }
    }

    /* renamed from: b */
    public final void mo35499b() {
        C6318n i;
        Activity activity;
        C6102fk fkVar;
        try {
            if (!this.f16009j && (i = m18936i(this)) != null) {
                i.mo35575o();
                InMobiAdActivity.m23431a((Object) i);
                if ((i instanceof C6332o) && (fkVar = (C6102fk) ((C6332o) i).getVideoContainerView()) != null) {
                    C6089fj videoView = fkVar.getVideoView();
                    C5923cg cgVar = (C5923cg) videoView.getTag();
                    cgVar.f14913v.put("seekPosition", Integer.valueOf(videoView.getCurrentPosition()));
                    cgVar.f14913v.put("lastMediaVolume", Integer.valueOf(videoView.getVolume()));
                    if (cgVar.f14916y != null) {
                        ((C5923cg) cgVar.f14916y).mo34918a(cgVar);
                    }
                    mo35594a(cgVar);
                }
                if (i.f16014o == null) {
                    activity = null;
                } else {
                    activity = (Activity) i.f16014o.get();
                }
                if (activity instanceof InMobiAdActivity) {
                    ((InMobiAdActivity) activity).f19389b = true;
                    activity.finish();
                    if (this.f15990C != -1) {
                        activity.overridePendingTransition(0, this.f15990C);
                    }
                }
                this.f16011l.f15991D = null;
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        C6318n.this.f16011l.f15997J.mo35434a(C6318n.this.f16011l.hashCode(), C6318n.this.f16011l.f15998K);
                    }
                });
            }
        } catch (Exception e) {
            C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }

    /* renamed from: a */
    public final void mo35560a(C6337q qVar) {
        if (this.f16021v == 0 && this.f16020u == null && this.f16019t == null) {
            this.f16020u = qVar;
        }
    }

    /* renamed from: c */
    public final void mo35563c(C5901bt btVar) {
        C5988dm f;
        C6318n nVar = this.f15994G;
        if (nVar == null || mo35566f() == null) {
            C6238hu.m18605a((byte) 2, "InMobi", "Failed to show end card");
            mo35499b();
            return;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) mo35566f();
            View a = nVar.getViewableAd().mo35114a((View) null, viewGroup, false);
            if (a != null) {
                viewGroup.addView(a);
                a.setClickable(true);
                nVar.m18939w();
                if ((btVar instanceof C5923cg) && (f = ((C5923cg) btVar).mo34920b().mo35112f()) != null) {
                    f.f15218g = true;
                    return;
                }
                return;
            }
            mo35499b();
        } catch (Exception e) {
            mo35499b();
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }

    public /* bridge */ /* synthetic */ Object getDataModel() {
        return this.f16000a;
    }

    /* renamed from: a */
    static /* synthetic */ void m18920a(C6318n nVar) {
        JSONObject b;
        C6318n nVar2 = nVar;
        C5907bx bxVar = nVar2.f16000a;
        if (bxVar.f14939e.length() != 0 && (b = bxVar.mo34897b()) != null) {
            C5907bx bxVar2 = new C5907bx((int) nVar.getPlacementType(), b, bxVar, nVar.getPlacementType() == 0, nVar.getAdConfig());
            bxVar2.f14937c = bxVar.f14937c;
            bxVar2.f14944j = bxVar.f14944j;
            Context context = (Context) nVar2.f16013n.get();
            if (bxVar2.mo34900d() && context != null) {
                C6318n a = C6330b.m18993a(context, (byte) 0, bxVar2, nVar2.f16002c, nVar2.f16006g, nVar2.f16001b, nVar2.f16003d, nVar2.f16005f, nVar2.f16004e);
                nVar2.f15991D = a;
                a.mo35558a((C6286j) nVar2);
                C6331c cVar = nVar2.f16012m;
                if (cVar != null) {
                    nVar2.f15991D.f16012m = cVar;
                }
                if (bxVar.f14937c) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            C6318n.this.f15991D.getViewableAd().mo35114a((View) null, new RelativeLayout(C6318n.this.mo35570j()), false);
                        }
                    });
                }
            }
        }
    }
}
